package com.example.studentcrudsecurity.controller;

import com.example.studentcrudsecurity.model.Student;
import com.example.studentcrudsecurity.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    // Constructor injection
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // ===============================
    // USER + ADMIN
    // ===============================

    // GET all students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // GET student by ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    // ===============================
    // ADMIN ONLY
    // ===============================

    // ADD student
    @PostMapping("/admin")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    // UPDATE student
    @PutMapping("/admin/{id}")
    public Student updateStudent(@PathVariable Long id,
                                 @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    // DELETE student
    @DeleteMapping("/admin/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "Student deleted successfully";
    }
}