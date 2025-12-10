package main;

import models.Person;
import models.PhdStudent;
import models.Student;
import models.Teacher;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person ();
        PhdStudent phd1 = new PhdStudent();
        Teacher t1 = new Teacher();
        Student s1 = new Student ();

        s1 = p1; // A person cant be assigned to type student
        s1 = p2; // A person cant be assigned to type student
        p1 = s1; // A student can be assigned to a person type
        t1 = s1 // A teacher cant be assigned to type student
        s1 = phd1; // A phd student can be assigned to type student
        phd1 = s1; // A student cant be assigned to a type phd student
    }
}
