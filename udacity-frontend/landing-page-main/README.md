# Manipulating the DOM

This HTML document demonstrates how to manipulate the Document Object Model (DOM) using JavaScript. The document builds a landing page with dynamically generated navigation, scrolling to anchors from navigation, and highlighting sections in the viewport upon scrolling.

## HTML Structure
The HTML structure follows BEM (Block Element Modifier) naming conventions and consists of the following elements:

- `<header>`: Represents the page header containing the navigation menu.
  - `<nav>`: Contains the navigation menu items.
    - `<ul id="navbar__list">`: Empty unordered list to be populated with JavaScript.

- `<main>`: Represents the main content of the page.
  - `<header class="main__hero">`: Displays the title of the landing page.
  - `<section>`: Represents a section on the landing page.
    - `<div class="landing__container">`: Contains the content of each section.
      - `<h2>`: Heading of the section.
      - `<p>`: Paragraphs of text describing the section.

- `<footer>`: Represents the page footer.
  - `<p>`: Displays a copyright notice.

## JavaScript
The JavaScript code for manipulating the DOM is linked through the following script tag:

This JavaScript code manipulates the Document Object Model (DOM) to build a navigation menu, enable scrolling to anchors from the navigation, and highlight sections in the viewport upon scrolling.

## Procedure Overview

The code consists of the following procedures and their respective functionality:

- `createMenu`: Builds the navigation menu dynamically based on the sections present in the document.
- `activateSectionOnScroll`: Adds the "active" class to the section that is in the viewport upon scrolling, and updates the corresponding navigation link as active.
- `activateNavBar`: Updates the active state of the navigation link when clicked.
- `scroll`: Scrolls to the specified section based on the provided ID.

## Procedure Details

- Objective: Programmatically build navigation, scroll to anchors, and highlight sections in the viewport.
- Dependencies: None
- JavaScript Version: ES2015/ES6
- JavaScript Standard: ESLint

## Procedures

### `createMenu`
- Description: Builds the navigation menu dynamically based on the sections in the document.
- Steps:
  1. Get the navbar list element.
  2. Iterate over the sections.
  3. Create a menu item (list item) and a link element for each section.
  4. Set the link attributes (href and ID) and inner text.
  5. Append the link to the list item and the list item to the navbar list.
  6. Add a click event listener to each link to scroll to the respective section.

### `activateSectionOnScroll`
- Description: Adds the "your-active-class" to the section in the viewport and updates the active state of the corresponding navigation link.
- Steps:
  1. Listen for the scroll event on the window.
  2. Get all section containers.
  3. Calculate the scroll offset as half of the window's inner height.
  4. Iterate over the section containers.
  5. Get the top position of each section container.
  6. If the section top position is less than or equal to the scroll offset, add the "your-active-class" to the section container and update the active state of the corresponding navigation link.

### `activateNavBar`
- Description: Updates the active state of the navigation link when clicked.
- Steps:
  1. Get the navbar container.
  2. Get all navigation links.
  3. Add a click event listener to each navigation link.
  4. On click, remove the "active" class from the currently active navigation link (if any) and add it to the clicked navigation link.

### `scroll`
- Description: Scrolls to the specified section based on the provided ID.
- Parameters:
  - `id` (number): The ID of the section to scroll to.
- Steps:
  1. Get the section element based on the provided ID.
  2. Scroll the section into view smoothly.

## Event Listeners
- The code sets up event listeners to execute the procedures when the DOM content is fully loaded:
  - `createMenu` is executed on the `"DOMContentLoaded"` event.
  - `activateNavBar` is executed on the `"DOMContentLoaded"` event.
  - `activateSectionOnScroll` is executed on the `"DOMContentLoaded"` event.

## License
This code is provided under the [MIT License](LICENSE).
