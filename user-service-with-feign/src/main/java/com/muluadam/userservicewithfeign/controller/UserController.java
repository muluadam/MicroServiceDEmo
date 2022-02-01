package com.muluadam.userservicewithfeign.controller;


import com.muluadam.userservicewithfeign.entity.Department;
import com.muluadam.userservicewithfeign.entity.ResponseBodyVO;
import com.muluadam.userservicewithfeign.entity.User;
import com.muluadam.userservicewithfeign.feign.DepartmentFeignClient;
import com.muluadam.userservicewithfeign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feign-user")
public class UserController {

    @Autowired
    private DepartmentFeignClient departmentFeignClient;

    @Autowired
    private UserService userService;

    @PostMapping
    public User saveUser(@RequestBody User user){
        return  userService.saveUser(user);
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseBodyVO> getUserById(@PathVariable("id") Long userId){
        User user =userService.getUserByUserId(userId);
        Department department= departmentFeignClient.getDepartment(user.getDepartmentId());
        ResponseBodyVO responseBodyVO= new ResponseBodyVO(user,department);
        return  ResponseEntity.ok(responseBodyVO);

    }

}
