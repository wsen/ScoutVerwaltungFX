package de.gfn.ocp.entity;

import java.io.Serializable;

/**
 *
 * @author tlubowiecki
 */
public class Scout implements Serializable {
    
    private int id;
    private String firstname;
    private String lastname;

    public Scout() {
    }

    public Scout(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
