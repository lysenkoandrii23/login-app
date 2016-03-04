package com.lysenko.andrii.loginapp.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEdit {

    public static boolean validate(String dateOfBirth) {
        if ((dateOfBirth == null) || ("".equals(dateOfBirth))) {
            return true;
        } else {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");

            try {
                Date date = formatter.parse(dateOfBirth);
                if (date.after(new Date())) {
                    return false;
                }
            } catch (ParseException e) {
                return false;
            }

            return true;
        }
    }
}
