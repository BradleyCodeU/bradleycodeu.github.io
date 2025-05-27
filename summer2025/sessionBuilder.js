/**
 * sessionBuilder version 1.451 - May 2022
 * to get spreadsheetUrl...
 * click File > Share > Publish To Web > Entire Document, Web page, Automatically republish when changes are made
 * Utilites:
 * - To export to JSON use exportAsJson(exportObj, exportFilenameString).
 *   Example, exportAsJson(myList, "summerAcademySessions2022")
 * - checkForUniqueIds()
 */
//var sheetsIDNumber = '1S7Q7Jeg0sXWE0are--oLODTiD0XKxrLwD6Ova05y4dM'
//var sheetsIDNumber = '1ozvePd8enJ_HBHcl9aJAgfIlXiG2EV2tWFPguxESoRk';
//var sheetsIDNumber = "15BQtFLolkgdlzCMuMJ4xSLSyxSpZu5h6sBD7r2Nq3e4";
//var sheetsIDNumber = "17My546mdf8h6yW8LRIJn4G7mnyriUaID0bsDrfyFUo0";
//var sheetsIDNumber = "15jaRb0-dtUi6daj3ETxL3thznpwa_byO3NiO05OiTIo";
//var sheetsIDNumber = "1j332ZIDT1d8SFNuQyEYxn9NEwRJRlOj2kXT1CCsNpYI";
//var sheetsIDNumber = "1PK7ILmgiBVev0bWiprzYaDH-CwVchHR4FyUGMfu15bs";
//var sheetsIDNumber = "1CGeEKp5DDKntPcRuC7PFtK1BPKS4dLLoMdeAH9cPu68";
//var sheetsIDNumber = "1D97q_QeigOZZb9vxAh8aLWbdqse3dV-xPNBnfp6hkM8";
//var sheetsIDNumber = "1uYR13n_q9dueYYxojjPvNxjlGnzWWUimo-XPBFjB6xg";
var sheetsIDNumber = "15Z8XLwMjNf9OI41NG88yZRF2ktqHKwJT_RcIXP-mKks";
var BACKUP_JSON_FILE = "summerSessions2025.json";
var spreadsheetSetup = {
  // 0 = col A
  uniqueId: 0,
  // 1 = col B
  // 2 = col C

  // 3 = col D
  displayDate: 3,
  // 4 = col E
  date: 4,

  // 5 = col F
  displayTime: 5,
  // 6 = col G
  sessionTime: 6,
  //roomNumber:

  // 7 = col H
  sessionTeacher: 7,
  // 8 = col I
  sessionTitle: 8,

  // 9 = col J

  // 10 = col K
  zoomLink: 10,
  

  // 11 = col L
  location:11,

  // 12 = col M
  roomNumber:12,

  // 13 = col N
  sessionDescription: 13,
  //bestFor: 13,

  //datetime:14

  //bring:15,
  // 14 = col O
  sessionCategory: 14,
  
  // 15 = col P
  bestFor: 15
  // 17 = col R
};
// var spreadsheetUrl =
//   "https://spreadsheets.google.com/feeds/cells/" +
//   sheetsIDNumber +
//   "/1/public/values?alt=json-in-script&callback=constructSessionsFromGSheet";
// var spreadsheetUrl =
//   "https://spreadsheets.google.com/feeds/cells/" +
//   sheetsIDNumber +
//   "/1/values?alt=json-in-script&callback=constructSessionsFromGSheet";
//var spreadsheetUrl = "https://docs.google.com/spreadsheets/d/1CGeEKp5DDKntPcRuC7PFtK1BPKS4dLLoMdeAH9cPu68/gviz/tq?tqx=out:json&callback=constructSessionsFromGSheet"
// var sheetId = '1dzx8QSiBQFcUOQTPa_uI64OCGQqESWtrq6EwqOVngZw';
// var base = 'https://docs.google.com/spreadsheets/d/${sheetId}/gviz/tq?';
// var sheetName = '1233963711';
// var query = encodeURIComponent('Select *')
var spreadsheetUrl =
  "https://docs.google.com/spreadsheets/d/" +
  sheetsIDNumber +
  "/gviz/tq?tqx=out:json";
