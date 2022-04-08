package com.epam.quiz.management.dao.questiondao;

import com.epam.quiz.management.data.QuestionData;
import com.epam.quiz.management.model.Question;
import com.epam.quiz.management.view.question.UpdateOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class UpdateQuestionDao {
    private final Logger LOGGER = LogManager.getLogger(UpdateQuestionDao.class);
    Map<Integer, Question> questionMap= QuestionData.questionDB;
    public void update(int id,String input,String updatedInfo){
        if(questionMap.containsKey(id)){
            UpdateOperation.updateOperation(input).update(questionMap.get(id),updatedInfo);
            LOGGER.info("Question Updated");
        }else{
            LOGGER.error("Question cant be found");
        }
    }


}
