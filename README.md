# CSC207-Project: BiteWise

## Table of Contents
1. [Contributors](#Contributors) <br>
2. [Purpose](#Purpose) <br>
3. [Features](#Features) <br>
4. [Installation Instructions](#Installation) <br>
5. [Usage Guide](#Usage) <br>
6. [License](#License) <br>
7. [Feedback](#Feedback) <br>
8. [Contributions](#Contributions) <br>

## Contributors
Emily Tchong <br>
Github account: [emhatchong](https://github.com/emhatchong) <br>
Lillian Chan <br>
Github account: [lill-chan](https://github.com/lill-chan) <br>
Sarah Ko <br>
Github account: [IcedLemonLoaf](https://github.com/IcedLemonLoaf) <br>
Brandon Bounsophinh <br>
Github account: [beninix](https://github.com/beninix) <br>

## Purpose
This project is a Java-based meal prepping program created to make meal preparation easier. It combines several features into one tool, saving time by eliminating the need to search for recipes (especially with dietary restrictions) and the tedious task of planning meals for the week.

## Features
- Add recipes from an API to calendar.
- Navigate weekly calendar to view meal plan for desired week.
- Saves recipe to a virtual recipe collection.
- Export calendar
- View full instructions and nutriional information of selected recipe.
- Filter for recipes through categories: dietary restrictions, ingredients, calories, and maximum cooking duration.

## Installation
The program requires Java in order to run. Any version 17 JDK and 11+ will work. The program can run on any hardware system (ex. Windows and Mac can be used).
### Installation steps
1. Download [Java 17.](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
2. Download [Intellij-IDEA Ultimate](https://www.jetbrains.com/idea/download/?section=mac)
   If you are a student, you can use Intellij Ultimate for free by signing up for [JetBrains Products for Learning.](https://www.jetbrains.com/shop/eform/students) <br>
   You can also use [Intellij IDEA Community](https://www.jetbrains.com/idea/download/?section=mac) free of charge.

## Usage
1. [Fork](#1-fork-the-project) the repository and add to your local machine.
2. Go to **java -> src -> main -> app -> MainApplication.java**
3. Run MainApplication.java by clicking the green arrowing on the top right corner of the screen.
4. Enter your username and password to get started on meal prepping!

## License
As of November 2024, the project and its materials are the property of the University of Toronto. The project may only be used for personal, non-commercial purposes.

## Feedback
Feedback is encouraged and welcomed. Please only submit *valid* feedback through pull requests.

### Valid Feedback Criteria
*Feedback is evaluated to be valid if and only if it meets all requirements below*
- All feedback *must* be in the form of a pull request.
- Clearly state your issue or suggestion. Provide as much detail as possible. If you are describing an issue, you are welcome to provide a possible solution.
- Feedback must be relevant to the purpose and/or features of the project. Non-relevant suggestions, as determined by a contributor, will be rejected.
- Feedback must be respectful. Offensive and disrespectful feedback will result in viewing privileges of the project revoked and reporting of your Github account.

### Feedback Expectations
Please allow 3-4 weeks for a contributor to either accept or deny your pull request. We appreciate your feedback for the project's improvement!

## Contributions
Thank you for your interest in contributing to the project! To ensure smooth collaboration, please follow the steps below to create a merge request as your contribution to the project.

### 1. Fork the project
Forking will be the essential first step for you to able to apply your contribution on your local repository first. <br> 

Steps: <br>
1. Navigate to the project repository on GitHub.
2. Click the **Fork** button in the upper-right corner to create a copy of the repository under your account.
3. Clone the fork to your local machine <br>

`git clone https://github.com/Beninix/CSC207-Project.git ` <br>
`cd CSC207-Project `

   If you are using Intellij
   1. Click on **New Project**. Paste the fork repo URL in the url box as displayed below.
Now you're all ready for step 2: creating a merge request!

### 2. Creating a merge request
1. Create a branch name using Git in your local machine and checkout on that branch.

`git branch <branch-name> ` <br>
`git checkout <branch-name> `

3. Commit your changes with clear and descriptive messages.
' git commit -m "Added new feature that allows the user to add their friends on the program." '
4. Ensure tests have 100% coverage and proper documentation is used.
   *If you are using Intellij, we reccomend you to download the plugin CheckStyle-IDEA to help.*
5. Provide proper, clear, and accurate descriptions of your contributions in the merge request.

### Merging protocols
1. All merge requests will be peer reviewed by a contributor for accuracy, correctness, and performance. Feedback may be sent for further revisions and/or comments.
2. Once approved, your request will be merged into the main branch.
      





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
