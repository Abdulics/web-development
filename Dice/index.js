let randomNumber1 = Math.floor(Math.random() * 6)+1;
let imagN = "images/dice" + randomNumber1 + ".png";
console.log("Image src is: " +imagN);
let imageEl1 = document.querySelectorAll("img")[0];
imageEl1.setAttribute("src", imagN);


