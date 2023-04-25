package com.qsp.studentrestapi.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.stdentrestapi.dto.Student;

public interface StudentRepositary extends JpaRepository<Student, Integer> {

}
