package com.csi.controller;


import com.csi.model.Student;
import com.csi.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class StudentController {

    @Autowired
    StudentServiceImpl studentServiceimpl;

    @PostMapping("/savedata")
    public Student saveData(@RequestBody Student student){
        return studentServiceimpl.saveData(student);
    }

    @GetMapping("/getAllData")
    public List<Student> getAllData(){
        return studentServiceimpl.getAllData();
    }

    @PutMapping("/updataData/{studentId}")
    public Student updateData(@PathVariable int studentId , @RequestBody Student student){
        return studentServiceimpl.saveData(student);
    }


    @DeleteMapping("/deleteData")
    public String deleteAllData(){
         studentServiceimpl.deleteAllData();
        return "Data Deleted SuccessFully!!!!!!!!";
    }


}
