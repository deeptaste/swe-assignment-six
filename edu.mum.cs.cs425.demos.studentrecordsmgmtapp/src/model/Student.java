package model;

import java.util.Date;

public class Student {
    private int studentId;
    private String name;
    private Date dateOfAdmission;

    public Student() {
    }

    public Student(int studentId, String name) {
        this(studentId, name, new Date());
    }

    public Student(int studentId, String name, Date dateOfAdmission) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfAdmission = dateOfAdmission;
    }

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfAdmission() {
        return dateOfAdmission;
    }
    public void setDateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }
}
