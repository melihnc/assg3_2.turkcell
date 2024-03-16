package org.example.entities;

public class BaseEntity {
    private int id;
    private boolean isDeleted;

    public BaseEntity(int id, boolean isDeleted) {
        this.id = id;
        this.isDeleted = isDeleted;
    }

    public BaseEntity() {
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
