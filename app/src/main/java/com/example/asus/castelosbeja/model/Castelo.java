package com.example.asus.castelosbeja.model;

/**
 * Created by Asus on 06/02/2018.
 */

public class Castelo {
    private String name;
    private String details;
    private String contact;
    private String location;
    private String image;

    public Castelo(String name, String details, String contact, String location, String image) {
        this.name = name;
        this.details = details;
        this.contact = contact;
        this.location = location;
        this.image = image;
    }

    public Castelo(String name, String details, String contact, String location) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
