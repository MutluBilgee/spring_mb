package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Instructor;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/instructor")
public class InstructorController {

    @RequestMapping("list")   // localhost:8080/instructor/list
    public String instInfo(Model model){

        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(new Instructor("Mutlu", "Bilge", 34, Gender.MALE));
        instructorList.add(new Instructor("Ali", "Eroglu", 30, Gender.MALE));
        instructorList.add(new Instructor("Ayse", "Burcu", 24, Gender.FEMALE));

        model.addAttribute("instructors",instructorList);

        return "instructor/instructor-list";


    }


}