var myList = [];
var fullList = [];
var allCategories = [];
var allBestFor = [];
var allTimes = [];
// spreadsheet column names
var UNIQUE_ID = "uniqueId";
var SESSION_TIME = "sessiontime";
var DISPLAY_TIME = "display_time";
var SESSION_ROOM = "roomnumber";
var SESSION_CATEGORY = "sessioncategory";
var SESSION_PRESENTERS = "sessionteacher(s)";
var SESSION_TITLE = "sessiontitle";
var SESSION_DESCRIPTION = "sessiondescription";
var BEST_FOR = "bestfor";
var LEVEL = "leveloflearner";
var SEATS = "seats";
var BRING = "bringwithyou";
var MILITARY_TIME = "militarytime";
var DATE = "date";
var DISPLAY_DATE = "display_date";
var DATE_TIME = "datetime";
var SESSION_LOCATION = "location";
var ZOOM_LINK = "zoomLink";
// var PRESENTER_ORGANIZATION = "organization";
//var COLUMNS_PER_ROW = 11; // number of columns per row

document.addEventListener("DOMContentLoaded", init);
function handleErrors(response) {
  if (!response.ok) {
    if (window.localStorage.getItem(LOCAL_STORAGE)) {
      console.log("local storage");
      console.log(
        "fetchError: Fail-safe 1. Loading sessions from localStorage"
      );
      myList = JSON.parse(window.localStorage.getItem(LOCAL_STORAGE));
      buildDropDowns();
      sortBy();
    } else {
      console.log("local storage not found");
      console.log("fetchError: Fail-safe 2. Loading sessions from JSON ");
      fetch(BACKUP_JSON_FILE)
        .then((response) => {
          return response.json();
        })
        .then((rep) => {
          loadBackup(rep);
        });
    }
  }
  return response;
}

