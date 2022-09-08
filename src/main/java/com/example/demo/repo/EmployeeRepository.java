package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.MyEmployee;

public interface EmployeeRepository extends JpaRepository<MyEmployee,Long> {

}
