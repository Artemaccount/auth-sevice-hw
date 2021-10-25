package com.example.demo.repository;

import com.example.demo.utils.Authorities;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (user.equals("u") && password.equals("p")) {
            return Arrays.asList(Authorities.READ, Authorities.DELETE, Authorities.WRITE);
        } else {
            return new ArrayList<>();
        }
    }
}
