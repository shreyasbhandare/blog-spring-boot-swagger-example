package com.blogexampleone.demo.Service;

import com.blogexampleone.demo.Model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public List<Employee> getAllEmployees() {
        return populateMockDataForEmployees();
    }

    private List<Employee> populateMockDataForEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "John Doe", "1234567890", "Technology", "Software Engineer"));
        employeeList.add(new Employee(2, "Jane Smith", "9876543210", "Technology", "Sr. Software Engineer"));
        employeeList.add(new Employee(3, "Tim Lang", "1029384756", "Business Development", "Asst. Manager"));
        employeeList.add(new Employee(4, "Kevin Lee", "5647382910", "Marketing", "Marketing Manager"));
        employeeList.add(new Employee(5, "Vanessa Chang", "5554446667", "Technology", "Director"));
        return employeeList;
    }
}
