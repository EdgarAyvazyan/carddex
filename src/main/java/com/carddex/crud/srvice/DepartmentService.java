package com.carddex.crud.srvice;


import com.carddex.crud.dto.DepartmentDto;

public interface DepartmentService {
    DepartmentDto createDepartment(DepartmentDto department);
    DepartmentDto getDepartmentById(Long uuid);
    void deleteDepartment(Integer uuid);
}
