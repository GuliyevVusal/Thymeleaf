package com.example.spring_client.model;

import java.util.List;

public class DepartmentDTO {

    private Integer id;
    private String name;
    private String location;
    private List<EmployeeDTO> employees;

    public Integer getId() {
        return id;
    }

    public DepartmentDTO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DepartmentDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public DepartmentDTO setLocation(String location) {
        this.location = location;
        return this;
    }

    public List<EmployeeDTO> getEmployees() {
        return employees;
    }

    public DepartmentDTO setEmployees(List<EmployeeDTO> employees) {
        this.employees = employees;
        return this;
    }
}
