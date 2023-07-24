document.addEventListener('DOMContentLoaded', NavBar, false); 
//document.addEventListener('DOMContentLoaded', createMenu, false); 
document.addEventListener('DOMContentLoaded', ActiveSection, false); 
document.addEventListener('DOMContentLoaded', ActiveNavBar, false); 
document.addEventListener('DOMContentLoaded', SmallMenu, false); 
	
// Dynamically build the navigation menu
function NavBar (){
	const section = document.querySelectorAll('section');
	for (let i = 0; i < section.length; i++) {	
		const li = document.createElement('li');
		const tag = document.createElement('a');	
		const sectionName = section[i].getAttribute('data-nav');
		const sectionNamePart = sectionName.replace(/\s/g, '').toLowerCase();
		tag.setAttribute('href',"#"+sectionNamePart);
		tag.setAttribute('id',"linkNumber" +[i+1]);
		tag.innerText=sectionName;
		li.appendChild(tag);
        document.getElementById("navbar__list").appendChild(li);
		document.getElementById("linkNumber" +[i+1]).addEventListener("click", function(){
			Scrolling(i+1)
		});
	};
}

const createMenu = () => {
	const navbarList = document.getElementById("navbar__list");
	for (let i = 0; i < sections.length; i++) {
	  const section = sections[i].getAttribute("data-nav");
	  const parsedSection = section.replace(/\s/g, "");
	  const link = document.createElement("a");
	  const li = document.createElement("li");
  
	  link.setAttribute("href", "#" + parsedSection);
	  link.setAttribute("id", "link" + (i + 1));
	  link.innerText = parsedSection;
  
	  li.appendChild(link);
	  navbarList.appendChild(li);
  
	  document
		.getElementById("link" + (i + 1))
		.addEventListener("click", (event) => {
		  scroll(i + 1, event);
		});
	}
  };

// Make the current section (at the top of viewport) active 
function ActiveSection (){
    window.addEventListener('scroll', function() {
		const element = document.getElementsByClassName('landing__container');		
		for (var i = 0; i < element.length; i++) {
			const position = element[i].getBoundingClientRect();
			const posit = position.top;
				if (posit <= window.innerHeight/2){
					var activeClass = document.getElementsByClassName("your-active-class");
					activeClass[0].className = activeClass[0].className.replace (" your-active-class", "");
					element[i].className += " your-active-class";
			
					var current = document.getElementsByClassName("active");  
						if (current.length > 0) {
							current[0].className = current[0].className.replace(" active", "");
						}
			
					var links = document.getElementById("navbar__list").querySelectorAll('li');
					links[i].className += " active";
				};
		};
	}); 
}


// Make the active section's tab active in the navigation bar  
function ActiveNavBar (){
	var linksContainer = document.getElementById("navbar__list");
	var links = linksContainer.querySelectorAll('li');
	for (var i = 0; i < links.length; i++) {
  		links[i].addEventListener("click", function() {
			var current = document.getElementsByClassName("active");  
    		if (current.length > 0) {
      			current[0].className = current[0].className.replace(" active", "");
    		}
    	this.className += " active";
 		});
	};
}

function activateNavBar() {
    var navBarContainer = document.getElementById("navbar__list");
    var navLinks = navBarContainer.querySelectorAll('li');

   for (var i = 0; i < navLinks.length; i++) {
        navLinks[i].addEventListener("click", function() {
           var currentActiveLink = document.querySelector(".active");
    
            if (currentActiveLink) {
              currentActiveLink.classList.remove("active");
            }
    
            this.classList.add("active");
        });
  }
}



// ScrollTo event 
function Scrolling (sectionI) {
	const section = document.getElementById('section'+sectionI);
	const pos = section.offsetTop;
	event.preventDefault();
	window.scrollTo({
		left: 0, 
		top: pos,
		behavior: 'smooth'
	});
	SmallMenu();
}


// Create humburger menu for responsive mode
function SmallMenu() {
  	var x = document.getElementById("navbar__list");
 	if (x.className === "navbar__menu") {
    	x.className += " responsive";
  	} else {
    	x.className = "navbar__menu";
  	}
}