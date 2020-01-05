package com.restservice.controller;


import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.restservice.StudentRegistration;
import com.restservice.model.Student;

@Controller
public class StudentRetrieveController {
  @RequestMapping(method = RequestMethod.GET, value="/student/allstudent")
  @ResponseBody
  public List<Student> getAllStudents() {
  return StudentRegistration.getInstance().getStudentRecords();
  }
}