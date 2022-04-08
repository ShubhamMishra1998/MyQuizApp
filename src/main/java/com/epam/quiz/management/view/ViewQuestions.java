package com.epam.quiz.management.view;

import com.epam.quiz.management.dao.questiondao.GetQuestionDao;
import com.epam.quiz.management.dao.quizdao.GetQuizDao;
import com.epam.quiz.management.data.QuizData;
import com.epam.quiz.management.model.Question;
import com.epam.quiz.management.model.Quiz;
import com.epam.quiz.management.util.InputUtils;
import com.epam.quiz.management.util.QuizConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ViewQuestions {
    private final Logger LOGGER = LogManager.getLogger(ViewQuestions.class);
    GetQuizDao getQuizDao=new GetQuizDao();
    GetQuestionDao getQuestionDao=new GetQuestionDao();
    public  void viewQuestions(){
        printingTopics();
        LOGGER.info("Please select the title");
        String title= InputUtils.getInput();
        if((title.length()==0)|| (getQuizDao.getQuizByTitle(title)==null)){
            LOGGER.info(QuizConstants.INVALIDINPUT);
        }else{
            Quiz quiz=getQuizDao.getQuizByTitle(title);
            printQuestions(quiz);
        }
    }
    public void printingTopics(){
//        for(Quiz q: QuizData.quizDb){
//            LOGGER.info(q.getTitle());
//        }
        for(int id:QuizData.quizDB.keySet()){
            LOGGER.info(QuizData.quizDB.get(id).getTitle());
        }
    }

    public void printQuestions(Quiz q){
        for(int id:q.getQuestions()){
//            Question ques=QuizConstants.findQuestionById(id);
            Question ques=getQuestionDao.getQuestionById(id);
            if(ques!=null){
                LOGGER.info(ques.getId());
                LOGGER.info(ques.getProblemStatement());
                LOGGER.info("1."+ques.getOp1());
                LOGGER.info("2."+ques.getOp2());
                LOGGER.info("3."+ques.getOp3());
                LOGGER.info("4."+ques.getOp4());
                LOGGER.info("");
            }
        }
    }





}
