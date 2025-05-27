/**
 * A searchable schedule web app for Hilliard U, The Big Think, etc.
 * version 1.45 - May 2024
 * 
  - split categories
  - eLearning URLs automatic anchors
  - Smarter object parsing
  - FIX for empty sessions
  - Bootstrap collapse instead of summary/details
  - doesn't require node.js
  - loads saved data from localStorage
  - has two fail-safes: 1. load from localStorage, and 2. load from JSON
  - IE support
  - datetime
 *
 * Utilites:
 * - To export to JSON use exportAsJson(exportObj, exportFilenameString). Example, exportAsJson(myList, "summerAcademySessions2020")
 * - checkForUniqueIds()
 *
 * Inspiration: https://twitter.com/hello_anwen/status/996048755228135430
 *
 * @author Justin Riley
 * @version 1.45
 * @since 2018-05-16
 *
 */
var simpleViewColumnWidths = [5, 12, 14, 25, 20, 29];
var detailedViewColumnWidths = [5, 9, 9, 20, 15, 19, 28];
var paddingRight = "pr-3";
//var myList,fullList;
var simpleViewBool = true;
var savedViewBool = false;
var searchViewBool = false;
var LOCAL_STORAGE = "localSessionList";
var myTable = document.getElementById("excelDataTable");
var searchTextbox = document.getElementById("searchText");
var sortByDropdown = document.getElementById("sortBy-select");
var categoryDropdown = document.getElementById("category-select");
var startTimeDropdown = document.getElementById("startTime-select");
var bestForDropdown = document.getElementById("bestFor-select");
var showAllRadio = document.getElementById("showAllRadio");
var savedOnlyRadio = document.getElementById("savedOnlyRadio");
var simpleRadioArray = document.getElementsByClassName("simpleRadio");
var detailedRadioArray = document.getElementsByClassName("detailedRadio");

// Adds a header row to the table and returns the set of columns.
// Need to do union of keys from all records as some records may not contain
// all records.
function addAllColumnHeaders(someArray, selector) {
  //var columnSet = [];
  var headerTr$ = $("<tr/>");

  //columnSet.push("Save");
  headerTr$.append(
    $(
      "<td class='cell small text-center' style='width:" +
        simpleViewColumnWidths[0] +
        "%'>"
    ).html("♡")
  );
  //columnSet.push("Session Time");
  var postSaveHeaders$ = $(
    "<td class='cell' style='width:" +
      (100 - simpleViewColumnWidths[0]) +
      "%' >"
  );
  
  if (simpleViewBool) {
    postSaveHeaders$.append(
      $(
        "<div class='cell small' style='width:" +
          simpleViewColumnWidths[1] +
          "%' />"
      ).html("Date")
    );
    postSaveHeaders$.append(
      $(
        "<div class='cell small' style='width:" +
          simpleViewColumnWidths[2] +
          "%' />"
      ).html("Time")
    );
  } else {
    postSaveHeaders$.append(
      $(
        "<div class='cell small' style='width:" +
          detailedViewColumnWidths[1] +
          "%' />"
      ).html("Date")
    );
    postSaveHeaders$.append(
      $(
        "<div class='cell small' style='width:" +
          detailedViewColumnWidths[2] +
          "%' />"
      ).html("Time")
    );
  }

  //columnSet.push("Session Title");
  if (simpleViewBool) {
    postSaveHeaders$.append(
      $(
        "<div class='cell small' style='width:" +
          simpleViewColumnWidths[3] +
          "%' />"
      ).html(
        "Title <small class='faded' style='font-size:11px'>(click for description)</small>"
      )
    );
  } else {
    postSaveHeaders$.append(
      $(
        "<div class='cell small' style='width:" +
          detailedViewColumnWidths[3] +
          "%' />"
      ).html(
        "Title <small class='faded' style='font-size:11px'>(click for description)</small>"
      )
      // headerTr$.append(
      // $("<th />").html(
      //   "Title <small class='faded' style='font-size:11px'>(click for description)</small>"
      // )
    );
  }
  //columnSet.push("Session Description");
  //columnSet.push("Presenter(s)");
  var presenterWidth = 45;
  if (simpleViewBool) {
    postSaveHeaders$.append(
      $(
        "<div class='cell small' style='width:" +
          simpleViewColumnWidths[4] +
          "%' />"
      ).html("Presenter(s)")
    );
  } else {
    presenterWidth = 27;
    postSaveHeaders$.append(
      $(
        "<div class='cell small' style='width:" +
          detailedViewColumnWidths[4] +
          "%' />"
      ).html("Presenter(s)")
    );
    // headerTr$.append($("<th  />").html("Presenter(s)"));
  }

  //columnSet.push(SESSION_ROOM);

  //if(dropdown0.value === "Detailed"){
  if (simpleViewBool == false) {
    //postSaveHeaders$.append($("<div class='cell' style='width:10%' />").html("Room"));
    //columnSet.push("Primary Focus");
    //postSaveHeaders$.append($("<div class='cell' style='width:15%' />").html("Category"));
    //columnSet.push("Session Audience");
    postSaveHeaders$.append(
      $(
        "<div class='cell small' style='width:" +
          detailedViewColumnWidths[5] +
          "%' />"
      ).html("Best For")
    );
    //headerTr$.append($("<th/>").html("Level"));
    //headerTr$.append($("<th/>").html("Seats"));
    // columnSet.push(PRESENTER_ORGANIZATION);
    // headerTr$.append($("<th/>").html("Organization"));
    // columnSet.push("Prerequisites/Materials Needed");
    // headerTr$.append($("<th/>").html("Materials"));
    // columnSet.push("Level of Learner");
    // headerTr$.append($("<th/>").html("Level"));
    // columnSet.push("Likes");
    // headerTr$.append($("<th/>").html("Likes"));
  }

  postSaveHeaders$.append(
    $("<div class='cell small' style='' />").html("Location")
  );

  //headerTr$.append($("</th></tr></table></tr>"));
  $(headerTr$).append(postSaveHeaders$);
  $(selector).append(headerTr$);
}

