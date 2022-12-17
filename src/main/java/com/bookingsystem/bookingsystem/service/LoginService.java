package com.bookingsystem.bookingsystem.service;

import com.bookingsystem.bookingsystem.model.Login;

public interface LoginService extends CrudService<Login, Long> {

    Login findByUsername(String username);

}
