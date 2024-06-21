package tw.brad.eeit02.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tw.brad.eeit02.model.Student;

import java.util.LinkedList;
import java.util.List;

@RestController
public class MyController {
    @RequestMapping("/test1")
    public Student test1(){
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Brad");
        s1.getCourseList().add("國語");
        s1.getCourseList().add("英文");
        s1.getCourseList().add("數學");
        return s1;
    }

    @PostMapping(value = "/student")
    public Boolean createStudent(@RequestBody @Valid Student student){
        return true;
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        Student s1 = new Student();
        s1.setId(2);
        return s1;
    }

    @GetMapping("/student/{name}")
    public List<Student> getStudentByName(@PathVariable String name) {
        Student s1 = new Student();
        s1.setId(2);
        List<Student> students = new LinkedList<>();
        students.add(s1);
        return students;
    }

    @PutMapping("/student/{id}")
    public Boolean updateStudent(@PathVariable Integer id,
                                 @RequestBody Student student){
        return true;
    }

    @DeleteMapping("/student/{id}")
    public Student deleteStudent(@PathVariable Integer id){
        Student s1 = new Student();
        s1.setId(2);
        return s1;
    }




}
