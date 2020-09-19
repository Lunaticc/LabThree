package Trainin;

import Enums.AcademicType;

public class Academic extends Person implements Staff {
    private final int staffID;
    private AcademicType type;

    public Academic(String name, int age, String occupation, int staffID) {
        super(name, age, occupation);
        this.staffID = getStaffID(staffID);
    }

    @Override
    public int getStaffID(int id) {
        return staffID*2;
    }



    /////GETTERS AND SETTERS/////

    public int getStaffID() {
        return staffID;
    }

    public AcademicType getType() {
        return type;
    }

    public void setType(AcademicType type) {
        this.type = type;
    }
}
