package com.blogexampleone.demo.Model;

public class Employee {
    private long id;
    private String name;
    private String phone;
    private String department;
    private String jobTitle;

    public Employee(long id, String name, String phone, String department, String jobTitle) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.department = department;
        this.jobTitle = jobTitle;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
