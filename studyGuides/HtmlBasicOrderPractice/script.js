const sortableList = document.querySelector(".sortable-list");
const items = sortableList.querySelectorAll(".item");
items.forEach(item => {
  item.addEventListener("dragstart", () => {
    // Adding dragging class to item after a delay
    setTimeout(() => item.classList.add("dragging"), 0);
  });
  // Removing dragging class from item on dragend event
  item.addEventListener("dragend", () => {
    item.classList.remove("dragging");
    checkOrder();
  });
});
const initSortableList = (e) => {
  e.preventDefault();
  const draggingItem = document.querySelector(".dragging");
  // Getting all items except currently dragging and making array of them
  let siblings = [...sortableList.querySelectorAll(".item:not(.dragging)")];
  // Finding the sibling after which the dragging item should be placed
  let nextSibling = siblings.find(sibling => {
    return e.clientY <= sibling.offsetTop + sibling.offsetHeight / 2;
  });
  // Inserting the dragging item before the found sibling
  sortableList.insertBefore(draggingItem, nextSibling);
}
sortableList.addEventListener("dragover", initSortableList);
sortableList.addEventListener("dragenter", e => e.preventDefault());



function shuffle() {
  var container = document.getElementsByClassName("sortable-list")[0];
  var elementsArray = Array.prototype.slice.call(container.getElementsByClassName('item'));
  elementsArray.forEach(function (element) {
    container.removeChild(element);
  })
  shuffleArray(elementsArray);
  elementsArray.forEach(function (element) {
    container.appendChild(element);
  });
  resetStyles();
}

function shuffleArray(array) {
  for (var i = array.length - 1; i > 0; i--) {
    var j = Math.floor(Math.random() * (i + 1));
    var temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
  return array;
}

const correctOrder = [
  "<!DOCTYPE html>",
  "<html>",
  "<head>",
  "<title>Browser Tab Text</title>",
  "</head>",
  "<body>",
  "<h1>BIG HEADLINE TEXT</h1>",
  "<p>small paragraph text</p>",
  "</body>",
  "</html>"
];

function checkOrder() {
  // Select all item elements in their current DOM order
  const items = document.querySelectorAll('.sortable-list .item');
  let allCorrect = true;

  items.forEach((item, index) => {
    // Extract the text content from the tag span (ignoring whitespace)
    const tagText = item.querySelector('.details span').textContent.trim();

    // Check if the current item matches the correct item at this index
    if (tagText === correctOrder[index]) {
      // Correct position: turn background green
      item.style.backgroundColor = '#eeffee'; // Light green background
      item.style.borderColor = '#007700';     // Green border
      item.style.color = '#007700';           // Dark green text
    } else {
      // Incorrect position: reset style (or turn light red if desired)
      item.style.backgroundColor = '#fff';
      item.style.borderColor = '#ccc';
      item.style.color = '#000';
      allCorrect = false;
    }
  });

  if (allCorrect) {
    const list = document.querySelector('.sortable-list');
    list.style.backgroundColor = '#339933';
    document.body.style.background = '#ddffdd';
  }

  return allCorrect;
}

function resetStyles() {
  // Clear styles from all individual items
  const items = document.querySelectorAll('.sortable-list .item');
  items.forEach(item => {
      item.style.backgroundColor = '#fff';
      item.style.borderColor = '#ccc';
      item.style.color = '#000';
  });

  // Clear list container style
  const list = document.querySelector('.sortable-list');
  if (list) {
    list.style.backgroundColor = '#fff';
  }

  // Clear body background style
  document.body.style.background = '#eee';
}

shuffle();