package com.example.packing.controller;

import com.example.packing.entity.Student;
import com.example.packing.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/stu")
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/{id}")
    public Student getName(@PathVariable Integer id){
        Student student = studentService.getById(id);
        return student;
    }
}