function buildDropDowns() {
  //build drop-downs
  allCategories.sort();
  //console.log(allCategories);
  allBestFor.sort();
  //console.log(allBestFor);
  allTimes.sort();
  //console.log(allTimes);

  // categories
  var option = "";
  for (var i = 0; i < allCategories.length; i++) {
    option +=
      '<option value="' +
      allCategories[i] +
      '">' +
      allCategories[i] +
      "</option>";
  }
  option += '<option value="false">Show All Categories</option>';
  $("#category-select").append(option);

  // best for
  option = "";
  for (var i = 0; i < allBestFor.length; i++) {
    option +=
      '<option value="' + allBestFor[i] + '">' + allBestFor[i] + "</option>";
  }
  $("#bestFor-select").append(option);

  // all times
  option = "";
  for (var i = 0; i < allTimes.length; i++) {
    var tempTime = militaryTo12Hour(allTimes[i]);
    option += '<option value="' + allTimes[i] + '">' + tempTime + "</option>";
  }
  option += '<option value="false">Show All Times</option>';
  $("#startTime-select").append(option);
}

// Builds the HTML Table out of someArray.
function buildHtmlTable(selector, someArray) {
  var searchCounter = 0;
  myTable.innerHTML = ""; // erase entire table
  addAllColumnHeaders(someArray, selector); // create header row
  if (searchViewBool) {
    // display 0 results if 0 results
    document.getElementById("alertText").innerHTML =
      '"' +
      searchTextbox.value +
      '" &nbsp; <small class="text-monospace text-black-50">' +
      searchCounter +
      " results</small>";
  }
  for (var rowNumber = 0; rowNumber < someArray.length; rowNumber++) {
    // loop through myList
    if (savedViewBool && !someArray[rowNumber]["save"]) {
      // skip session if in savedView and session is not saved
      continue;
    } else {
      // not in savedView or savedView + not saved
      if (searchViewBool && !checkIfObjectContainsQuery(someArray[rowNumber])) {
        // skip session if searching and session doesn't contain search
        continue;
      } else {
        // either not searching OR saved OR
        if (searchViewBool) {
          // if we are searching and this session DOES contain search, +1 results
          searchCounter++;
          document.getElementById("alertText").innerHTML =
            '"' +
            searchTextbox.value +
            '" &nbsp; <small class="text-monospace text-black-50">' +
            searchCounter +
            " results</small>";
        }
        buildOneRow(someArray[rowNumber], rowNumber, selector);
      }
    }
  }
}

