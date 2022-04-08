package com.epam.quiz.management.view.question;

import com.epam.quiz.management.util.InputUtils;
import com.epam.quiz.management.util.QuizConstants;
import com.epam.quiz.management.service.UpdateQuestionService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class UpdateQuestion implements QuestionOperation{
    private final Logger LOGGER = LogManager.getLogger(UpdateQuestion.class);
    public Map<String,String> updateKeyValue=new HashMap<>();
    @Override
    public void operation() {
        seedUpdateKeyValueMap();
        UpdateQuestionService updateQuestionService=new UpdateQuestionService();
        LOGGER.info("Enter Question ID");
        String id= InputUtils.getInput();
        LOGGER.info(QuizConstants.WHATYOUWANTTOUPDATE);
        LOGGER.info(QuizConstants.PRESS1FORPROB1);
        LOGGER.info(QuizConstants.PRESS2);
        LOGGER.info(QuizConstants.PRESS3);
        LOGGER.info(QuizConstants.PRESS4);
        LOGGER.info(QuizConstants.PRESS5);
        LOGGER.info(QuizConstants.PRESS6);
        String input=InputUtils.getInput();
        LOGGER.info("Please provide updated info");
        String updatedInfo=InputUtils.getInput();
        if((!updateKeyValue.containsKey(input)) || (id.length()==0) || (updatedInfo.length()==0)||(!QuizConstants.isNumeric(id))){
            LOGGER.error(QuizConstants.INVALIDINPUT);
        }else{
            updateQuestionService.update(id,input,updatedInfo,updateKeyValue);
        }



    }

    private void seedUpdateKeyValueMap(){
        updateKeyValue.put("1","UPDATEPROBLEMSTATEMENT");
        updateKeyValue.put("2","UPDATEOPTION1");
        updateKeyValue.put("3","UPDATEOPTION2");
        updateKeyValue.put("4","UPDATEOPTION3");
        updateKeyValue.put("5","UPDATEOPTION4");
        updateKeyValue.put("6","UPDATEANS");
    }
}
