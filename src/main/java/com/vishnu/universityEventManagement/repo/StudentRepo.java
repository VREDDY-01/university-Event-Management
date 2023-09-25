package com.vishnu.universityEventManagement.repo;

import com.vishnu.universityEventManagement.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student,Integer> {
}