function buildOneRow(someObj, rowNumber, selector) {
  var row$ = $("<tr/>");
  // build the row in 5 easy steps
  // tableStep 0, save button
  var cellValues = [];
  cellValues.push(
    '<div class="form-inline justify-content-center pt-2"><label><input class="mt-1" type="checkbox" onmouseover="searchText.blur()" value=' +
      rowNumber +
      ' onclick="saveSession(' +
      rowNumber +
      ',this.checked)" '
  );
  //if (savedViewBool) {
  if (someObj["save"]) {
    // check the save box if already saved
    cellValues.push("checked");
  }
  cellValues.push("></label></div>");
  row$.append(
    $(
      "<td class='cell' style='width:" + simpleViewColumnWidths[0] + "%' />"
    ).html(cellValues.join(""))
  ); // end tableStep 0

  // var clickable$ = $(
  //   '<td class="cell clickable" style="width:' +
  //     (100 - simpleViewColumnWidths[0]) +
  //     '%" data-toggle="collapse" data-target="#collapse' +
  //     rowNumber +
  //     '" aria-controls="collapse' +
  //     rowNumber +
  //     '" >'
  // );
   var clickable$ = $(
    '<td class="cell clickable" style="width:' +
      (100 - simpleViewColumnWidths[0]) +
      '%" >'
  );
  var summary$ = $('<div class="cell summaryDiv py-2" style="width:100%">');

  // tableStep 1 = combine the Time & Room
  cellValues = [];
  //var timeArray = this.time.split(" ");
  //console.log(this.title+" "+(militaryTime(timeArray[2]).split(":")[0] - militaryTime(timeArray[0]).split(":")[0]))
  //if(militaryTime(timeArray[2]).split(":")[0] - militaryTime(timeArray[0]).split(":")[0] == 1){
  //  cellValues.push(timeArray[0]+" "+this.room)
  //}else{
  //  cellValues.push(this.time+" "+this.room)
  //}
  
  cellValues.push("" + someObj[DISPLAY_DATE] + " &nbsp; ");
  if (simpleViewBool) {
    summary$.append(
      $(
        '<div class="cell '+paddingRight+'" style="width:' +
          simpleViewColumnWidths[1] +
          '%" data-toggle="collapse" data-target="#collapse' +
          rowNumber +
          '">'
      ).html(cellValues.join(""))
    );
  } else {
    summary$.append(
      $(
        '<div class="cell '+paddingRight+'" style="width:' +
          detailedViewColumnWidths[1] +
          '%" data-toggle="collapse" data-target="#collapse' +
          rowNumber +
          '">'
      ).html(cellValues.join(""))
    );
  }

  cellValues = [];
  if (simpleViewBool) {
    
    // combine time and room
    //cellValues.push("<small>")
    if (someObj.hasOwnProperty(DISPLAY_TIME)) {
      cellValues.push("" + someObj[DISPLAY_TIME]);
    } else {
      cellValues.push("Time TBD");
    }
    summary$.append(
      $(
        '<div class="cell '+paddingRight+'" style="width:' +
          simpleViewColumnWidths[2] +
          '%" data-toggle="collapse" data-target="#collapse' +
          rowNumber +
          '">'
      ).html(cellValues.join(""))
    );
    // if (someObj.hasOwnProperty(SESSION_ROOM)) {
    //   cellValues.push(", " + someObj[SESSION_ROOM]);
    // } else {
    //   cellValues.push(", Room TBD");
    // }
    //cellValues.push("</small>")
  } else {
    // time only
    if (someObj.hasOwnProperty(DISPLAY_TIME)) {
      cellValues.push("" + someObj[DISPLAY_TIME]);
    } else {
      cellValues.push("Time TBD");
    }
    summary$.append(
      $(
        '<div class="cell '+paddingRight+'" style="width:' +
          detailedViewColumnWidths[2] +
          '%" data-toggle="collapse" data-target="#collapse' +
          rowNumber +
          '">'
      ).html(cellValues.join(""))
    );
  }
  // end step 1

  // tableStep 2 = Title
  let titleWidth = 25;
  if (simpleViewBool) {
    titleWidth = 40;
  }
  cellValues = [];
  cellValues.push(
    '<div class="heading' +
      rowNumber +
      '"> <a href="#" class="text-dark" style="text-decoration: underline;" data-toggle="collapse" data-target="#collapse' +
      rowNumber +
      '" aria-expanded="false" aria-controls="collapse' +
      rowNumber +
      '">'
  );
  cellValues.push(someObj[SESSION_TITLE]);
  cellValues.push("</a> </div>");
  //console.log(cellValues)
  if (simpleViewBool === true) {
    summary$.append(
      $(
        '<div/ class="cell '+paddingRight+'" style="width:' +
          simpleViewColumnWidths[3] +
          '%" data-toggle="collapse" data-target="#collapse' +
          rowNumber +
          '">'
      ).html(cellValues.join(""))
    );
  } else {
    summary$.append(
      $(
        '<div/ class="cell '+paddingRight+'" style="width:' +
          detailedViewColumnWidths[3] +
          '%" data-toggle="collapse" data-target="#collapse' +
          rowNumber +
          '">'
      ).html(cellValues.join(""))
    );
  }

  // end step 2

  // tableStep 3
  cellValues = [];
  // simple tableStep 3 = Presenters
  if (simpleViewBool === true) {
    // cellValues.push('<a href="#" class="text-dark" data-toggle="collapse" data-target="#collapse'+rowNumber+'">'
    //                 +this.teachers
    //                +'</a>');

    var presenterWidth = 45;
    cellValues.push(someObj[SESSION_PRESENTERS]);
    summary$.append(
      $(
        '<div/ class="cell '+paddingRight+'" style="width:' +
          simpleViewColumnWidths[4] +
          '%" data-toggle="collapse" data-target="#collapse' +
          rowNumber +
          '">'
      ).html(cellValues.join(""))
    );
  } else {
    // detailed tableStep 3
    cellValues.push(someObj[SESSION_PRESENTERS]);
    var presenterWidth = 27;
    summary$.append(
      $(
        '<div class="cell '+paddingRight+'" style="width:' +
          detailedViewColumnWidths[4] +
          '%" data-toggle="collapse" data-target="#collapse' +
          rowNumber +
          '">'
      ).html(cellValues.join(""))
    );

    // cellValues = someObj[SESSION_ROOM]; //room
    // summary$.append(
    //   $(
    //     '<div class="cell '+paddingRight+'" style="width:10%" data-toggle="collapse" data-target="#collapse' +
    //       rowNumber +
    //       '">'
    //   ).html(cellValues)
    // );
    // cellValues = someObj[SESSION_CATEGORY]; //category
    // summary$.append(
    //   $(
    //     '<div class="cell '+paddingRight+'" style="width:15%" data-target="#collapse' +
    //       rowNumber +
    //       '">'
    //   ).html(cellValues)
    // );
    cellValues = someObj[BEST_FOR]; //best for
    summary$.append(
      $(
        '<div class="cell '+paddingRight+'" style="width:' +
          detailedViewColumnWidths[5] +
          '%" data-toggle="collapse" data-target="#collapse' +
          rowNumber +
          '">'
      ).html(cellValues)
    );
    //cellValues = this[LEVEL]; //level
    //row$.append($('<td/>').html(cellValues));
    // cellValues = this.seats; //seats
    // row$.append($('<td/ data-toggle="collapse" data-target="#collapse'+rowNumber+'">').html(cellValues));
  }
  if(someObj["zoomLink"].toLowerCase() != "n/a"){
    cellValues = [someObj["zoomLink"]];
  }else{
    cellValues = [someObj["location"]," ", someObj["roomnumber"]];
  }
  
  if (simpleViewBool === true) {
    summary$.append(
      $(
        '<div class="cell '+paddingRight+'" style="width:' +
          simpleViewColumnWidths[5] +
          '%" data-toggle="collapse" data-target="#collapse' +
          rowNumber +
          '">'
      ).html(cellValues.join(""))
    );
  } else {
    summary$.append(
      $(
        '<div/ class="cell '+paddingRight+'" style="width:' +
          detailedViewColumnWidths[6] +
          '%" data-toggle="collapse" data-target="#collapse' +
          rowNumber +
          '">lkjsf<small>'
      ).html(cellValues.join(""))
    );
  }
  //row$.append($('</td></tr></table></td></tr>'));
  summary$.append($("<br>"));

  // Step 4: collapse
  // var details$ = $(
  //   '<div id="collapse' +
  //     rowNumber +
  //     '" class="collapse card-body" aria-controls="collapse' +
  //     rowNumber +
  //     '" >'
  // );
  var details$ = $(
    '<div id="collapse' +
      rowNumber +
      '" class="collapse card-body" >'
  );
  cellValues = [];
  // cellValues.push(
  //   '<div class="card-body">'
  // );
  cellValues.push(someObj[SESSION_DESCRIPTION] + "<br><small>");

  // cellValues.push("<details><summary><b>"+this.title+"</b></summary>"+this.description+"<br><small>");
  if (this.bring) {
    cellValues.push(
      "<span class='text-primary'> <ins>Please Bring</ins>: " +
        someObj[BRING] +
        " </span> &nbsp;"
    );
  }
  cellValues.push("<ins>Date</ins>: " + someObj[DISPLAY_DATE] + " &nbsp; ");
  cellValues.push("<ins>Time</ins>: ");
  if (someObj.hasOwnProperty(DISPLAY_TIME)) {
    cellValues.push("" + someObj[DISPLAY_TIME]);
  } else {
    cellValues.push("Time TBD");
  }
  cellValues.push(" &nbsp; ");
  cellValues.push("<ins>Location</ins>: "+someObj[SESSION_LOCATION]+" &nbsp; ");
  cellValues.push("<ins>Room</ins>: ");
  if (someObj.hasOwnProperty(SESSION_ROOM)) {
    cellValues.push("" + someObj[SESSION_ROOM]);
  } else {
    cellValues.push("Room TBD");
  }
  cellValues.push(" &nbsp; ");
  cellValues.push("<ins>Video Conference</ins>: "+someObj[ZOOM_LINK]+" &nbsp; ");
  cellValues.push(
    "<ins>Category</ins>: " + someObj[SESSION_CATEGORY] + " &nbsp; "
  );
  cellValues.push("<ins>Best For</ins>: " + someObj[BEST_FOR] + " &nbsp; ");
  //cellValues.push("<ins>Level</ins>: "+this[LEVEL]+" &nbsp; ");
  //cellValues.push("<ins>Seats</ins>: "+this.seats);
  //cellValues.push("</small></details>");

  cellValues.push("</small></div>");
  details$.append($('<div class="pb-3">').html(cellValues.join(""))); // end step 2

  $(clickable$).append(summary$);
  $(clickable$).append(details$);
  //$(accordian$).append(clickable$);
  $(row$).append(clickable$);
  $(selector).append(row$);
}

