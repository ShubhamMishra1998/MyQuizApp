package com.epam.quiz.management.util;


public interface QuizConstants {
    String WELCOMEMESSAGE="WELCOME TO QUIZ APPLICATION";
    String ASKUERCHOISETOLOGINORSIGNUP="PLEASE ENTER 1 FOR LOGIN AND 2 FOR SIGNUP OR PRESS 3 FOR EXIT";
    String INVALIDINPUT="PLEASE PROVIDE CORRECT INPUT";
    String INVALIDUSER="INVALID USER PLEASE ENTER CORRECT CREDINTIALS";
    String SUCCESSFULLOGIN="LOGIN SUCCESSFUL";
    String LOGOUT="LOGOUT SUCCESSFUL";
    String ASKUSERNAME="PLEASE ENTER USERNAME";
    String ASKPASSWORD="PLEASE ENTER PASSWORD";
    String CREATEQUIZ="Enter 1 for CREATE QUIZ";
    String READQUIZ="Enter 2 for READ QUIZ";
    String UPDATEQUIZ="Enter 3 for UPDATE QUIZ";
    String DELETEQUIZ="Enter 4 for DELETE QUIZ";
    String EXITQUIZ="Enter 5 for Exit";
    String ZEROUSERLENGHT="FIELD CANNOT BE EMPTY";
    String USERALREADYPRESENT="USERNAME TAKEN PLEASE ENTER DIFFERENT USERNAME";
    String USERCREATION="USER CREATION SUCCESSFUL";
    String ENTERQUIZTITLE="Enter the quiz Title";
    String TITLENOTPRESENT="Given Title is Not Present";
    String ENTERQUIZID="Enter QUIZ ID";
    String DELETIONSUCCESFULL="DELETION SUCCESSFUL";
    String ENTERPROBLEM="Enter Quiz Problem Statement";
    String OPT1="Enter Option 1";
    String OPT2="Enter Option 2";
    String OPT3="Enter Option 3";
    String OPT4="Enter Option 4";
    String ANS="Enter Quiz answer";
    String QUIZSUCCESSFULL="Quiz Creation Successful";
    String WHATYOUWANTTOUPDATE="What do you want to update";
    String PRESS1FORPROB1="Press 1 for Problem Statement";
    String PRESS2="Press 2 for option 1";
    String PRESS3="Press 3 for option 2";
    String PRESS4="Press 4 for option 3";
    String PRESS5="Press 5 for option 4";
    String PRESS6="Press 6 for ans";
    String INPUT="Please Provide Input";
    String UPDATED="INFO UPDATED";
    String ERROR="Can't be done some error";

     static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
