package com.bookingsystem.bookingsystem.service.map;

import com.bookingsystem.bookingsystem.model.Login;
import com.bookingsystem.bookingsystem.service.LoginService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class LoginMapService extends AbstractMapService<Login, Long> implements LoginService {


    @Override
    public Set<Login> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Login object) {
        super.delete(object);
    }

    @Override
    public Login save(Login object) {
        if(object != null){
            return super.save(object);
        } else {
            return null;
        }
    }

    @Override
    public Login findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Login findByUsername(String username) {
        return null;
    }
}