function loadBackup(rep) {
  console.log("loadBackup");
  if (window.localStorage.getItem("simpleViewBool") == null) {
    $("#welcomeModal").modal("show");
  } else {
    simpleViewBool = window.localStorage.getItem("simpleViewBool") == "true";
    setSimpleView(simpleViewBool);
  }
  buildDropDowns();
  rep = restoreOldSaves(rep);
  handleResults(rep);
}
function init() {
  console.log("yo");
  fetch(spreadsheetUrl)
    .then(handleErrors)
    .then((res) => res.text())
    .then((rep) => {
      //Remove additional text and extract only JSON:
      //console.log(rep)
      const jsonData = JSON.parse(rep.substring(47).slice(0, -2));
      //console.log(jsonData.table.rows)
      processRows(jsonData.table.rows);
    });
}
function processRows(data) {
  var results = [];
  // console.log("rows=")
  // console.log(Object.keys(data).length)
  // console.log("cols=")
  // console.log(Object.keys(data[0].c).length)
  // Iterate thru all entries
  for (var row = 0; row < Object.keys(data).length; row++) {
    results[row] = { uniqueId: null };
    for (var col = 0; col < Object.keys(data[row].c).length; col++) {
      // if new row, push in an empty object

      //console.log(data[row].c[col])
      if (
        data[row].c[col] === null ||
        (data[row].c[col].f === null && data[row].c[col].v === null)
      ) {
        continue;
      }
      switch (col) {
        case spreadsheetSetup.uniqueId:
          // unique id
          if (data[row].c[col].f !== null) {
            results[row][UNIQUE_ID] = data[row].c[col].f;
            break;
          }

        case spreadsheetSetup.date:
          // session title
          results[row][DATE] = data[row].c[col].f;
          break;
        case spreadsheetSetup.displayDate:
          // display time
          var myDate = data[row].c[col].v;
          myDate = myDate.replace("August", "Aug");
          myDate = myDate.replace("and", "&");
          myDate = myDate.replace("st", "");
          myDate = myDate.replace("nd", "");
          myDate = myDate.replace("rd", "");
          myDate = myDate.replace("th", "");
          results[row][DISPLAY_DATE] = myDate;
          break;
        case spreadsheetSetup.zoomLink:
          // session title
          results[row]["zoomLink"] = urlify(data[row].c[col].v);
          break;
        case spreadsheetSetup.sessionTime:
          // session time
          // parseSessionTime(data[row].c[col].f);
          results[row][SESSION_TIME] = data[row].c[col].f;
          results[row][DATE_TIME] = parseDateTime(
            results[row][DATE].toString(),
            results[row][SESSION_TIME].toString()
          );
          results[row][MILITARY_TIME] = militaryTime(data[row].c[col].f);
          if (allTimes.indexOf(results[row][MILITARY_TIME]) == -1) {
            allTimes.push(results[row][MILITARY_TIME]);
          }
          break;
        case spreadsheetSetup.displayTime:
          // display time
          var myTime = data[row].c[col].v;
          myTime = myTime.replace("AM", "am");
          myTime = myTime.replace("A.M.", "am");
          myTime = myTime.replace("a.m.", "am");
          myTime = myTime.replace("PM", "pm");
          myTime = myTime.replace("P.M.", "pm");
          myTime = myTime.replace("p.m.", "pm");
          results[row][DISPLAY_TIME] = myTime;
          break;
          
        case spreadsheetSetup.location:
          //  room number
          results[row][SESSION_LOCATION] = data[row].c[col].v;
          break;

        case spreadsheetSetup.roomNumber:
          //  room number
          results[row][SESSION_ROOM] = data[row].c[col].v;
          break;

        case spreadsheetSetup.sessionTeacher:
          //session presenters
          var presenters = data[row].c[col].v;
          if (presenters.indexOf(", and ") != -1) {
            presenters = presenters.replace(", and ", ", ");
          } else if (presenters.indexOf(", & ") != -1) {
            presenters = presenters.replace(", & ", ", ");
          } else if (presenters.indexOf(" and ") != -1) {
            presenters = presenters.replace(" and ", ", ");
          } else if (presenters.indexOf(" & ") != -1) {
            presenters = presenters.replace(" & ", ", ");
          } else if (presenters.indexOf("; ") != -1) {
            presenters = presenters.replace("; ", ", ");
          }
          // else if (presenters.indexOf(" / ") != -1) {
          //   presenters = presenters.replace(" / ", ", ");
          // } else if (presenters.indexOf("/ ") != -1) {
          //   presenters = presenters.replace("/ ", ", ");
          // } else if (presenters.indexOf("/") != -1) {
          //   presenters = presenters.replace("/", ", ");
          // }

          results[row][SESSION_PRESENTERS] = presenters;
          break;

        case spreadsheetSetup.sessionCategory:
          // session category
          var cat = data[row].c[col].v.trim();
          //cat = cat.replace("GIfted", "Gifted");
          cat = cat.replace(" and ", " & ");
          cat = cat.replace(
            "(EL, GIfted, Special Education)",
            "(EL/Gifted/Special Education)"
          );
          cat = cat.replace(
            "(EL, Gifted, Special Education)",
            "(EL/Gifted/Special Education)"
          );
          cat = cat.replace("(eSchool, Canvas, TAC)", "(eSchool/Canvas/TAC)");
          //console.log(cat.split(", "));
          var catList = cat.split(", ");
          results[row][SESSION_CATEGORY] = catList;
          // if (allCategories.indexOf(entries[i].gs$cell.$t) == -1) {
          //   allCategories.push(entries[i].gs$cell.$t);
          // }

          for (var j = 0; j < catList.length; j++) {
            if (allCategories.indexOf(catList[j]) == -1) {
              allCategories.push(catList[j]);
            }
          }
          break;

        case spreadsheetSetup.sessionTitle:
          // session title
          results[row][SESSION_TITLE] = data[row].c[col].v;
          break;

        case spreadsheetSetup.sessionDescription:
          // session description
          results[row][SESSION_DESCRIPTION] = data[row].c[col].v;
          break;

        case spreadsheetSetup.bestFor:
          // best for
          results[row][BEST_FOR] = data[row].c[col].v;
          if (allBestFor.indexOf(data[row].c[col].v) == -1) {
            allBestFor.push(data[row].c[col].v);
          }
          break;

        // level
        //results[parseInt(entries[i].gs$cell.row)-2][LEVEL] = entries[i].gs$cell.$t;
        //break

        // case 14:
        //   // seating
        //   results[parseInt(entries[i].gs$cell.row) - 2][SEATS] =
        //     entries[i].gs$cell.$t;
        //   break;

        // O = 15
        //       case 15:
        //         // date string
        //         results[parseInt(entries[i].gs$cell.row)-2][DATE] = entries[i].gs$cell.$t;
        //
        //         results[parseInt(entries[i].gs$cell.row)-2][DATE_TIME] =

        case spreadsheetSetup.bring:
          // bring with you
          results[row][BRING] = data[row].c[col].v;
          break;

        default:
          break;
      } //end switch
    } // end cols
  } //end rows
  //console.log("results");
  //console.log(results);
  if (window.localStorage.getItem("simpleViewBool") == null) {
    $("#welcomeModal").modal("show");
  } else {
    simpleViewBool = window.localStorage.getItem("simpleViewBool") == "true";
    setSimpleView(simpleViewBool);
  }
  buildDropDowns();
  results = restoreOldSaves(results);
  handleResults(results);
}
// Create JSONP Request to Google Docs API, then execute the callback function constructSessionsFromGSheet
// $.ajax({
//   url: spreadsheetUrl,
//   type: 'GET',
//   jsonp: "constructSessionsFromGSheet",
//   dataType: "jsonp",
//   timeout: 2000
// });
// $(document).ajaxError(function(event, jqxhr, settings, thrownError) {
//   // if ajax fails
//   if (
//     (myList.length == 0 || myList == null) &&
//     window.localStorage.getItem(LOCAL_STORAGE) == null
//   ) {
//     // load from json
//     console.log("ajaxError: Fail-safe 2. Loading sessions from JSON ");
//     console.log(event);
//     console.log(jqxhr);
//     console.log(settings);
//     console.log(thrownError);
//     $.getJSON(BACKUP_JSON_FILE, function(data) {
//       //console.log(data);
//       fullList = data;
//       myList = fullList;
//       buildDropDowns();
//       sortBy();
//     });
//   } else if (myList.length == 0 || myList == null) {
//     console.log("ajaxError: Fail-safe 1. Loading sessions from localStorage ");
//     console.log(event);
//     console.log(jqxhr);
//     console.log(settings);
//     console.log(thrownError);
//     fullList = JSON.parse(window.localStorage.getItem(LOCAL_STORAGE));
//     myList = fullList;
//     buildDropDowns();
//     sortBy();
//     //buildHtmlTable('#excelDataTable',myList);
//     //$( "body" ).text( "Triggered ajaxError handler." );
//   } else {
//     console.log("loaded from sheets"); //
//     //console.log(JSON.stringify(myList))
//   }
// });

