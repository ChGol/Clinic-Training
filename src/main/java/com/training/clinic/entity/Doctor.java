package com.training.clinic.entity;


import java.util.ArrayList;
import java.util.List;

public class Doctor {

    private int id;
    private String fullName;
    private String title;
    private List<Customer> patients = new ArrayList<>();

    public Doctor() {
    }

    public Doctor(int id, String fullName, String title) {
        this.id = id;
        this.fullName = fullName;
        this.title = title;
    }

    public Doctor(int id, String fullName, String title, List<Customer> patients) {
        this.id = id;
        this.fullName = fullName;
        this.title = title;
        this.patients = patients;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Customer> getPatients() {
        return patients;
    }

    public void setPatients(List<Customer> patients) {
        this.patients = patients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor)) return false;

        Doctor doctor = (Doctor) o;

        if (getId() != doctor.getId()) return false;
        if (getFullName() != null ? !getFullName().equals(doctor.getFullName()) : doctor.getFullName() != null)
            return false;
        if (getTitle() != null ? !getTitle().equals(doctor.getTitle()) : doctor.getTitle() != null) return false;
        return getPatients() != null ? getPatients().equals(doctor.getPatients()) : doctor.getPatients() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getFullName() != null ? getFullName().hashCode() : 0);
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getPatients() != null ? getPatients().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", title='" + title + '\'' +
                ", patients=" + patients +
                '}';
    }
}
