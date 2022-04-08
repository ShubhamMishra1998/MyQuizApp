package com.epam.quiz.management.view.question;

import com.epam.quiz.management.util.InputUtils;
import com.epam.quiz.management.util.QuizConstants;
import com.epam.quiz.management.service.DeleteQuestionService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DeleteQuestion implements QuestionOperation{
    private final Logger LOGGER = LogManager.getLogger(DeleteQuestion.class);
    @Override
    public void operation() {
        DeleteQuestionService deleteQuestionService=new DeleteQuestionService();
        LOGGER.info("Enter the ID of the Question");
        String id= InputUtils.getInput();
        if((id.length()==0) || (!QuizConstants.isNumeric(id))){
            LOGGER.error(QuizConstants.INVALIDINPUT);
        }else{
            deleteQuestionService.deleteQuestion(Integer.parseInt(id));
        }
    }
}