// The callback function the JSONP request will execute to load data from Google Sheets API
// This switch case sorts the spreadsheet data into an array of objects
function constructSessionsFromGSheet(data) {
  //console.log("constructSessionsFromGSheet")
  // Final results will be stored here
  var results = [];
  // Get all entries from spreadsheet
  var entries = data.feed.entry;
  //console.log(entries)
  // Iterate thru all entries
  for (var i = 0; i < entries.length; i++) {
    //console.log(i)
    if (parseInt(entries[i].gs$cell.row) == 1) {
      // skip header row
      continue;
    } else if (parseInt(entries[i].gs$cell.row - 1) > results.length) {
      // if new row, push in an empty object
      results[parseInt(entries[i].gs$cell.row) - 2] = { uniqueId: null };
    }
    switch (parseInt(entries[i].gs$cell.col)) {
      case spreadsheetSetup.uniqueId:
        // unique id
        results[parseInt(entries[i].gs$cell.row) - 2][UNIQUE_ID] =
          entries[i].gs$cell.$t;
        break;

      case spreadsheetSetup.date:
        // session title
        results[parseInt(entries[i].gs$cell.row) - 2][DATE] =
          entries[i].gs$cell.$t.trim();
        break;
      case spreadsheetSetup.displayDate:
        // display time
        results[parseInt(entries[i].gs$cell.row) - 2][DISPLAY_DATE] =
          entries[i].gs$cell.$t.trim();
        break;
      case spreadsheetSetup.zoomLink:
        // session title
        results[parseInt(entries[i].gs$cell.row) - 2]["zoomLink"] = urlify(
          entries[i].gs$cell.$t.trim()
        );
        break;
      case spreadsheetSetup.sessionTime:
        // session time
        parseSessionTime(entries[i].gs$cell, results);
        break;
      case spreadsheetSetup.displayTime:
        // display time
        results[parseInt(entries[i].gs$cell.row) - 2][DISPLAY_TIME] =
          entries[i].gs$cell.$t.trim();
        break;

      case spreadsheetSetup.roomNumber:
        //  room number
        results[parseInt(entries[i].gs$cell.row) - 2][SESSION_ROOM] =
          entries[i].gs$cell.$t;
        break;

      case spreadsheetSetup.sessionTeacher:
        //session presenters
        var presenters = entries[i].gs$cell.$t;
        if (presenters.indexOf(", and ") != -1) {
          presenters = presenters.replace(", and ", ", ");
        } else if (presenters.indexOf(", & ") != -1) {
          presenters = presenters.replace(", & ", ", ");
        } else if (presenters.indexOf(" and ") != -1) {
          presenters = presenters.replace(" and ", ", ");
        } else if (presenters.indexOf(" & ") != -1) {
          presenters = presenters.replace(" & ", ", ");
        } else if (presenters.indexOf("; ") != -1) {
          presenters = presenters.replace("; ", ", ");
        }
        // else if (presenters.indexOf(" / ") != -1) {
        //   presenters = presenters.replace(" / ", ", ");
        // } else if (presenters.indexOf("/ ") != -1) {
        //   presenters = presenters.replace("/ ", ", ");
        // } else if (presenters.indexOf("/") != -1) {
        //   presenters = presenters.replace("/", ", ");
        // }

        results[parseInt(entries[i].gs$cell.row) - 2][SESSION_PRESENTERS] =
          presenters;
        break;

      case spreadsheetSetup.sessionCategory:
        // session category
        var cat = entries[i].gs$cell.$t;
        //cat = cat.replace("GIfted", "Gifted");
        cat = cat.replace(" and ", " & ");
        cat = cat.replace(
          "(EL, GIfted, Special Education)",
          "(EL/Gifted/Special Education)"
        );
        cat = cat.replace("(eSchool, Canvas, TAC)", "(eSchool/Canvas/TAC)");
        //console.log(cat.split(", "));
        var catList = cat.split(", ");
        results[parseInt(entries[i].gs$cell.row) - 2][SESSION_CATEGORY] =
          catList;
        // if (allCategories.indexOf(entries[i].gs$cell.$t) == -1) {
        //   allCategories.push(entries[i].gs$cell.$t);
        // }

        for (var j = 0; j < catList.length; j++) {
          if (allCategories.indexOf(catList[j]) == -1) {
            allCategories.push(catList[j]);
          }
        }
        break;

      case spreadsheetSetup.sessionTitle:
        // session title
        results[parseInt(entries[i].gs$cell.row) - 2][SESSION_TITLE] =
          entries[i].gs$cell.$t.trim();
        break;

      case spreadsheetSetup.sessionDescription:
        // session description
        results[parseInt(entries[i].gs$cell.row) - 2][SESSION_DESCRIPTION] =
          entries[i].gs$cell.$t;
        break;

      case spreadsheetSetup.bestFor:
        // best for
        results[parseInt(entries[i].gs$cell.row) - 2][BEST_FOR] =
          entries[i].gs$cell.$t;
        if (allBestFor.indexOf(entries[i].gs$cell.$t) == -1) {
          allBestFor.push(entries[i].gs$cell.$t);
        }
        break;

      // level
      //results[parseInt(entries[i].gs$cell.row)-2][LEVEL] = entries[i].gs$cell.$t;
      //break

      // case 14:
      //   // seating
      //   results[parseInt(entries[i].gs$cell.row) - 2][SEATS] =
      //     entries[i].gs$cell.$t;
      //   break;

      // O = 15
      //       case 15:
      //         // date string
      //         results[parseInt(entries[i].gs$cell.row)-2][DATE] = entries[i].gs$cell.$t;
      //
      //         results[parseInt(entries[i].gs$cell.row)-2][DATE_TIME] =

      case spreadsheetSetup.bring:
        // bring with you
        results[parseInt(entries[i].gs$cell.row) - 2][BRING] =
          entries[i].gs$cell.$t;
        break;

      //   // session location
      //   results[parseInt(entries[i].gs$cell.row)-2][SESSION_LOCATION] = entries[i].gs$cell.$t;
      //   break

      // Q = 17
      //case 17:

      // R = 18
      // S = 19
      //case 19:
      // month number
      //results[parseInt(entries[i].gs$cell.row)-2]["monthnumber"] = entries[i].gs$cell.$t;

      // T = 20
      //case 20:

      default:
        break;
    }
  }
  //console.log(results);
  if (window.localStorage.getItem("simpleViewBool") == null) {
    $("#welcomeModal").modal("show");
  } else {
    simpleViewBool = window.localStorage.getItem("simpleViewBool") == "true";
    setSimpleView(simpleViewBool);
  }
  buildDropDowns();
  results = restoreOldSaves(results);
  handleResults(results);
}

