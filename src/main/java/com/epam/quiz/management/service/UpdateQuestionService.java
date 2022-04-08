package com.epam.quiz.management.service;

import com.epam.quiz.management.dao.questiondao.UpdateQuestionDao;

import java.util.Map;

public class UpdateQuestionService {
    public void update(String id, String input, String updatedInfo, Map<String,String> updateKeyValue){
//        Question q= QuizConstants.findQuestionById(Integer.parseInt(id));
//        if(q==null){
//            LOGGER.error("Question cant be found");
//        }else{
//                UpdateOperation.updateOperation(updateKeyValue.get(input)).update(q,upDatedInfo);
//                LOGGER.info("Question Updated");
//
//            }

        UpdateQuestionDao updateQuestionDao=new UpdateQuestionDao();
        updateQuestionDao.update(Integer.parseInt(id),updateKeyValue.get(input),updatedInfo);
//        LOGGER.info("Question Updated");

        }


}
