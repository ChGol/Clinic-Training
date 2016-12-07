package com.training.clinic.entity;

import java.util.HashMap;
import java.util.Map;

public class Patient {

    private long id;
    private String name;
    private String lastName;
    private String email;

    private Map<Visit, Doctor> visits = new HashMap<>();

    public Patient() {
    }

    public Patient(long id, String name, String lastName, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public Patient(long id, String name, String lastName, String email, Map<Visit, Doctor> visits) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.visits = visits;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<Visit, Doctor> getVisits() {
        return visits;
    }

    public void setVisits(Map<Visit, Doctor> visits) {
        this.visits = visits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;

        Patient patient = (Patient) o;

        if (getId() != patient.getId()) return false;
        if (!getName().equals(patient.getName())) return false;
        if (!getLastName().equals(patient.getLastName())) return false;
        if (getEmail() != null ? !getEmail().equals(patient.getEmail()) : patient.getEmail() != null) return false;
        return getVisits() != null ? getVisits().equals(patient.getVisits()) : patient.getVisits() == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getName().hashCode();
        result = 31 * result + getLastName().hashCode();
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + (getVisits() != null ? getVisits().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", visits=" + visits +
                '}';
    }


}