function checkForSaved() {
  var result = [];
  for (var i = 0; i < myList.length; i++) {
    for (var key in myList[i]) {
      //for(var key = 0; key < myList[i].length; key++){
      if (myList[i]["save"]) {
        result.push(myList[i]);
        break;
      }
    }
  }
  if (savedViewBool && result.length < 1) {
    $("#savedOnlyModal").modal("show");
    // alert("No sessions have been saved. Click the \"Save box\" next to a session you plan to attend, then click \"Saved Only\" to see your schedule.")
    setTimeout(function() {
      document.getElementById("showAllRadio").checked = true;
    }, 150);
    savedViewBool = false;
    buildHtmlTable("#excelDataTable", myList);
  } else {
    buildHtmlTable("#excelDataTable", myList);
  }
}

function checkAllFilters() {
  var filterAlertBoxText = [];
  resetMyList();
  if (startTimeDropdown.value != "false") {
    filterByStartTime();
    filterAlertBoxText.push(startTimeDropdown.value.replace(/\s/g, "")); // remove all spaces
  }
  if (categoryDropdown.value != "false") {
    filterByCategory();
    filterAlertBoxText.push(categoryDropdown.value);
  }
  if (bestForDropdown.value != "false") {
    filterByBestFor();
    filterAlertBoxText.push(bestForDropdown.value);
  }
  if (filterAlertBoxText.length > 0) {
    document.getElementById("myTitle").style.display = "none";
    document.getElementById("filterAlertBox").style.display = "inline-block";
    document.getElementById(
      "filterAlertText"
    ).innerHTML = filterAlertBoxText.join(", ");
  } else {
    document.getElementById("filterAlertBox").style.display = "none";
    if (!searchViewBool)
      document.getElementById("myTitle").style.display = "inline-block";
  }
  buildHtmlTable("#excelDataTable", myList);
}

