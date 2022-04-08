package com.epam.quiz.management.view;

import com.epam.quiz.management.dao.questiondao.GetQuestionDao;
import com.epam.quiz.management.util.InputUtils;
import com.epam.quiz.management.util.QuizConstants;
import com.epam.quiz.management.service.CreateQuizService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class CreateQuiz {
    private final Logger LOGGER = LogManager.getLogger(CreateQuiz.class);
    GetQuestionDao getQuestionDao=new GetQuestionDao();
    public void createQuiz(){
        LOGGER.info(QuizConstants.ENTERQUIZTITLE);
        String title= InputUtils.getInput();
        LOGGER.info("How many Questions do you want to add ?");
        String count=InputUtils.getInput();
        if(title.length()==0 || count.length()==0 || !QuizConstants.isNumeric(count) ||
                Integer.parseInt(count) >getQuestionDao.getQuestionDbSize()){
            LOGGER.error(QuizConstants.INVALIDINPUT);
        }else{
            System.out.println(getQuestionDao.getQuestionIds());
            LOGGER.info("Please select the id of the question that you want to add");
            int ct=Integer.parseInt(count);
            List<Integer> ids=new ArrayList<>();
            while (ct>0){
                String id=InputUtils.getInput();
                if((id.length()==0) || (!QuizConstants.isNumeric(id)) || (getQuestionDao.getQuestionById(Integer.parseInt(id)))==null){
                    LOGGER.info(QuizConstants.INVALIDINPUT);
                    continue;
                }else{
                    ids.add(Integer.parseInt(id));
                }
                ct--;
            }
            CreateQuizService createQuizService=new CreateQuizService();
            createQuizService.createQuiz(title,ids);
        }

    }
}
