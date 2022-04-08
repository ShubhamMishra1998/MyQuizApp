package com.epam.quiz.management.view;

import com.epam.quiz.management.view.question.QuestionOperationMap;
import com.epam.quiz.management.util.InputUtils;
import com.epam.quiz.management.util.QuizConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AdminTasks {
    private final Logger LOGGER = LogManager.getLogger(AdminTasks.class);
    public void doAdminTasks(){
       String input;
       do{
           LOGGER.info("Press 1 for Question Bank\nPress 2 for QuizOperations\nPress 3 for exit");
           input= InputUtils.getInput();
           if(input.equals("1")){
               doQuestionOperation();
           }else if(input.equals("2")){
                doQuizOperation();
           }else if(!input.equals("3")){
               LOGGER.error(QuizConstants.INVALIDINPUT);
           }
       }while(!input.equals("3"));

    }

    private void doQuestionOperation(){
        String input;
        do{
            LOGGER.info("Press 1 for create question");
            LOGGER.info("Press 2 for read the questions");
            LOGGER.info("Press 3 for update the question");
            LOGGER.info("Press 4 for delete the question");
            LOGGER.info("Press 5 for exit");
            input=InputUtils.getInput();
            if(input.equals("1") || input.equals("2")|| input.equals("3")|| input.equals("4")){
                QuestionOperationMap.getOperation(Integer.parseInt(input)).operation();
            }else if(!input.equals("5")){
                LOGGER.error(QuizConstants.INVALIDINPUT);
            }
        }while(!input.equals("5"));

    }

    private void doQuizOperation(){
        String input;
        do{
            LOGGER.info("Press 1 for create quiz");
            LOGGER.info("Press 2 for delete quiz");
            LOGGER.info("Press 3 for exit");
            input=InputUtils.getInput();
            if(input.equals("1")){
                CreateQuiz createQuiz=new CreateQuiz();
                createQuiz.createQuiz();
            }else if(input.equals("2")){
                DeleteQuiz deleteQuiz=new DeleteQuiz();
                deleteQuiz.delete();
            }else if(!input.equals("3")){
                LOGGER.error(QuizConstants.INVALIDINPUT);
            }
        }while(!input.equals("3"));
    }


}
