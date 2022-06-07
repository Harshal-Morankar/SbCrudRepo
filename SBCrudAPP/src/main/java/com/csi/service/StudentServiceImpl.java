package com.csi.service;


import com.csi.dao.StudentDaoImpl;
import com.csi.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl {

    @Autowired
    StudentDaoImpl studentDaoimpl;

    public Student saveData(Student student) {
        return studentDaoimpl.saveData(student);
    }

    public Student updateData(Student student) {
        return studentDaoimpl.updateData(student);
    }

    public List<Student> getAllData() {
        return studentDaoimpl.getAllData();
    }

    public String deleteAllData() {
        return "Deleted Successfully";
    }

}
