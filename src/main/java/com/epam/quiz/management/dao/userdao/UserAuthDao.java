package com.epam.quiz.management.dao.userdao;

import com.epam.quiz.management.data.UserData;
import com.epam.quiz.management.model.User;

import java.util.Map;

public class UserAuthDao {
    Map<String, User> userData=UserData.userDb;
    public boolean isValidUser(String userName,String password){
        return userData.containsKey(userName)
                && userData.get(userName).getPassword().equals(password)
                && userData.get(userName).getAdmin();
    }

    public boolean isUserExists(String userName){
        return userData.containsKey(userName);
    }
}
