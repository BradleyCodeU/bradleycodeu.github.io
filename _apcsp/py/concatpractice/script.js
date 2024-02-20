const sortableList = document.querySelector(".sortable-list");
const items = sortableList.querySelectorAll(".item");
items.forEach(item => {
  item.addEventListener("dragstart", () => {
    // Adding dragging class to item after a delay
    setTimeout(() => item.classList.add("dragging"), 0);
  });
  // Removing dragging class from item on dragend event
  item.addEventListener("dragend", () => item.classList.remove("dragging"));
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
  elementsArray.forEach(function(element) {
    container.removeChild(element);
  })
  shuffleArray(elementsArray);
  elementsArray.forEach(function(element) {
    element.classList.remove("hide");
    if(Math.random() > 0.5){
      element.classList.add("hide");
    }
    container.appendChild(element);
  })
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

shuffle();