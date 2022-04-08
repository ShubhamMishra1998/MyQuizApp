package com.epam.quiz.management.view;

import com.epam.quiz.management.dao.userdao.UserAuthDao;
import com.epam.quiz.management.util.InputUtils;
import com.epam.quiz.management.util.QuizConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Login {
    private final Logger LOGGER = LogManager.getLogger(Login.class);
    AdminTasks adminTasks=new AdminTasks();
    UserAuthDao userAuthDao=new UserAuthDao();
    public void login(){
        LOGGER.info(QuizConstants.ASKUSERNAME);
        String userName= InputUtils.getInput();
        LOGGER.info(QuizConstants.ASKPASSWORD);
        String password=InputUtils.getInput();

        if(userName.length()==0 || password.length()==0){
            LOGGER.info("UserName or Password is Empty");
        }else{
            if(userAuthDao.isValidUser(userName,password)){
               adminTasks.doAdminTasks();
            }else{
                LOGGER.info(QuizConstants.INVALIDINPUT);
            }
        }

    }
}
