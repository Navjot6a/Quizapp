package com.example.mypackage;

import java.util.Scanner;

public class Question {
    public String statemant ;
    public String answer ;

    public Question() {
    }

    public Question(String statemant , String answer ) {
        this.statemant = statemant;
        this.answer = answer;

    }
    @Override
    public String toString() {
        return "" + statemant + " \n" ;
    }

    public void answertest (String yourchoice ) {
        if ( yourchoice.equals(answer))  {
            System.out.println(" answer is correct");
        } else {
            System.out.println(" answer is wrong");
        }
    }
}

