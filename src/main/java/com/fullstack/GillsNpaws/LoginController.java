package com.fullstack.GillsNpaws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(path="/GillsNpaws")
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping(value="/getAll")
    public List<User> Getdetails( ){
        return userService.findAll();
    }
    @PostMapping(value="/login")
    public ResponseEntity<String> ValidateLogin(@RequestBody User user){
        List<User> data= userService.findByEmail(user.getEmail());
        for(User u:data){
            if(u.getPassword().equals(user.getPassword()))
                return new ResponseEntity<String>("details matched", HttpStatus.OK);
        }
        return new ResponseEntity<String>("details not matched", HttpStatus.OK);
    }
}
