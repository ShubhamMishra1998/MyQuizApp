package com.epam.quiz.management.view.question;

import com.epam.quiz.management.view.ViewQuestions;

public class ReadQuestion implements QuestionOperation{
    @Override
    public void operation() {
        ViewQuestions viewQuestions=new ViewQuestions();
        viewQuestions.viewQuestions();
    }
}
