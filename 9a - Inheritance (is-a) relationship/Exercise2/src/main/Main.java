package main;

import models.Person;
import models.PhdStudent;
import models.Student;
import models.Teacher;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Student(); // valid as student is a type of person
        Person p2 = new PhdStudent(); // valid as PhdStudent is a type of Student, which is a type
        // of person
        PhdStudent phd1 = new Student(); // Not valid as PhDStudent is a type of student and Student
        // is not a type of PhdStudent
        Teacher t1 = new Person(); // Not valid as Teacher is a type of Person and Person is not
        // a type of teacher
        Student s1 = new PhdStudent(); // Valid as PhdStudent is a type of student
    }
}
