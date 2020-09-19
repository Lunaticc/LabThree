package Trainin.Students;

import Trainin.Person;

public class Bachelor extends Person implements Student {
    private final int studentID;

    public Bachelor(String name, int age, String occupation, int studentID) {
        super(name, age, occupation);
        this.studentID = generateStudentID(studentID);
    }

    @Override
    public int generateStudentID(int id) {
        return (id+10)*2;
    }

    @Override
    public void turnInAssignment() {
        System.out.println("turn in project/assignment");
    }



    public int getStudentID() {
        return studentID;
    }
}
