package com.blogexampleone.demo.Controller;

import com.blogexampleone.demo.Model.Employee;
import com.blogexampleone.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Object getAllUsers() {
        List<Employee> employeeList = employeeService.getAllEmployees();
        if(employeeList.isEmpty())
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        return employeeList;
    }
}
