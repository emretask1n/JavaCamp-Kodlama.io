package org.example;

public class Arrays {
    public static void main(String[] args) {
        String student1 = "Engin";
        String student2 = "Emre";
        String student3 = "Salih";

        String[] students = new String[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for (String student: students){
            System.out.println(student);
        }
    }
}
