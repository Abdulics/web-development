var numButtons = document.querySelectorAll(".drum").length;
for (var i = 0; i < numButtons; i++ ) {
    document.querySelectorAll(".drum")[i].
    addEventListener("click", function() {
    // alert("Clicked....");
    this.style.color = "white";
    // var audio = new Audio("/DrumKit/sounds/tom-1.mp3");
    // audio.play();
});
}


