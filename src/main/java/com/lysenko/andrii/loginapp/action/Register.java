package com.lysenko.andrii.loginapp.action;

import com.lysenko.andrii.loginapp.model.Person;
import com.lysenko.andrii.loginapp.service.DateEdit;
import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private Person personBean;


    public String execute() throws Exception {

        //call Service class to store personBean's state in database

        return SUCCESS;
    }

    public Person getPersonBean() {
        return personBean;
    }

    public void setPersonBean(Person person) {
        personBean = person;
    }

    public void validate() {
        if (!DateEdit.validate(personBean.getDateOfBirth())) {
            addFieldError("personBean.dateOfBirth","Date of birth must be in correct format and earlier then today");
        }
    }

}