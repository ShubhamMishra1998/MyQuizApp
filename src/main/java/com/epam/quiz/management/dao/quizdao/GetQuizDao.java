package com.epam.quiz.management.dao.quizdao;

import com.epam.quiz.management.data.QuizData;
import com.epam.quiz.management.model.Quiz;

import java.util.Map;

public class GetQuizDao {
    Map<Integer,Quiz> quizDb= QuizData.quizDB;
    public Quiz getQuizByTitle(String title){
        for(int id:quizDb.keySet()){
            if(quizDb.get(id).getTitle().equalsIgnoreCase(title)){
                return quizDb.get(id);
            }
        }
        return null;
    }

    public Quiz getQuizById(int id){
        return quizDb.getOrDefault(id,null);
    }


}
