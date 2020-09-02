package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

    private String skills;

    public Job() {}

    public Job(Employer anEmployer, String someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // getset
    public Employer getEmployer() { return employer; }
    public void setEmployer(Employer employer) { this.employer = employer; }
    public String getSkills() { return skills; }
    public void setSkills(String skills) { this.skills = skills; }

}
