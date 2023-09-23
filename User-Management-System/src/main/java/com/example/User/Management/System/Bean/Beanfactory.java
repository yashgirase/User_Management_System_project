package com.example.User.Management.System.Bean;

import com.example.User.Management.System.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Beanfactory {

    @Bean
    public List<User> getListOfUser() {
        return new ArrayList<User>();
    }

}