package com.example.mypackage;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Question question1 = new Question(" which is the capital of india ? \n "
                + " (a) Delhi \n (b) kolkatta \n (c) Mumbai \n (d) Bangalore \n " , "Delhi");

        Question question2 = new Question(" which is the capital of usa ? \n "
                + " (a) washington DC \n (b) london \n (c) New york \n (d) california \n " , "Washington DC");

        Quizgame game =new Quizgame();
        game.addquestions(question1);
        game.addquestions(question2);
        game.taketest();


//        Quizgame quizgame = new ( )
//        boolean quit = false;
//        int choice ;
//        while (!quit) {
//            System.out.println(" enter your choice : ");
//            choice = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (choice) {
//                case 0:
//                    Quizgame.levelofquiz();
//                    break;
//
//                case 1:

                    //break;

            }
        }
//    }
//}

