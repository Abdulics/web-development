const list = document.createDocumentFragment();
const ul = document.createElement('ul');
const li = document.createElement('li');
list.appendChild(ul);

const button = document.querySelector('.plus-btn');
button.addEventListener('click', function(e){
    const item = document.querySelector('#task');
    console.log('inner test is: ' +item.textContent);
});

const input = document.querySelector('input');


input.addEventListener('input', myFunc(e) );
ul.appendChild(li);
function myFunc(e){
    
} 