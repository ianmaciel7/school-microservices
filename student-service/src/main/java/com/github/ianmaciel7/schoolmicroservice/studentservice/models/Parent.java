package com.github.ianmaciel7.schoolmicroservice.studentservice.models;

public class Parent {
    private int parentId;
    private String firstName;
    private String lastName;
    private String phone;

    public Parent(int parentId, String firstName, String lastName, String phone) {
        this.parentId = parentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public int getParentId() {
        return this.parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
