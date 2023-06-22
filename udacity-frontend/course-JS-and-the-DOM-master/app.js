const element1 = document.querySelector('h1');
element1.addEventListener('mouseover', function(){
   element1.textContent = 'Build an AR app';
});

element1.addEventListener('mouseout', function () {
    element1.textContent = 'Learn ARKit';
  });



