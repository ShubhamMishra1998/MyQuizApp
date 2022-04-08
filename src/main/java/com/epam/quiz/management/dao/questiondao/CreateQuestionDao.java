package com.epam.quiz.management.dao.questiondao;

import com.epam.quiz.management.data.QuestionData;
import com.epam.quiz.management.model.Question;

import java.util.Map;

public class CreateQuestionDao {
    Map<Integer,Question> questionDb= QuestionData.questionDB;
    public void creteQuestion(Question question){
          questionDb.put(question.getId(),question);
    }
}
