package com.example.mypackage;


import java.util.ArrayList;
import java.util.Scanner;

public class Quizgame {

    public static ArrayList<Question> quizquestions = new ArrayList<Question>();

    public Quizgame() {
        this.quizquestions = quizquestions;
    }

    public static void levelofquiz() {
        System.out.println(" Type 1 >>> Easy level");
        System.out.println(" Type 2 >>> Medium level");
        System.out.println(" Type 3 >>> Hard level");

    }
  // Questions in easy level

    public void addquestions(Question question){
        quizquestions.add(question);

    }

    public void taketest() {
        Scanner scanner = new Scanner(System.in);
        for( int i = 0 ; i <= quizquestions.size()-1; i++) {
            System.out.println(quizquestions.get(i));
            System.out.println(" Type an answer ");
            String choice = scanner.nextLine();
            Question value = new Question() ;
            scanner.nextLine();
            value.answertest(choice);

            //System.out.println(" Type an answer");

        }


    }
}
