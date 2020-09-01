package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(min = 3, max = 50, message = "Please enter the job location")
    private String location;

    public Employer() {}

    // getset
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}
