package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classroom {

    private Student[] students;

    List<Student> ttlStudents = new ArrayList<>(Arrays.asList(students));

    public Classroom(int maxNumberOfStudents){

        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students){

        this.students = students;
    }

    public Classroom(){

        this.students = new Student[30];
    }

    public Student[] getStudents(){

        return students;
    }

    public double getAverageExamScore(){
        double sum = 0.0;
        for(Student student : students){
            sum += student.getAverageExamScore();
        }
        return sum / students.length;
    }

    public void addStudent(Student student){
        ttlStudents.add(student);
        students = ttlStudents.toArray(new Student[0]);
    }

    public void removeStudent(String firstName, String lastName){
        for(Student x : students){
            if(x.getFirstName().equals(firstName) && x.getLastName().equals(lastName)){
               ttlStudents.remove(x);
            }
        }

    }

    public void getStudentsByScore(){
       // ttlStudents.sort();
    }
}

