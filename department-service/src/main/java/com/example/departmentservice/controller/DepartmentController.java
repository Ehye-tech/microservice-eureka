package com.example.departmentservice.controller;

import com.example.departmentservice.entity.Department;
import com.example.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
//SLF4J는 로깅 Facade(퍼사드)이다. 로깅에 대한 추상 레이어를 제공하는 interface의 모음이다.
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    //ㅇㅣ걸 그냥 메소드로 루즈 커플하는게 좋다고 함

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside save method of controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("Inside get method of controller");
        return departmentService.findDepartmentById(departmentId);
    }


}
