package service;

import entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.DepartmentRepository;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;



    public Department saveDepartment(Department department) {
        return  departmentRepository.save(department);
    }

    public Department getDepartmentByDepartmentId(Long departmentId) {
        return  departmentRepository.getByDepartmentId(departmentId);
    }

    public List<Department> getAllDepartments() {
        return  departmentRepository.findAll();
    }
}
