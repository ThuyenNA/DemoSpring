package com.example.demospringweb.service;

import com.example.demospringweb.model.Emp;
import com.example.demospringweb.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private EmpRepository departmentRepository;

    public List<Emp> getDepts(){
        return departmentRepository.findAll();
    }

    public void addDept(Emp dept){
        departmentRepository.save(dept);
    }

    public Emp getOneDept(Integer id){
        return departmentRepository.findById(id).get();
    }

    public void deleteDept(Integer id){
        departmentRepository.deleteById(id);
    }

    public void updateDept(Integer id, Emp dept){
        departmentRepository.save(dept);
    }
}
