package com.epam.quiz.management.view;

import com.epam.quiz.management.dao.quizdao.GetQuizDao;
import com.epam.quiz.management.util.InputUtils;
import com.epam.quiz.management.util.QuizConstants;
import com.epam.quiz.management.service.DeleteQuizService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DeleteQuiz {
    private final Logger LOGGER = LogManager.getLogger(DeleteQuiz.class);
    public void delete(){
        GetQuizDao getQuizDao=new GetQuizDao();
        DeleteQuizService deleteQuizService=new DeleteQuizService();
        LOGGER.info("Enter the id of the quiz");
        String id= InputUtils.getInput();
        if(id.length()==0 || !QuizConstants.isNumeric(id) || (getQuizDao.getQuizById(Integer.parseInt(id))==null)){
            LOGGER.error("INVALID INPUT");
        }else{
            deleteQuizService.delete(Integer.parseInt(id));
        }
    }
}
