package com.company.calendarwebapplication.repository;

import com.company.calendarwebapplication.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
