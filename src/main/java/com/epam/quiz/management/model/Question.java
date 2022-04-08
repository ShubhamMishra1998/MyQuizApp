package com.epam.quiz.management.model;

import com.epam.quiz.management.util.SeedDatabase;

import java.util.HashSet;
import java.util.Set;

public class Question {
    private final int id;
    private String problemStatement;
    private String op1,op2,op3,op4;
    private Set<String> topics;
    private String ans;

    public Question(String problemStatement, String op1, String op2, String op3, String op4, String ans) {
        this.problemStatement = problemStatement;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
        this.ans = ans;
        this.topics=new HashSet<>();
        this.id= SeedDatabase.idGenerator++;
    }

    public int getId() {
        return id;
    }


    public String getProblemStatement() {
        return problemStatement;
    }

    public void setProblemStatement(String problemStatement) {
        this.problemStatement = problemStatement;
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public String getOp3() {
        return op3;
    }

    public void setOp3(String op3) {
        this.op3 = op3;
    }

    public String getOp4() {
        return op4;
    }

    public void setOp4(String op4) {
        this.op4 = op4;
    }

    public Set<String> getTopics() {
        return topics;
    }

    public void setTopics(Set<String> topics) {
        this.topics = topics;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", problemStatement='" + problemStatement + '\'' +
                ", op1='" + op1 + '\'' +
                ", op2='" + op2 + '\'' +
                ", op3='" + op3 + '\'' +
                ", op4='" + op4 + '\'' +
                ", topics=" + topics +
                ", ans='" + ans + '\'' +
                '}';
    }
}
