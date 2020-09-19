package Trainin.Students;

import Trainin.Person;

public class Master extends Person implements Student {
    private final int studentID;

    public Master(String name, int age, String occupation, int studentID) {
        super(name, age, occupation);
        this.studentID = generateStudentID(studentID);
    }

    @Override
    public int generateStudentID(int id) {
        return (id+10)*3;
    }

    @Override
    public void turnInAssignment() {

    }
}
