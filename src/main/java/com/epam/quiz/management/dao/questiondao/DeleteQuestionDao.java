package com.epam.quiz.management.dao.questiondao;

import com.epam.quiz.management.data.QuestionData;
import com.epam.quiz.management.data.QuizData;
import com.epam.quiz.management.model.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class DeleteQuestionDao {
    private final Logger LOGGER = LogManager.getLogger(DeleteQuestionDao.class);
    Map<Integer, Question> questionDb= QuestionData.questionDB;
    public void delete(int id){
        if(questionDb.containsKey(id)){
            questionDb.remove(id);
            LOGGER.info("Question Deleted");
        }else{
            LOGGER.error("Question can't be found");
        }
    }
}
