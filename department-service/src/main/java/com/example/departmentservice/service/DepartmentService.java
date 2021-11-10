package com.example.departmentservice.service;

import com.example.departmentservice.entity.Department;
import com.example.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    //ㅇㅣ걸 그냥 메소드로 루즈 커플하는게 좋다고 함


    public Department saveDepartment(Department department){
        log.info("Saving department method in service ");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("find by id method in sercvice");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
