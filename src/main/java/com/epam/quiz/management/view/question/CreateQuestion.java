package com.epam.quiz.management.view.question;

import com.epam.quiz.management.util.InputUtils;
import com.epam.quiz.management.util.QuizConstants;
import com.epam.quiz.management.service.CreateQuestionService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CreateQuestion implements QuestionOperation {
    private final Logger LOGGER = LogManager.getLogger(CreateQuestion.class);
    @Override
    public void operation(){
        CreateQuestionService createQuestionService=new CreateQuestionService();
        String problemStatement;
        String opt1,opt2,opt3,opt4;
        String ans;
        LOGGER.info(QuizConstants.ENTERPROBLEM);
        problemStatement=InputUtils.getInput();
        LOGGER.info(QuizConstants.OPT1);
        opt1= InputUtils.getInput();
        LOGGER.info(QuizConstants.OPT2);
        opt2= InputUtils.getInput();
        LOGGER.info(QuizConstants.OPT3);
        opt3= InputUtils.getInput();
        LOGGER.info(QuizConstants.OPT4);
        opt4= InputUtils.getInput();
        LOGGER.info(QuizConstants.ANS);
        ans= InputUtils.getInput();
        createQuestionService.createQuestion(problemStatement,opt1,opt2,opt3,opt4,ans);

    }
}
