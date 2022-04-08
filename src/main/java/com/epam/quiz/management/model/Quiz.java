package com.epam.quiz.management.model;

import com.epam.quiz.management.util.SeedDatabase;

import java.util.HashSet;
import java.util.Set;

public class Quiz {
    private final int id;
    private String title;
    private Set<Integer> questions;

    public Quiz(String title) {
        this.id = SeedDatabase.idGenerator++;
        this.title = title;
        this.questions=new HashSet<>();
    }

    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Integer> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Integer> questions) {
        this.questions = questions;
    }
}
