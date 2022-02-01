package com.muluadam.userservice.controller;


import com.muluadam.userservice.entity.Department;
import com.muluadam.userservice.entity.ResponseBodyVO;
import com.muluadam.userservice.entity.User;
import com.muluadam.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;


    @PostMapping("/")
    private User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }


    @GetMapping("/{id}")
    private ResponseBodyVO getUserById(@PathVariable("id") Long userId){
       // String baseUrl="http://localhost:9001/departments/";
        String baseUrl="http://DEPARTMENT-SERVICE:9001/departments/";

        User user= userService.getUserByUserId(userId);
        Department department= restTemplate.getForObject(baseUrl+ userId,Department.class);
        ResponseBodyVO responseBodyVO= new ResponseBodyVO(user, department);
        return  responseBodyVO;


    }

}
