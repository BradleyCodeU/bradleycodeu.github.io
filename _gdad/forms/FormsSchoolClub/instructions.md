# School Club
Create a page for a school club.

Either choose from real school clubs or make up a new school-appropriate club.

## Top of the page
- Add a background color for the body
- The club name as h1 centered at the top of the page in font size 20 or larger.
- Add a club logo image at the top of the page.
- Give the club logo the id "logo"

## Photos
- Create a PHOTOS section on the page and add three or more photos from the club. Could be photos that you've taken yourself, photos from the web, or photos taken for the yearbook.
- Add a "photo" class to all the images except the logo. Add a colored border around all of the images (but not around the logo). Use CSS to give this border to everything in the photo class. https://www.w3schools.com/html/html_classes.asp
- Use CSS to give the "photo" class a filter greyscale when you hover over a photo. Read this https://www.w3schools.com/cssref/sel_hover.asp and this https://www.w3schools.com/cssref/css3_pr_filter.asp

## Info
- Add an INFO section with info about:
  - who can join the club
  - what the club is/does
  - when the club meets
  - where the club meets

## Sign Up
- Finally... create a SIGN UP section. Use this w3schools page as a reference for the Form Inputs: https://www.w3schools.com/html/html_form_input_types.asp

- Name
  - Create a label that says "1. Name"
  - Set the for attribute to fullname. Like this, for="fullname"
  - Add a text type input
  - Set the id attribute to fullname. Like this, id="fullname"
  - Add a br tag to create a line break
- Email
  - Create a label that says "2. Email Address"
  - Set the for attribute to emailAddy.
  - Add an email type input
  - Set the id attribute to emailAddy.
  - br
- Submit
  - Create a button that says SIGN UP
  - When clicked, make a popup that says "Thanks for joining our club" or -   something like that.
- Use CSS to give the inputs 50% width and a 10px padding.

## If you have completed 1 or more coding classes...
When clicked, collect the data from the text inputs and then create an alert that says "Thanks user's name!!! We will email you at user's email soon!"