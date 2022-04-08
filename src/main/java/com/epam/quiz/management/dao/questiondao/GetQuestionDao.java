package com.epam.quiz.management.dao.questiondao;

import com.epam.quiz.management.data.QuestionData;
import com.epam.quiz.management.model.Question;

import java.util.Map;
import java.util.Set;

public class GetQuestionDao {
    Map<Integer, Question> questionDb=QuestionData.questionDB;
    public int getQuestionDbSize(){
        return questionDb.size();
    }

    public Question getQuestionById(int id){
        return questionDb.getOrDefault(id, null);
    }

    public Set<Integer> getQuestionIds(){
        return questionDb.keySet();
    }
}
