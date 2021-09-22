package com.training.spring;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Customer {

    private String username;
    private String name;
    private String surname;
    private String desc;
    private int    height;
    private int    weight;
    private Date   birthdate;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(final String descParam) {
        this.desc = descParam;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(final int heightParam) {
        this.height = heightParam;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(final int weightParam) {
        this.weight = weightParam;
    }


    public String getUsername() {
        return this.username;
    }

    public void setUsername(final String usernameParam) {
        this.username = usernameParam;
    }

    public Date getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(final Date birthdateParam) {
        this.birthdate = birthdateParam;
    }


}
