package com.csi.dao;


import com.csi.model.Student;
import com.csi.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentDaoImpl {


    @Autowired
    StudentRepo studentRepoImpl;

    public Student saveData(Student student) {
        return studentRepoImpl.save(student);
    }

    public Student updateData(Student student) {
        return studentRepoImpl.save(student);
    }

    public List<Student> getAllData() {
        return studentRepoImpl.findAll();
    }

    public String deleteAllData(Student student) {
     return "Deleted Successfully";
    }
}