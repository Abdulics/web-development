let count = 0;
let countEl = document.getElementsByClassName('count');
console.log('CountEl ' + countEl[0]);
function myFunc() {
    count = count + 1;
    countEl.innerText = count;
    console.log("Button clicked");
}