function checkForUniqueIds() {
  var tempCounter = 0;
  for (var i = 0; i < myList.length; i++) {
    for (var j = i + 1; j < myList.length; j++) {
      if (myList[i]["uniqueId"] == myList[j]["uniqueId"]) {
        tempCounter++;
        console.log(myList[i]["uniqueId"]);
      }
    }
  }
  if (tempCounter == 0) {
    console.log("All Ids Are Unique!");
  }
}

function checkIfObjectContainsQuery(thisObj) {
  for (var key in thisObj) {
    // must use a for...in loop
    if (typeof thisObj[key] === "string") {
      if (
        thisObj[key].toLowerCase().indexOf(searchTextbox.value.toLowerCase()) !=
        -1
      ) {
        return true;
      }
    }
  }
  return false;
}

function clearFilters() {
  document.getElementById("filterAlertBox").style.display = "none";
  categoryDropdown.selectedIndex = 0;
  bestForDropdown.selectedIndex = 0;
  startTimeDropdown.selectedIndex = 0;
  if (searchViewBool) {
    resetMyList();
    jsonSearch();
  } else {
    document.getElementById("myTitle").style.display = "inline-block";
    resetMyList();
    buildHtmlTable("#excelDataTable", myList);
  }
}

function clearSearch() {
  resetMyList();
  searchTextbox.value = "";
  jsonSearch();
  $(".navbar-collapse").collapse("hide");
  $("#searchText").blur();
}

