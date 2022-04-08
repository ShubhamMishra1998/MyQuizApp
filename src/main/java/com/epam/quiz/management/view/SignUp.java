package com.epam.quiz.management.view;

import com.epam.quiz.management.dao.userdao.UserAuthDao;
import com.epam.quiz.management.util.InputUtils;
import com.epam.quiz.management.util.QuizConstants;
import com.epam.quiz.management.service.CreateUserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SignUp {
    private final Logger LOGGER = LogManager.getLogger(SignUp.class);
    AdminTasks adminTasks=new AdminTasks();
    CreateUserService createUserService=new CreateUserService();
    UserAuthDao userAuthDao=new UserAuthDao();
    public void signUp(){
        LOGGER.info(QuizConstants.ASKUSERNAME);
        String userName= InputUtils.getInput();
        LOGGER.info(QuizConstants.ASKPASSWORD);
        String password=InputUtils.getInput();
        if(userName.length()==0|| password.length()==0){
            LOGGER.error("Username password cannot be empty");
        }else if(userAuthDao.isUserExists(userName)){
            LOGGER.error("Username Taken enter different username");
        }else{
            createUserService.createUser(userName,password);
            LOGGER.info("User created successfully");
            adminTasks.doAdminTasks();
        }

    }
}
