package com.epam.quiz.management.service;

import com.epam.quiz.management.dao.questiondao.CreateQuestionDao;

import com.epam.quiz.management.model.Question;
import com.epam.quiz.management.util.QuizConstants;
import com.epam.quiz.management.view.question.CreateQuestion;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CreateQuestionService {
    CreateQuestionDao createQuestionDao=new CreateQuestionDao();
    private final Logger LOGGER = LogManager.getLogger(CreateQuestion.class);
    public void createQuestion(String problemStatement,String opt1,String opt2,String opt3,String opt4,String ans){
        if(problemStatement.length()==0|| opt1.length()==0|| opt2.length()==0|| opt3.length()==0|| opt4.length()==0|| ans.length()==0){
            LOGGER.error(QuizConstants.INVALIDINPUT);
        }else{
            Question question=new Question(problemStatement,opt1,opt2,opt3,opt4,ans);
            createQuestionDao.creteQuestion(question);
//            QuestionData.questionDb.add(question);
            LOGGER.info("Question Creation Successful");
        }
    }
}