function exportAsJson(exportObj, exportFilenameString) {
  var dataStr =
    "data:text/json;charset=utf-8," +
    encodeURIComponent(JSON.stringify(exportObj));
  var downloadAnchorNode = document.createElement("a");
  downloadAnchorNode.setAttribute("href", dataStr);
  downloadAnchorNode.setAttribute("download", exportFilenameString + ".json");
  document.body.appendChild(downloadAnchorNode); // required for firefox
  downloadAnchorNode.click();
  downloadAnchorNode.remove();
}

function getDayInt(dateString) {
  if (dateString.match(/\d+/) == null) {
    return 0;
  }
  return parseInt(dateString.match(/\d+/)[0]);
}

function getHourInt(timeString) {
  if (timeString === null || timeString.toString().match(/\d+/) === null) {
    //alert(timeString)
    return 0;
  }
  var result = parseInt(timeString.toString().match(/\d+/)[0]);
  if (result < 6) {
    // will work for 6am, but will fail for 6pm
    result += 12;
  }
  return result;
}

function getMinuteInt(timeString) {
  if (timeString.indexOf(":") != -1) {
    timeString = timeString.substring(timeString.indexOf(":") + 1);
    timeString = timeString.substring(0, 2);
    return parseInt(timeString);
    // return parseInt(
    //   timeString.substring(
    //     timeString.indexOf(":") + 1,
    //     timeString.lastIndexOf("-")
    //   )
    // );
  } else {
    return 0;
  }
}

