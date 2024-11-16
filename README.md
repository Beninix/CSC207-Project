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
### Search, filter, view recipes (logged in)
1. User selects "Search" navigation button.
2. User enters search term(s).
3. Optional: User selects filters.
4. User hits enter.
5. System presents un/filtered list of results.

### View recipe (from search results, recipe box, or calendar)
1. User selects recipe entry.
2. Recipe View is made viewable to user.
3. User closes recipe window.

### Add recipe to recipe box (from Recipe View)
1. User selects "Add to recipe box" button
2. Systems sends confirmation message (pop-up)
3. User closes pop-up.
  
### Add recipe to calendar (from Recipe View)
1. User selects "Add to calendar" button.
2. Date/Time selector pop-up is made viewable to the user.
3. User selects a time slot.
4. System returns confirmation message.
5. User closes Date/Time selector pop-up.

### View calendar and export calendar format file (.ics)
1. User selects "Calendar" navigation button.
2. Calendar View is made viewable to the user.
3. User navigates to desired week in Calendar. (Default view is current week)
4. User clicks on "Export" button.
5. System sends .ics file.
6. ??

### Login and change password
1. User logs in with their username and password.
2. Search View is made visible to the user. (Default after logging in)
3. User clicks on the "Settings" button.
4. User enters old password and new password.
5. System sends confirmation message.
   
### Create new user (not logged in)
1. User selects "Create account" button.
2. User fills out username and password.
3. User clicks "Submit" button.
4. System sends confirmation message.
5. Search View is made viewable to user.

### Notes
* functionality of removing recipes from recipes box or calendar is not implemented.
