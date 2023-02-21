package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControl {
	@GetMapping("/")
	public String homepage() {
		return "Welcome to student list";
	}
	@GetMapping("/list")
	public List<Student> getList(){
		List<Student> detailsList=new ArrayList<>();
		detailsList.add(new Student(1,"XXXX",23));
		detailsList.add(new Student(2,"ZZZZ",32));
		detailsList.add(new Student(3,"YYYY",43));
		return detailsList;
	}
}
