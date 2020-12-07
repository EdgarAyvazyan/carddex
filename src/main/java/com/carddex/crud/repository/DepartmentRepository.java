package com.carddex.crud.repository;

import com.carddex.crud.dto.DepartmentDto;
import com.carddex.crud.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {

    @Procedure(name="addDepartments")
    void addDepartments(@RequestParam("departmentDto") DepartmentEntity entity);

    @Procedure(name = "deleteDepartment")
    void deleteDepartment(@Param("departmentUuid") Integer uuid);

    @Override
    List<DepartmentEntity> findAllById(Iterable<Long> uuid);

    @Override
    List<DepartmentEntity> findAll();

    @Override
    void delete(DepartmentEntity departmentEntity);

    @Override
    <S extends DepartmentEntity> S save(S s);
}
