package com.epam.quiz.management.dao.quizdao;

import com.epam.quiz.management.data.QuizData;
import com.epam.quiz.management.model.Quiz;

import java.util.Map;

public class CreateQuizDao {
    Map<Integer,Quiz> quizDb=QuizData.quizDB;
    public void createQuiz(Quiz quiz){
        quizDb.put(quiz.getId(),quiz);
    }
}
