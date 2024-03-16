package org.example.entities;

public class Staff extends User{
    private int staffNo;

    public Staff(int id, boolean isDeleted, String email, String password, String firstName, String lastName, String nationalId, int staffNo) {
        super(id, isDeleted, email, password, firstName, lastName, nationalId);
        this.staffNo = staffNo;
    }

    public int getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(int staffNo) {
        this.staffNo = staffNo;
    }
}
