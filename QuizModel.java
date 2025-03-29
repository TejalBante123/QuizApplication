package model;

import java.util.ArrayList;
import java.util.List;

public class QuizModel {

    private List<String> questions;
    private List<String[]> options;
    private List<String> correctAnswers;

    public QuizModel() {
    
        questions = new ArrayList<>();
        options = new ArrayList<>();
        correctAnswers = new ArrayList<>();
        questions.add("What does JVM stand for?");
        options.add(new String[]{"1. Java Virtual Machine", "2. Java Variable Model", "3. Java Visual Manager", "4. Java Version Module"});
        correctAnswers.add("1");

        questions.add("Which keyword is used to define a subclass in Java?");
        options.add(new String[]{"1. extend", "2. inherits", "3. extends", "4. sub"});
        correctAnswers.add("3");

        questions.add("Which of the following is used to handle exceptions in Java?");
        options.add(new String[]{"1. try-catch", "2. error-handling", "3. throws-catch", "4. exception-block"});
        correctAnswers.add("1");

        questions.add("Which data type is used to store a single character in Java?");
        options.add(new String[]{"1. char", "2. string", "3. character", "4. text"});
        correctAnswers.add("1");

        questions.add("What is the default value of an uninitialized int variable in Java?");
        options.add(new String[]{"1. 0", "2. null", "3. undefined", "4. garbage value"});
        correctAnswers.add("1");
    }
    public int getTotalQuestions() {
        return questions.size();
    }
    public String getQuestion(int index) {
        return questions.get(index);
    }
    public String[] getOptions(int index) {
        return options.get(index);
    }
    public String getCorrectAnswer(int index) {
        return correctAnswers.get(index);
    }
}