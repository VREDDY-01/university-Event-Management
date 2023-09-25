package com.vishnu.universityEventManagement.repo;

import com.vishnu.universityEventManagement.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EventRepo extends CrudRepository<Event,Integer> {


	List<Event> findAllByDateEquals(LocalDate date);
}
