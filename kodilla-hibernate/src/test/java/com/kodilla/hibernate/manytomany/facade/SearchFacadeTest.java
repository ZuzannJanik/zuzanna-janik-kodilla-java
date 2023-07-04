package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class SearchFacadeTest {

    @Autowired
    private SearchFacade searchFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testEmployeeSearchFacade() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        //When
        List<Employee> employeeWithLastname = employeeDao.retrieveEmployeeLastname("Smi");

        //Then
        assertEquals(1, employeeWithLastname.size());

        //CleanUp
        try {
            employeeDao.deleteById(johnSmith.getId());
            employeeDao.deleteById(stephanieClarckson.getId());
            employeeDao.deleteById(lindaKovalsky.getId());
        } catch (Exception e) {
            //do nothing
        }
    }
    @Test
    void testCompanySearchFacade() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        //When
        List<Company> companiesWithName = companyDao.retrieveCompanyName("Dat");

        //Then
        assertEquals(1, companiesWithName.size());

        //CleanUp
        try {
            companyDao.deleteById(softwareMachine.getId());
            companyDao.deleteById(dataMaesters.getId());
            companyDao.deleteById(greyMatter.getId());

        } catch (Exception e) {
            //do nothing
        }
    }
}