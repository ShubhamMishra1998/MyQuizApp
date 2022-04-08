package com.epam.quiz.management.util;

import java.util.Scanner;

public interface InputUtils {
    Scanner sc=new Scanner(System.in);
    static String getInput(){
        return sc.nextLine();
    }
}
