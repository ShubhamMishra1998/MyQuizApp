package com.epam.quiz.management.service;

import com.epam.quiz.management.dao.quizdao.DeleteQuizDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DeleteQuizService {
    private final Logger LOGGER = LogManager.getLogger(DeleteQuizService.class);
    public void delete(int id){
        DeleteQuizDao deleteQuizDao=new DeleteQuizDao();
        deleteQuizDao.deleteQuiz(id);
        LOGGER.info("Deletion Successful");
    }
}
