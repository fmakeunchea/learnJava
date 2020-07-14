package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class CoursesController {
	@RequestMapping("courses")
	public String courses(String coursename, HttpSession session)
	{
		//System.out.println("Welcome to Java Progamming");
		session.setAttribute("cname", coursename);
		return "course.jsp";
	}

}
