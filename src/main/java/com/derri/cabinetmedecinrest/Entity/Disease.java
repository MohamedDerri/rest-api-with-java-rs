package com.derri.cabinetmedecinrest.Entity;

public class Disease {
    private long id;
    private String name;
    private Boolean isChronique;

    public Disease(long id, String name, Boolean isChronique) {
        this.id = id;
        this.name = name;
        this.isChronique = isChronique;
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

    public Boolean getChronique() {
        return isChronique;
    }

    public void setChronique(Boolean chronique) {
        isChronique = chronique;
    }
}
