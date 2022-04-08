package com.epam.quiz.management.service;

import com.epam.quiz.management.dao.questiondao.GetQuestionDao;
import com.epam.quiz.management.dao.quizdao.CreateQuizDao;
import com.epam.quiz.management.dao.quizdao.GetQuizDao;
import com.epam.quiz.management.model.Question;
import com.epam.quiz.management.model.Quiz;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class CreateQuizService {
    private final Logger LOGGER = LogManager.getLogger(CreateQuizService.class);
    CreateQuizDao createQuizDao=new CreateQuizDao();
    GetQuizDao getQuizDao=new GetQuizDao();
    GetQuestionDao getQuestionDao=new GetQuestionDao();
    public void createQuiz(String title, List<Integer> ids){
        Quiz quiz=getQuizDao.getQuizByTitle(title);
        if(quiz==null) {
            quiz = new Quiz(title);
        }
        quiz.getQuestions().addAll(ids);
        createQuizDao.createQuiz(quiz);
//        QuizData.quizDb.add(quiz);
        setTopicsForTheQuestion(ids,title);
        LOGGER.info("Quiz Created Successfully");
    }
    private void setTopicsForTheQuestion(List<Integer> ids,String title){
        for(int id:ids){
//            Question q=QuizConstants.findQuestionById(id);
              Question q=getQuestionDao.getQuestionById(id);
            if(q!=null){
                q.getTopics().add(title);
            }

        }
    }
}
