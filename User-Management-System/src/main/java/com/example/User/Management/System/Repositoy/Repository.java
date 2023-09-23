package com.example.User.Management.System.Repositoy;

import com.example.User.Management.System.Model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {

    @Autowired
    List <User> users;

    public List<User> getListOfUsers() {
        return users;
    }

    public void delete(User user){
        users.remove(user);
    }

}
