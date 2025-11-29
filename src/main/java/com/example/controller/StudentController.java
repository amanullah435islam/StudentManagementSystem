package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.model.Student;
import com.example.repository.StudentRepository;

//	@Controller
//	@RequestMapping("/students")
//	public class StudentController {
//
//	    @Autowired
//	    private StudentRepository studentRepository;
//
//	    @GetMapping
//	    public String listStudents(Model model) {
//	        model.addAttribute("students", studentRepository.findAll());
//	        return "student-list";
//	    }
//
//	    @GetMapping("/new")
//	    public String showAddForm(Model model) {
//	        model.addAttribute("student", new Student());
//	        return "student-form";
//	    }
//
//	    @PostMapping
//	    public String saveStudent(@ModelAttribute("student") Student student) {
//	        studentRepository.save(student);
//	        return "redirect:/students";
//	    }
//
//	    @GetMapping("/edit/{id}")
//	    public String showEditForm(@PathVariable Long id, Model model) {
//	        Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid Id:" + id));
//	        model.addAttribute("student", student);
//	        return "student-form";
//	    }
//
//	    @GetMapping("/delete/{id}")
//	    public String deleteStudent(@PathVariable Long id) {
//	        studentRepository.deleteById(id);
//	        return "redirect:/students";
//	    }
//	}


@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public String listStudents(Model model) {
        model.addAttribute("students", studentRepository.findAll());
        return "student-list";
    }

    @GetMapping("/new")
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        return "student-form";
    }

    @PostMapping
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentRepository.save(student);
        return "redirect:/students";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Id:" + id));
        model.addAttribute("student", student);
        return "student-form";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentRepository.deleteById(id);
        return "redirect:/students";
    }
}
