package com.bookingsystem.bookingsystem.repository;

import com.bookingsystem.bookingsystem.model.Login;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends CrudRepository<Login, Long> {

    Login findByUsername(String username);

}
