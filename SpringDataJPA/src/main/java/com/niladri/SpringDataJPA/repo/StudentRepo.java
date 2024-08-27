package com.niladri.SpringDataJPA.repo;

import com.niladri.SpringDataJPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
}
