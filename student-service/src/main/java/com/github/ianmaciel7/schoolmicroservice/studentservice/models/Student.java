package com.github.ianmaciel7.schoolmicroservice.studentservice.models;

import java.util.List;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private List<Parent> parents;

    public Student(int studentId, String firstName, String lastName, List<Parent> parents) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.parents = parents;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public List<Parent> getParents() {
        return this.parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }
}
