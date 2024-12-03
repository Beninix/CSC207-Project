# CSC207 Project - Collaborative meal planning and scheduling app

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
- Saves recipe to a virtual recipe collection.
- Export calendar
- View full instructions and nutriional information of selected recipe.
- Filter for recipes through categories: dietary restrictions, ingredients, calories, and maximum cooking duration.

## Installation
The program requires Java in order to run. Any version 17 JDK and 11+ will work. The program can run on any hardware system (ex. Windows and Mac can be used).
### Installation steps
1. Download [Java 17.](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
2. Download [Intellij-IDEA Ultimate](https://www.jetbrains.com/idea/download/?section=mac) <br>
   If you are a student, you can use Intellij Ultimate for free by signing up for [JetBrains Products for Learning.](https://www.jetbrains.com/shop/eform/students) <br>
   You can also use [Intellij IDEA Community](https://www.jetbrains.com/idea/download/?section=mac) free of charge. <br>
   *A common issue is trying to find Community Edition. Scroll down on the link provided and you will find the link at the bottom of the page!* <br>
   ![IntelliJ Community Issue](https://github.com/Beninix/CSC207-Project/blob/main/src/resources/IntelliJ%20Community%20Issue.png)

## Usage
1. [Fork](#1-fork-the-project) the repository and add to your local machine.
2. Go to **java -> src -> main -> app -> MainApplication.java**
![Access Software](https://github.com/Beninix/CSC207-Project/blob/main/src/resources/Access%20Software.png)
4. Run MainApplication.java by clicking the green arrowing on the top right corner of the screen.
![Running Main Application (Access Software](https://github.com/Beninix/CSC207-Project/blob/main/src/resources/Running%20Main%20Application%20(Access%20Software).png)
6. Enter your username and password to get started on meal prepping!
![Login Page (Access Software](https://github.com/Beninix/CSC207-Project/blob/main/src/resources/Login%20Page%20(Access%20Software).png)

## License
As of November 2024, the project and its materials are the property of the University of Toronto. The project can **only** be used for personal, non-commercial purposes.

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
   ![Forking Guide](https://github.com/Beninix/CSC207-Project/blob/main/src/resources/Forking%20Guide.png)
4. Clone the fork to your local machine by typing the Git commands in your terminal below. <br>

`git clone https://github.com/Beninix/CSC207-Project.git ` <br>
`cd CSC207-Project `

   Another Alternative (If Step 4. doesn't work)
   1. Click on **New Project**. Paste the fork repo URL in the url box as displayed below.
Now you're all ready for step 2: creating a merge request!
![Intellij Fork](https://github.com/Beninix/CSC207-Project/blob/main/src/resources/Intellij%20Fork.png)

### 2. Creating a merge request
1. Create a branch name using Git in your local machine and checkout on that branch.

`git branch <branch-name> ` <br>
`git checkout <branch-name> `

3. Commit your changes with clear and descriptive messages. An example is provided below. <br>
` git commit -m "Added new feature that allows the user to add their friends on the program." `
4. Ensure tests have 100% coverage and proper documentation is used.
   *If you are using Intellij, we reccomend you to download the plugin CheckStyle-IDEA to find all documentation errors.*
5. Provide proper, clear, and accurate descriptions of your contributions in the merge request.

### Merging protocols
1. All merge requests will be peer reviewed by a contributor for accuracy, correctness, and performance. Feedback may be sent for further revisions and/or comments.
2. Once approved, your request will be merged into the main branch.
