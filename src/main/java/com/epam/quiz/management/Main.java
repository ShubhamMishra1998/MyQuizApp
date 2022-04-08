package com.epam.quiz.management;

import com.epam.quiz.management.util.InputUtils;
import com.epam.quiz.management.util.QuizConstants;
import com.epam.quiz.management.util.SeedDatabase;
import com.epam.quiz.management.view.Login;
import com.epam.quiz.management.view.SignUp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        Login login=new Login();
        SignUp signUp=new SignUp();
        SeedDatabase seedDatabase=new SeedDatabase();
        seedDatabase.seed();
       LOGGER.info(QuizConstants.WELCOMEMESSAGE);
       String input;
       do {
           LOGGER.info(QuizConstants.ASKUERCHOISETOLOGINORSIGNUP);
            input = InputUtils.getInput();
           if (input.equals("1")) {
               login.login();
           } else if (input.equals("2")) {
               signUp.signUp();
           } else if(!input.equals("3")){
               LOGGER.error(QuizConstants.INVALIDINPUT);
           }

       }while (!input.equals("3"));

    }
}
