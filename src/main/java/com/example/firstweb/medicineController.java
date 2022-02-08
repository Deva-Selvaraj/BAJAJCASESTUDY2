package com.example.firstweb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/hospital/m")
public class medicineController {
	
	@Autowired
	medicineRepository repo1;
	
	@GetMapping("/medicines")
	public List<medicines> getAllmedicines()
	{
		return repo1.findAll();
	}
}