function getMonthInt(dateString) {
  // dateString = dateString
  //   .substring(0, dateString.indexOf(" "))
  //   .trim()
  //   .toLowerCase();
  dateString = dateString.trim().toLowerCase();
  if (dateString.indexOf("may") > -1) {
    return 5 - 1;
  } else if (dateString.indexOf("june") > -1) {
    return 6 - 1;
  } else if (dateString.indexOf("july") > -1) {
    return 7 - 1;
  } else if (dateString.indexOf("aug") > -1) {
    return 8 - 1;
  } else {
    console.log(dateString);
    return 0;
  }
}

function getUniqueId(date, time, teachers) {
  var str = date + time + teachers;
  // remove all whitespace and punctuation
  str = str
    .replace(/[^\w\s]|_/g, "")
    .replace(/\s/g, "")
    .replace(/\s+/g, " ");
  // var result = "";
  // for (let i = 0; i < str.length; i++) {
  //   result += str.charCodeAt(i);
  // }
  return str;
}

// Save to localStorage and transfer saves
function handleResults(spreadsheetArray) {
  //console.log(spreadsheetArray);
  fullList = spreadsheetArray;
  myList = spreadsheetArray;
  // save to
  //myList = shuffle(myList);
  //sort by time
  sortBy();
  //buildHtmlTable('#excelDataTable',spreadsheetArray);
  saveAllSessionsToLocalStorage();
  localStorage.setItem("simpleViewBool", simpleViewBool.toString());
  //console.log(spreadsheetArray);
}