function filterByBestFor() {
  var thisFilter = bestForDropdown.value;
  if (thisFilter === "false") {
    return;
  }
  myList = myList.filter(function(obj) {
    return obj[BEST_FOR].toLowerCase().indexOf(thisFilter.toLowerCase()) != -1;
  });
}

function filterByCategory() {
  var thisFilter = categoryDropdown.value;
  if (thisFilter == "false") {
    return;
  }
  myList = myList.filter(function(obj) {
    return (
      obj[SESSION_CATEGORY].toString().toLowerCase().indexOf(thisFilter.toLowerCase()) !=
      -1
    );
  });
}

function filterByStartTime() {
  var thisFilter = startTimeDropdown.value;
  if (thisFilter == "false") {
    return;
  }
  myList = myList.filter(function(obj) {
    if (!obj.hasOwnProperty(MILITARY_TIME)) {
      return 0;
    }
    return obj[MILITARY_TIME].indexOf(thisFilter) >= 0;
  });
}


function jsonSearch() {
  if (searchTextbox.value.length > 0) {
    searchViewBool = true;
    savedViewBool = false;
    showAllRadio.checked = true;
    savedOnlyRadio.checked = false;
    //document.getElementById("myTitle").style.display = "none";
    //document.getElementById("myTitle").style.visibility = "hidden";
    document.getElementById("alertBox").style.display = "block";
    document.getElementById("alertText").innerHTML =
      '"' + searchTextbox.value + '" ';
  } else {
    searchViewBool = false;
    document.getElementById("alertBox").style.display = "none";
    //document.getElementById("myTitle").style.display = "inline-block";
  }
  checkAllFilters();
  buildHtmlTable("#excelDataTable", myList);
}

function resetMyList() {
  myList = fullList; //reset myList
}

