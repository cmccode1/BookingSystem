package com.bookingsystem.bookingsystem.service.springdatajpa;

import com.bookingsystem.bookingsystem.model.Login;
import com.bookingsystem.bookingsystem.repository.LoginRepository;
import com.bookingsystem.bookingsystem.service.LoginService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class LoginSDJpaService implements LoginService {

    private LoginRepository loginRepository;

    public LoginSDJpaService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public Set<Login> findAll() {
        return null;
    }

    @Override
    public Login findById(Long aLong) {
        return loginRepository.findById(aLong).orElse(null);
    }

    @Override
    public Login save(Login object) {
        return loginRepository.save(object);
    }

    @Override
    public void delete(Login object) {
        loginRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        loginRepository.deleteById(aLong);
    }

    @Override
    public Login findByUsername(String username) {
        return loginRepository.findByUsername(username);
    }
}
