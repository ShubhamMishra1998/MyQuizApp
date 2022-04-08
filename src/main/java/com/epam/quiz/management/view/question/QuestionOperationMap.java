package com.epam.quiz.management.view.question;

import java.util.HashMap;
import java.util.Map;

public class QuestionOperationMap {
  public static Map<Integer,QuestionOperation> questionOperationMap=new HashMap<>();

    public  static QuestionOperation getOperation(Integer input){
        questionOperationMap.put(1,new CreateQuestion());
        questionOperationMap.put(2,new ReadQuestion());
        questionOperationMap.put(3,new UpdateQuestion());
        questionOperationMap.put(4,new DeleteQuestion());
        return questionOperationMap.get(input);
    }

}
