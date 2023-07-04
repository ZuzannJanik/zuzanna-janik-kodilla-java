package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {
@Autowired
private final CompanyDao companyDao;
@Autowired
private final EmployeeDao employeeDao;

    public SearchFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> retrieveCompanyName (String name) {
        return companyDao.retrieveCompanyName(name);
    }
    public List<Employee> retrieveEmployeeLastname (String lastname) {
        return  employeeDao.retrieveEmployeeLastname(lastname);
    }
}
