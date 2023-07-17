package com.example.onetoone.onetoone;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeControler {
	@Autowired
	EmployeeRep rep;
	@PostMapping("/save")
	public String saveEmployee(@RequestBody List<Employee> d ) {
		rep.saveAll(d);
		
		return "data saved";
	}

}
