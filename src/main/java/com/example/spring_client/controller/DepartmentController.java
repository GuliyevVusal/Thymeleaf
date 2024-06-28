package com.example.spring_client.controller;

import com.example.spring_client.model.DepartmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Controller
public class DepartmentController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/view")
    public String getDepartments(Model model) {
        String url = "http://localhost:9090/rest/departments/client";
        DepartmentDTO[] departments = restTemplate.getForObject(url, DepartmentDTO[].class);
        model.addAttribute("departments", departments);
        return "departments";
    }

    @PostMapping("/add")
    public String addDepartment(DepartmentDTO department) {
        String url = "http://localhost:9090/rest/departments";
        ResponseEntity<Void> responseEntity = restTemplate.postForEntity(url, department, Void.class);
        System.out.println("Department inserted successfully.");
        return "redirect:/view";
    }


    @PutMapping("/update/{id}")
    public String updateDepartment(@PathVariable Integer id, DepartmentDTO updatedDepartment) {
        String url = "http://localhost:9090/rest/departments/" + id;
        restTemplate.put(url, updatedDepartment);
        System.out.println("Department with ID " + id + " updated successfully.");
        return "redirect:/view";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDepartment(@PathVariable Integer id) {
        String url = "http://localhost:9090/rest/departments/" + id;
        restTemplate.delete(url);
        System.out.println("Department with ID " + id + " deleted successfully.");
        return "redirect:/view";
    }
}
