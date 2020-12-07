package com.carddex.crud.controller;

import com.carddex.crud.dto.DepartmentDto;
import com.carddex.crud.entity.DepartmentEntity;
import com.carddex.crud.srvice.impl.DepartmentServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private final DepartmentServiceImpl service;

    public DepartmentController(DepartmentServiceImpl service) {
        this.service = service;
    }

    @PostMapping("/create")
    @ExceptionHandler(ParseException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ResponseEntity<DepartmentEntity> createDepartment(@RequestBody DepartmentDto departmentDto) {
        service.createDepartment(departmentDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{departmentId}")
    public ResponseEntity<DepartmentDto> getDepartmentById(@PathVariable Long departmentId) {
        return ResponseEntity.ok(service.getDepartmentById(departmentId));
    }

    @PostMapping("/delete/department")
    public void deleteDepartment(@RequestParam Integer uuid) {
        service.deleteDepartment(uuid);
    }
}
