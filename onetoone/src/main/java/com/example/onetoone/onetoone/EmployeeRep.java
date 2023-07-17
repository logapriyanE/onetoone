package com.example.onetoone.onetoone;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRep extends JpaRepository<Employee, Integer> {

	

}