// save this session to localStorage
function saveSession(sessionIndex, checkedOrNot) {
  myList[sessionIndex]["save"] = checkedOrNot;
  localStorage.setItem(LOCAL_STORAGE, JSON.stringify(myList));
  localStorage.setItem("simpleViewBool", simpleViewBool.toString());
}

// toggle show all / saved only
function setSavedView(myBool) {
  if (myBool) {
    clearSearch();
  }
  savedViewBool = myBool;
  showAllRadio.checked = !myBool;
  savedOnlyRadio.checked = myBool;
  if (!searchViewBool) {
    checkForSaved();
  }
  $(".navbar-collapse").collapse("hide");
  $("#searchText").blur();
  setTimeout(function() {
    showAllRadio.checked = !myBool;
    savedOnlyRadio.checked = myBool;
  }, 50);
}

// toggle simple / detailed
function setSimpleView(myBool) {
  simpleViewBool = myBool;
  localStorage.setItem("simpleViewBool", myBool);
  for (var i = 0; i < simpleRadioArray.length; i++) {
    simpleRadioArray[i].checked = myBool;
  }
  for (var i = 0; i < detailedRadioArray.length; i++) {
    detailedRadioArray[i].checked = !myBool;
  }
  buildHtmlTable("#excelDataTable", myList);
  $(".navbar-collapse").collapse("hide");
  $("#searchText").blur();
  setTimeout(function() {
    for (var i = 0; i < simpleRadioArray.length; i++) {
      simpleRadioArray[i].checked = myBool;
    }
    for (var i = 0; i < detailedRadioArray.length; i++) {
      detailedRadioArray[i].checked = !myBool;
    }
  }, 50);
}

function sortBy() {
  var someKey = sortByDropdown.value;
  var newList = [];
  if (someKey === DATE_TIME) {
    // sort by sessiontime, then by session title
    newList = sortByDateTime();
  } else {
    newList = myList.sort(function(a, b) {
      return a[someKey].localeCompare(b[someKey]);
    });
  }
  //downloadObjectAsJson(newList,"sessions");
  buildHtmlTable("#excelDataTable", newList);
  $(".navbar-collapse").collapse("hide");
  $("#searchText").blur();
}

function sortByDateTime() {
  // sort by datetime, then by session title
  var newList = [];
  newList = myList.sort(function(a, b) {
    if (!a.hasOwnProperty("datetime")) {
      return 1;
    }
    if (!b.hasOwnProperty("datetime")) {
      return -1;
    }
    
    if (a["datetime"] === b["datetime"]) {
      
      return a["sessiontitle"].localeCompare(b["sessiontitle"]);
    }
    return a["datetime"]-b["datetime"];
    //return a["datetime"].localeCompare(b["datetime"]);

  });
  return newList;
}

function sortByMilitaryTime() {
  // sort by date, then sessiontime, then by session title
  var newList = [];
  newList = myList.sort(function(a, b) {
    if (!a.hasOwnProperty("militarytime")) {
      return 1;
    }
    if (!b.hasOwnProperty("militarytime")) {
      return -1;
    }
    //compare date
    if (a["date"] === b["date"]) {
      if (a["militarytime"] === b["militarytime"]) {
        return a["sessiontitle"].localeCompare(b["sessiontitle"]);
      }
      return a["militarytime"].localeCompare(b["militarytime"]);
      //return a[someKey].localeCompare(b[someKey]);
    }
    return a["date"].localeCompare(b["date"]);
  });
  return newList;
}

searchTextbox.addEventListener("keyup", function(event) {
  // Cancel the default action, if needed
  event.preventDefault();
  // Number 13 is the "Enter" key on the keyboard
  if (event.keyCode === 13) {
    $(".navbar-collapse").collapse("hide");
    $("#searchText").blur();
  }
});

$("form").submit(function(event) {
  event.preventDefault();
});

document.onkeydown = function(e) {
  switch (e.keyCode) {
    case 13: // enter
      jsonSearch();
      break;
  }
};

// tooltips
// $(document).ready(function(){
//   $('[data-toggle="tooltip"]').tooltip();
// });
