package com.example.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.thymeleafdemo.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private List<Employee> theEmployees;

    @PostConstruct
    protected void loadData() {
        // Khởi tạo danh sách
        theEmployees = new ArrayList<>();

        // Tạo các đối tượng Employee
        Employee emp1 = new Employee(1, "Trung", "Kien", "kien@gmail.com");
        Employee emp2 = new Employee(2, "Thanh", "Binh", "binh@gmail.com");
        Employee emp3 = new Employee(3, "Huu", "Tien", "tien@gmail.com");

        // Thêm vào danh sách
        theEmployees.add(emp1);
        theEmployees.add(emp2);
        theEmployees.add(emp3);
    }

    // Ánh xạ đến "/list"
    @GetMapping("/list")
    public String listEmployees(Model theModel) {
        // Thêm danh sách nhân viên vào model
        theModel.addAttribute("employees", theEmployees);

        return "list_employees"; // Tên file template Thymeleaf
    }
}
