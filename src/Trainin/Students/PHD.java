package Trainin.Students;

import Trainin.Academic;

public class PHD extends Academic implements Student{
    private final int studentID;

    public PHD(String name, int age, String occupation, int staffID, int studentID) {
        super(name, age, occupation, staffID);
        this.studentID = generateStudentID(studentID);
    }

    @Override
    public int generateStudentID(int id) {
        return (id+300)*3;
    }

    @Override
    public void turnInAssignment() {
        System.out.println("Turning in PHD Papers");
    }
}
