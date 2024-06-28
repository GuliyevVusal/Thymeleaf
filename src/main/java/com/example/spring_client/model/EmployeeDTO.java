package com.example.spring_client.model;

public class EmployeeDTO {

    private Integer id;
    private String name;
    private String surname;
    private String email;
    private DepartmentDTO department;

    public Integer getId() {
        return id;
    }

    public EmployeeDTO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public EmployeeDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public EmployeeDTO setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public EmployeeDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public DepartmentDTO getDepartment() {
        return department;
    }

    public EmployeeDTO setDepartment(DepartmentDTO department) {
        this.department = department;
        return this;
    }
}
