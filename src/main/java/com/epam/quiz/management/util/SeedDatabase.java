package com.epam.quiz.management.util;

import com.epam.quiz.management.data.UserData;
import com.epam.quiz.management.model.User;

public class SeedDatabase {
    public static int idGenerator=1;
    User user1=new User("shubham","1234",true);
    public void seed(){
       UserData.userDb.put("shubham",user1);
    }

}
