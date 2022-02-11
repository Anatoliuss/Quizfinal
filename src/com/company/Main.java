package com.company;

public class Main {

    public static void main(String[] args) {
        Question[] questions = new Question[3];
        String quest1 = "What is the value of pi?";
        Answer[] answers1 = new Answer[3];
        answers1[0] = new Answer("9,14");
        answers1[1] = new Answer("9,81");
        answers1[2] = new Answer("3,14");
        questions[0]=new Question(quest1, answers1, "3,14");
        String quest2 = "What is the value of golden ratio?";
        Answer[] answers2 = new Answer[3];
        answers2[0] = new Answer("7");
        answers2[1] = new Answer("1,618");
        answers2[2] = new Answer("5,625");
        questions[1]=new Question(quest2, answers2, "1,618");
        String quest3= "What is the order of magnitude of nanometer?";
        Answer[] answers3 = new Answer[3];
        answers3[0] = new Answer("10^-7");
        answers3[1] = new Answer("10^-9");
        answers3[2] = new Answer("10^-5");
        questions[2]=new Question(quest3, answers3, "10^-9");
        Game game = new Game(questions);
        game.doPlay();
    }
}
