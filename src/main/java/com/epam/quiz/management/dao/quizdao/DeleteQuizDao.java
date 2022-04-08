package com.epam.quiz.management.dao.quizdao;

import com.epam.quiz.management.data.QuizData;
import com.epam.quiz.management.model.Quiz;

import java.util.Map;

public class DeleteQuizDao {
    Map<Integer, Quiz> quizDb= QuizData.quizDB;
    public void deleteQuiz(int id){
        quizDb.remove(id);
    }
}
