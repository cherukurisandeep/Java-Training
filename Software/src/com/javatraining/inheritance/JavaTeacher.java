package com.javatraining.inheritance;

public class JavaTeacher extends Teacher {
    String mainSubject = "Java to me";
    public static void main(String args[]){
        JavaTeacher obj = new JavaTeacher();
        System.out.println(obj.subjectName);
        System.out.println(obj.teacher);
        obj.does();
        System.out.println(obj.mainSubject);
    }
}
