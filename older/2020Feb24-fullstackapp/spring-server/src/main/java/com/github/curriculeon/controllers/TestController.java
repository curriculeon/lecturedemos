package com.github.curriculeon.controllers;

import com.github.curriculeon.models.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/24/2020.
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/employees")
public class TestController {
    private List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee("Leon", "Christopher", "Hunter", 99999.00),
            new Employee("Christopher", "Leon", "Hunter", 999999.00),
            new Employee("Hunter", "Christopher", "Leon", 9999999.00)));
    
    @GetMapping(value = "/", produces = "application/json")
    public List<Employee> firstPage() {
        return employees;
    }
}
