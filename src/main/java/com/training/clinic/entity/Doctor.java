package com.training.clinic.entity;

public class Doctor {

    private long id;
    private String name;
    private String lastName;
    private String title;

    public Doctor(long id, String name, String lastName, String title) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.title = title;
    }

    public Doctor() {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor)) return false;

        Doctor doctor = (Doctor) o;

        if (getId() != doctor.getId()) return false;
        if (!getName().equals(doctor.getName())) return false;
        if (!getLastName().equals(doctor.getLastName())) return false;
        return getTitle() != null ? getTitle().equals(doctor.getTitle()) : doctor.getTitle() == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getName().hashCode();
        result = 31 * result + getLastName().hashCode();
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return " \t Doctor: " + title + " " + lastName + "\n";
    }


}
