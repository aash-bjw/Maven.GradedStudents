package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(examScores));
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public Integer getNumberOfExamsTaken(){
        return examScores.size();
    }

    public String getExamScores(){
        String scores = "Exam Score:\n";
        for(int i = 0; i < examScores.size(); i++){
            scores += ("Exam" + (i+1) + "->" + examScores.get(i) + "\n" );
        }
        return scores;
    }

    public void addExamScore(double examScore){
        examScores.add(examScore);
    }

    public void setExamScores(int examNumber, double newScore){
        examScores.set(examNumber-1, newScore);
    }

    public double getAverageExamScore(){
        double sum = 0.0;
        for(double score : examScores){
            sum += score;
        }
        return sum/examScores.size();
    }
    @Override
    public String toString(){
       return "Student Name: " + firstName + lastName + "\n Average Score" + getAverageExamScore() +
               "\n Exam Scores:" + getExamScores();
    }
}
