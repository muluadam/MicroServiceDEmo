package controller;

import entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.DepartmentService;

import java.util.List;

@RestController
@RequestMapping("departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @GetMapping("/test")
    public  String test(){
        return "Test Workd";
    }
    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        return  departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public  Department getDepartmentByDepartmentId(@PathVariable("id") Long departmentId){
       return departmentService.getDepartmentByDepartmentId(departmentId);
    }

    @GetMapping("/all")
    public List<Department> getAll(){
    return     departmentService.getAllDepartments();
    }

}
