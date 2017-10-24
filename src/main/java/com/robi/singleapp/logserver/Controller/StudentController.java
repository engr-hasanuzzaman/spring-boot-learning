package com.robi.singleapp.logserver.Controller;

import com.robi.singleapp.logserver.Entity.Student;
import com.robi.singleapp.logserver.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return this.studentService.getAllStudents();
    }
}
