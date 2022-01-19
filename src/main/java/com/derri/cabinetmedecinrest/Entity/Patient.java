package com.derri.cabinetmedecinrest.Entity;

public class Patient {
    private long id;
    private String cni;
    private String firstName;
    private String lastName;
    private String city;
    private int age;
    private String adresse;
    private Boolean sexe;
    private String picture;

    public Patient(long id, String cni, String firstName, String lastName, String city, int age, String adresse, Boolean sexe, String picture) {
        this.id = id;
        this.cni = cni;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
        this.adresse = adresse;
        this.sexe = sexe;
        this.picture = picture;
    }

    public Patient() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCni() {
        return cni;
    }

    public void setCni(String cni) {
        this.cni = cni;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Boolean getSexe() {
        return sexe;
    }

    public void setSexe(Boolean sexe) {
        this.sexe = sexe;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
