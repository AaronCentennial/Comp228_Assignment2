# Assignment 2 – Java Methods

## Exercise 1

Write a Java application that simulates a test. The test contains at least five questions about first three lectures of this course. Each question should be a multiple-choice question with 4 options. 

Design a Test class. Use programmer-defined methods to implement your solution. For example:
create a method to simulate the questions – **simulateQuestion**
create a method to check the answer – **checkAnswer**
create a method to display a random message for the user – **simulateMessage**
create a method to interact with the user - **inputAnswer**

For each question:
If the user finds the right answer, display a random congratulatory message (“Excellent!”,” Good!”, “Keep up the good work!”, or “Nice work!”).
If the user responds incorrectly, display an appropriate message and the correct answer (“No. Please try again”, “Wrong. Try once more”, “Don't give up!”, “No. Keep trying...”).
Use random-number generation to choose a number from 1 to 4 that will be used to select an appropriate response to each answer. 
Use a switch statement to issue the responses, as in the following code:

    switch ( randomObject.nextInt(4) )
    {
    case 0:
    return("Very good!");
    ……
    }

At the end of the test display the number of correct and incorrect answers, and the percentage of the correct answers.

Your main class will simply create a Test object and start the test by calling inputAnswer method.

---

Exercise 2: (3 marks)
 
Design a **Die** class with one instance variable to hold an integer value (from 1 to 6). Include a constructor that randomly assigns a value to a die object. Also, include a method in the class to return a die’s value.

Use this class to create a simple dice game in which the user chooses a number between 2 and 12. The user rolls two dice up to 3 times. If the number chosen by the user comes up, the user wins and the game ends. If the number does not come up within three rolls, the computer wins.
