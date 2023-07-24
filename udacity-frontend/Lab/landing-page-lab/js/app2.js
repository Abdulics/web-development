/**
 *
 * Manipulating the DOM exercise.
 * Exercise programmatically builds navigation,
 * scrolls to anchors from navigation,
 * and highlights section in viewport upon scrolling.
 *
 * Dependencies: None
 *
 * JS Version: ES2015/ES6
 *
 * JS Standard: ESlint
 *
 */

/**
 * Comments should be present at the beginning of each procedure and class.
 * Great to have comments before crucial code sections within the procedure.
 */
// Event listeners
document.addEventListener("DOMContentLoaded", createMenu, false);
document.addEventListener("DOMContentLoaded", activateNavBar, false);
document.addEventListener("DOMContentLoaded", activateSectionOnScroll, false);
document.addEventListener("DOMContentLoaded", activeSection, false);

//Global variable
const li = document.createElement("li");
const link = document.createElement("a");
const sections = document.querySelectorAll("section");

// build the nav
const createMenu = () => {
//   const navbarList = document.getElementById("navbar__list");
//   for (let i = 0; i < sections.length; i++) {
//     const section = sections[i].getAttribute("data-nav");
//     const parsedSection = section.replace(/\s/g, "");
//     const link = document.createElement("a");
//     const li = document.createElement("li");

//     link.setAttribute("href", "#" + parsedSection);
//     link.setAttribute("id", "link" + (i + 1));
//     link.innerText = parsedSection;

//     li.appendChild(link);
//     navbarList.appendChild(li);

//     document
//       .getElementById("link" + (i + 1))
//       .addEventListener("click", (event) => {
//         scroll(i + 1, event);
//       });
//   }
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
};

const activateSectionOnScroll = () => {
  window.addEventListener("scroll", () => {
    const sectionContainers = document.querySelectorAll("section");
    const scrollOffset = window.innerHeight / 2;

    for (let i = 0; i < sectionContainers.length; i++) {
      const section = sectionContainers[i];
      const sectionTop = section.getBoundingClientRect().top;

      if (sectionTop <= scrollOffset) {
        const activeSections =
          document.getElementsByClassName("your-active-class");
        activeSections[0]?.classList.remove("your-active-class");
        section.classList.add("your-active-class");

        const currentActiveLink = document.getElementsByClassName("active");
        if (currentActiveLink.length > 0) {
          currentActiveLink[0].classList.remove("active");
        }

        const navLinks = document
          .getElementById("navbar__list")
          .querySelectorAll("li");
        navLinks[i].classList.add("active");
      }
    }
  });
};

//Make navbar active
const activateNavBar = () => {
  const navBarContainer = document.getElementById("navbar__list");
  const navLinks = navBarContainer.querySelectorAll("li");

  navLinks.forEach((link) => {
    link.addEventListener("click", function () {
      const currentActive = document.querySelector(".active");
      if (currentActive) {
        currentActive.classList.remove("active");
      }
      this.classList.add("active");
    });
  });
};

// Scroll to anchor ID using scrollTO event
const scroll = (id, event) => {
  const section = document.getElementById("section" + id);
  section.scrollIntoView({
    behavior: "smooth",
  });
  event.preventDefault();
};


