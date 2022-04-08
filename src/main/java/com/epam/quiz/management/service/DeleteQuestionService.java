package com.epam.quiz.management.service;

import com.epam.quiz.management.dao.questiondao.DeleteQuestionDao;

public class DeleteQuestionService {
    public void deleteQuestion(int id){
        DeleteQuestionDao deleteQuestionDao=new DeleteQuestionDao();
        deleteQuestionDao.delete(id);
//        if(QuizConstants.findQuestionById(id)!=null){
//            QuestionData.questionDb=QuestionData.questionDb.stream().filter((e)->e.getId()!=id).toList();
//            LOGGER.info("Deletion Successful");
//            System.out.println(QuestionData.questionDb);
//        }else{
//            LOGGER.error(QuizConstants.INVALIDINPUT);
//        }
    }
}
