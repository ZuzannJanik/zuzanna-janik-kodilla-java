package com.kodilla.hibernate.manytomany.facade;

public class SearchProcessingException extends Exception {

    public static String ERR_COMPANY_SEARCH = "Company not found/Wrong name of Company";
    public static String ERR_EMPLOYEE_SEARCH = "Employee not found/Wrong name of Employee";

    public SearchProcessingException(String message) {
        super(message);
    }
}