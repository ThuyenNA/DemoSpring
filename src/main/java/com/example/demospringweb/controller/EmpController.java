package com.example.demospringweb.controller;

import com.example.demospringweb.model.Emp;
import com.example.demospringweb.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/emps")
    public List<Emp> getDepts(){
        return departmentService.getDepts();
    }

    @RequestMapping(value = "/emps",  method = RequestMethod.POST)
    public void addDept(@RequestBody Emp dept){
        departmentService.addDept(dept);
    }

    @RequestMapping(value = "/emps/{id}", method = RequestMethod.GET)
    public Emp getOneDept(@PathVariable Integer id){
        return departmentService.getOneDept(id);
    }

    @RequestMapping(value = "/emps/{id}", method = RequestMethod.DELETE)
    public void deleteDept(@PathVariable Integer id){
        departmentService.deleteDept(id);
    }

    @RequestMapping(value = "/emps/{id}", method = RequestMethod.PUT)
    public void updateDept(@PathVariable Integer id, @RequestBody Emp dept){
        departmentService.updateDept(id, dept);
    }
}