function militaryTime(time) {
  if (time === null || time.toString().match(/^(\d+)/) === null) {
    //alert(time)
    return "08:00";
  }
  var hours = Number(time.toString().match(/^(\d+)/)[1]);
  var minutes = 0;
  if (time.indexOf(":") != -1) {
    minutes = Number(time.toString().match(/:(\d+)/)[1]);
  }
  //var AMPM = time.match(/\s(.*)$/)[1];
  if (hours < 7) hours = hours + 12;
  //else if(hours==12) hours = hours-12;
  var sHours = hours.toString();
  var sMinutes = minutes.toString();
  if (hours < 10) sHours = "0" + sHours;
  if (minutes < 10) sMinutes = "0" + sMinutes;
  //alert(sHours + ":" + sMinutes)
  return sHours + ":" + sMinutes;
}

function militaryTo12Hour(timeString) {
  var hourInt = (getHourInt(timeString) + 24) % 12;
  if (hourInt == 0) {
    hourInt = 12;
  }
  return (
    hourInt.toString() +
    timeString.toString().substring(timeString.toString().indexOf(":"))
  );
}

function parseDateTime(dateString, timeString) {
  // datetime
  var year = new Date().getFullYear(); // get the current year
  // var month = getMonthInt(dateString);
  var month = parseInt(dateString[0]) - 1;
  var day = dateString.substring(2);
  day = day.substring(0, day.indexOf("/"));
  var hours = getHourInt(timeString);
  var minutes = getMinuteInt(timeString);
  var seconds = 0;
  var milliseconds = 0;
  return new Date(year, month, day, hours, minutes, seconds, milliseconds);
}

// function parseSessionTime(gsheetCell, results) {
//   results[parseInt(gsheetCell.row) - 2][SESSION_TIME] = gsheetCell.$t;
//   results[parseInt(gsheetCell.row) - 2][DATE_TIME] = parseDateTime(
//     results[parseInt(gsheetCell.row) - 2][DATE],
//     results[parseInt(gsheetCell.row) - 2][SESSION_TIME]
//   );
//   results[parseInt(gsheetCell.row) - 2][MILITARY_TIME] = militaryTime(
//     gsheetCell.$t
//   );
//   if (
//     allTimes.indexOf(results[parseInt(gsheetCell.row) - 2][MILITARY_TIME]) == -1
//   ) {
//     allTimes.push(results[parseInt(gsheetCell.row) - 2][MILITARY_TIME]);
//   }
// }

function restoreOldSaves(array) {
  // look up the localStorage
  var savedList = window.localStorage.getItem(LOCAL_STORAGE);
  //console.log(savedList == "undefined");
  //console.log(savedList);
  // if localStorage is empty
  if (savedList == null || savedList.length === 0 || savedList == "undefined") {
    for (var i = 0; i < array.length; i++) {
      //console.log(spreadsheetArray[i]);
      array[i]["save"] = false; // add Save:false to each object
    }
  } else {
    // if sessions have been saved on this device, transfer saves from localStorage into the newest server data
    savedList = JSON.parse(savedList);
    // iterate through savedList
    // console.log("found savedList in localStorage")
    // console.log(savedList);
    for (var i = 0; i < savedList.length; i++) {
      // iterate through new server data myList
      for (var j = 0; j < array.length; j++) {
        // if you find a savedList session
        if (savedList[i][UNIQUE_ID] === array[j][UNIQUE_ID]) {
          // copy the saved status for this session from savedList into new server data myList
          array[j]["save"] = savedList[i]["save"];
          break;
        }
      }
    }
  }
  return array;
}

function saveAllSessionsToLocalStorage() {
  localStorage.setItem(LOCAL_STORAGE, JSON.stringify(fullList)); // save to localStorage for a rainy day
}

function urlify(text) {
  if (typeof text === "undefined") {
    return "undefined";
  }
  var urlRegex = /(https?:\/\/[^\s]+)/g;
  return text.replace(urlRegex, function (url) {
    // return (
    //   '<a style="word-break:break-all;" target="_blank" href="' +
    //   url +
    //   '">' +
    //   url +
    //   "</a>"
    // );
    return (
      '<a style="word-break:break-all;" data-toggle="tooltip" target="_blank" href="' +
      url +
      '" title="' +
      url +
      '">Video Conference Link</a>'
    );
  });
}
