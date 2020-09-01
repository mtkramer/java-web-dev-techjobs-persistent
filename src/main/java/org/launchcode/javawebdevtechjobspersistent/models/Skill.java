package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;

@Entity
public class Skill extends AbstractEntity {

    private String description;

    public Skill() {}

    // getset
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
