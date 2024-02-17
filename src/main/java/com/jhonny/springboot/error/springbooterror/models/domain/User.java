package com.jhonny.springboot.error.springbooterror.models.domain;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("users")
public class User {

    private Long id;
    private String name;
    private String lasName;

    public User() {
    }

 

    public User(Long id, String name, String lasName) {
        this.id = id;
        this.name = name;
        this.lasName = lasName;
    }



    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the lasName
     */
    public String getLasName() {
        return lasName;
    }

    /**
     * @param lasName the lasName to set
     */
    public void setLasName(String lasName) {
        this.lasName = lasName;
    }
 

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

}
