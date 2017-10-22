package com.robi.singleapp.logserver.Dao;

import com.robi.singleapp.logserver.Entity.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StudentDao {
    public static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
              put(1, new Student(1, "sumon", "Computer Science"));
              put(1, new Student(1, "hasan", "English"));
              put(1, new Student(1, "Indrajit", "Bangla"));
              put(1, new Student(1, "Al-amin", "Mathematics"));
              put(1, new Student(1, "sumon", "Computer Science"));
            }
        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }
}
