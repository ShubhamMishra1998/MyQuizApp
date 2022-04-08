package com.epam.quiz.management.service;

import com.epam.quiz.management.dao.userdao.CreateUserDao;

import com.epam.quiz.management.model.User;
public class CreateUserService {
    public void createUser(String userName,String password){
        User user=new User(userName,password);
        CreateUserDao createUserDao=new CreateUserDao();
        createUserDao.addUser(user);

//        Map<String, User> userDb =  UserData.userDb;
//        if(userName.length()==0 || password.length()==0){
//            LOGGER.error("username or password is empty");
//            return false;
//        }else if(userDb.containsKey(userName)){
//            LOGGER.error(QuizConstants.USERALREADYPRESENT);
//            return false;
//        }else{
//            CreateUserDao createUserDao=new CreateUserDao();
//            User user=new User(userName,password);
////            userDb.put(userName,user);
//            createUserDao.addUser(user);
//            return true;
//        }
    }
}
