package com.muluadam.userservicewithfeign.feign;

import com.muluadam.userservicewithfeign.entity.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url = "http://localhost:9191/departments/",name = "DEPARTMENT-SERVICE")
public interface DepartmentFeignClient {

    @GetMapping("{id}")
      Department getDepartment(@PathVariable("id") Long departmentId);




    @PostMapping()
    Department saveDepartment(@RequestBody Department department);



}
