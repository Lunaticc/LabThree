package Trainin;

public class NonAcademic extends Person implements Staff {
    private final int staffID;
    private NonAcademic nonAcademicType;

    public NonAcademic(String name, int age, String occupation, int staffID, NonAcademic nonAcademicType) {
        super(name, age, occupation);
        this.staffID = staffID;
        this.nonAcademicType = nonAcademicType;
    }

    @Override
    public int getStaffID(int id) {
        return (id+100)*3;
    }



    /////GETTERS AND SETTERS/////

    public int getStaffID() {
        return staffID;
    }

    public NonAcademic getNonAcademicType() {
        return nonAcademicType;
    }

    public void setNonAcademicType(NonAcademic nonAcademicType) {
        this.nonAcademicType = nonAcademicType;
    }
}
