package com.Java;

public class Grades {
    private int n;
    private int[] grades;

    public Grades(int[] grades) {
        this.grades = grades;
    }

    public void setGrades(int[] grades){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        for (int i = 0; i < grades.length; i++){
            grades[i] = sc.nextInt();
        }
    }

    public int countGrades(){

    }
}
