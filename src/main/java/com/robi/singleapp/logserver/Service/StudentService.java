package com.robi.singleapp.logserver.Service;

import com.robi.singleapp.logserver.Dao.StudentDao;
import com.robi.singleapp.logserver.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return this.studentDao.getAllStudents();
    }
}
