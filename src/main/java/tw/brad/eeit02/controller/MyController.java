package tw.brad.eeit02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tw.brad.eeit02.model.Student;

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
}
