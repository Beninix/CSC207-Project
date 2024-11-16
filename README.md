# CSC207-Project

## Team Members 
Emily Tchong emhatchong  
Lillian Chan  lill-chan  
Sarah Ko IcedLemonLoaf  
Brandon Bounsophinh beninix  

## User Stories
### Lillian C. User Story
* Sandra wants to add recipes to her Bite Wise calendar so that she can plan her meals.
* Sandra wants to login so that she can use Bite Wise and access her recipe box and calendar. (Copy given code base)
* Sandra wants to logout so that she can end her session and her recipe box and calendar will be saved. (Copy given code base)
* Sandra wants to create an account so that she can use Bite Wise. (Copy given code base)
* Sandra wants to change her password so that she can keep her account secure. (Copy given code base)  
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
### Search, filter, view recipes (logged in)
1. User clicks on "Search" navigation button.
2. User enters search term(s).
4. Optional: User selects filters.
5. User hits enter.
6. System presents un/filtered list of results.

### View recipe (from search results, recipe box, or calendar)
1. User clicks on recipe entry.
2. Systems displays recipe in pop up window.
3. User is presented with buttons at the top of the recipe window:
   * Add to recipe box
   * Add to calendar
4. User closes recipe window to be returned to search results or recipe box or calendar.

### Add recipe to recipe box (from Recipe View)
1. User clicks on "Add to recipe box" button
2. Systems sends confirmation message (pop up)
3. User closes pop up and is returned to Recipe View.
  
### Add recipe to calendar (from Recipe View)
1. User clicks on "Add to calendar" button
2. System presents the user with the calendar (pop up)
3. User selects a time slot.
5. System sends confirmation message.
6. User closes pop up message.
7. User closes calendar pop up.
8. User is returned to Recipe View.

### View calendar and export calendar format file (.ics)
1. User clicks on "Calendar" navigation button.
2. User navigates to desired week in Calendar. (default view is current week)
3. User clicks on "Export" button.
4. System sends .ics file.
5. ??

### Change password
1. User logs in with their username and password.
2. User clicks on the "Settings" button.
3. User enters old password and new password.
4. System sends confirmation message.
   
### Create new user
1. User clicks the "Create account" button.
2. User fills out username and password.
3. User clicks "Submit" button.
4. System sends confirmation message.

### Notes
* functionality of removing recipes from recipes box or calendar is not implemented.
