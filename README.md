# CSC207 Project - Collaborative meal planning and scheduling app

## Team Members 
Emily Tchong emhatchong  
Lillian Chan  lill-chan  
Sarah Ko IcedLemonLoaf  
Brandon Bounsophinh beninix  

## User Stories
### Lillian C. User Stories
* Sandra wants to add recipes to her Bite Wise calendar so that she can plan her meals.
* Sandra wants to navigate through her calendar to view her meal plan for a specific week.
### Emily T. User Stories
* Sandra wants to save a recipe that she likes so that she can access it from her virtual recipe collection.
* Sandra wants to login so that she can use Bite Wise and access her recipe collection and calendar.
* Sandra wants to logout so that she can end her session and her recipe collection and calendar will be saved.
### Sarah K. User Stories
* Sandra wants to export her Bite Wise calendar, so that she can upload it to her personal digital calendar/organizer.
* Sandra wants to create an account so that she can use Bite Wise.
* Sandra wants to change her password so that she can keep her account secure. 
### Brandon B. User Stories
* Sandra wants to search through a list of recipes so that she can find recipes to try.
* Sandra wants to view the list of recipes in her virtual recipe collection.  
* Sandra wants to filter the list of recipes so that she can find [filtering categories from spoonacular – suggestions: ingredients, diets, calories, cooking time (max) recipes. (diets to add; cheap, sustainable)  
### Team User Story
* Sandra wants to select one recipe from the search results or recipe collection or calendar, so that she can view the full instructions and nutritional information.

## Use Cases DRAFT
### Search, filter, view recipes (Brandon)
(precondition: user is logged in)
1. User selects "Search" navigation button.
2. Search View is made viewable to user.
3. User enters search term(s).
4. Optional: User selects filters.
5. User hits enter.
6. System returns un/filtered list of results.

### View recipe (Team)
(precondition: Search View, or Recipe collection View, or Calendar View is viewable to logged in user)
1. User selects recipe entry.
2. Recipe View is made viewable to user.
3. User closes recipe window.

### Add recipe to recipe collection (Emily)
(precondition: Recipe View is viewable to logged in  user)
1. User selects "Add to recipe collection" button
2. Systems returns confirmation message (pop-up)
3. User closes pop-up.
  
### Add recipe to calendar (Lillian)
(precondition: Recipe View is viewable to logged in user)
1. User selects "Add to calendar" button.
2. Date/Time selector pop-up is made viewable to the user.
3. User selects a time slot.
4. System returns confirmation message.
5. User closes Date/Time selector pop-up.

### View and navigate through calendar (Lillian)
(precondition: user is logged in)
1. User selects "Calendar" navigation button.
2. Calendar View is made viewable to the user.
3. User navigates to desired week in Calendar. (Default view is current week)

### Export calendar format file (Sarah)
(precondition: Calendar View is viewable to logged in user)
1. User clicks on "Export" button.
2. System returns .ics file.
3. ??

### Logout (Emily)
(precondition: user is logged in)
1. User selects "Logout" button.
2. Login View is made viewable to user.

### Login (Emily)
(precondition: user is not logged in)
1. User submits username and password to log in.
2. Search View is made visible to the user. (Default after logging in)

### Change password (Sarah)
(precondition: user is logged in)
1. User selects "Settings" button.
2. User enters old password and new password.
3. System returns confirmation message.
   
### Create new user (Sarah)
(precondition: not logged in)
1. User selects "Create account" button.
2. User submits username and password.
4. System returns confirmation message.
5. Search View is made viewable to user.

## Additional implementations and notes (Team)
* View Manager Model
* functionality of removing recipes from recipes collection or calendar is not implemented.
