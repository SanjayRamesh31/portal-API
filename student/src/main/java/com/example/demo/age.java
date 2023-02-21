package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class age {
		private String studentName="Sanjay";
		@GetMapping("/")
		public String getName() {
			return "welcome "+studentName;
		}
}