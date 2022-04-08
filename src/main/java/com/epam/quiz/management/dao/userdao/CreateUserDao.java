package com.epam.quiz.management.dao.userdao;

import com.epam.quiz.management.data.UserData;
import com.epam.quiz.management.model.User;

public class CreateUserDao {

    public void addUser(User user){
        UserData.userDb.put(user.getUserName(),user);
    }

}
