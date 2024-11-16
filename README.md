# CSC207-Project

## Team Members 
Emily Tchong emhatchong  
Lillian Chan  lill-chan  
Sarah Ko IcedLemonLoaf  
Brandon Bounsophinh beninix  

## User Stories
### Lillian C. User Story
* Sandra wants to add recipes to her Bite Wise calendar so that she can plan her meals.
* Copy from given code base:
  * Sandra wants to login so that she can use Bite Wise and access her recipe box and calendar.
  * Sandra wants to logout so that she can end her session and her recipe box and calendar will be saved.
  * Sandra wants to create an account so that she can use Bite Wise.
  * Sandra wants to change her password so that she can keep her account secure. 
### Emily T. User Story
* Sandra wants to save a recipe that she likes so that she can access it from her virtual recipe box.
### Sarah K. User Story
* Sandra wants to export her Bite Wise calendar, so that she can upload it to her personal digital calendar/organizer.
### Brandon B. User Story
* Sandra wants to search through a list of recipes so that she can find recipes to try.
* Sandra wants to view the list of recipes in her virtual recipe box.  
* Sandra wants to filter the list of recipes so that she can find [filtering categories from spoonacular – suggestions: ingredients, diets, calories, cooking time (max) recipes. (diets to add; cheap, sustainable)  
### Team User Story
* Sandra wants to select one recipe from the search results or recipe box or calendar, so that she can view the full instructions and nutritional information.

## Use Cases DRAFT
### Search, filter, view recipes 
(precondition: user is logged in)
1. User selects "Search" navigation button.
2. Search View is made viewable to user.
3. User enters search term(s).
4. Optional: User selects filters.
5. User hits enter.
6. System returns un/filtered list of results.

### View recipe 
(precondition: Search View, or Recipe Box View, or Calendar View is viewable to logged in user)
1. User selects recipe entry.
2. Recipe View is made viewable to user.
3. User closes recipe window.

### Add recipe to recipe box 
(precondition: Recipe View is viewable to logged in  user)
1. User selects "Add to recipe box" button
2. Systems returns confirmation message (pop-up)
3. User closes pop-up.
  
### Add recipe to calendar 
(precondition: Recipe View is viewable to logged in user)
1. User selects "Add to calendar" button.
2. Date/Time selector pop-up is made viewable to the user.
3. User selects a time slot.
4. System returns confirmation message.
5. User closes Date/Time selector pop-up.

### View calendar and export calendar format file (.ics)
(precondition: user is logged in)
1. User selects "Calendar" navigation button.
2. Calendar View is made viewable to the user.
3. User navigates to desired week in Calendar. (Default view is current week)
4. User clicks on "Export" button.
5. System returns .ics file.
6. ??

### Login, change password, then log out. 
(precondition: user is not logged in)
1. User submits username and password to log in.
2. Search View is made visible to the user. (Default after logging in)
3. User selects "Settings" button.
4. User enters old password and new password.
5. System returns confirmation message.
6. User selects "Logout" button.
7. Login View is made viewable to user.
   
### Create new user 
(precondition: not logged in)
1. User selects "Create account" button.
2. User submits username and password.
4. System returns confirmation message.
5. Search View is made viewable to user.

### Notes
* functionality of removing recipes from recipes box or calendar is not implemented.
