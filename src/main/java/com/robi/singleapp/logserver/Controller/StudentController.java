package com.robi.singleapp.logserver.Controller;

import com.robi.singleapp.logserver.Entity.Student;
import com.robi.singleapp.logserver.Service.StudentService;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class StudentController {
    private StudentService studentService;

    public Collection<Student> getAllStudents(){
        return this.studentService.getAllStudents();
    }
}
