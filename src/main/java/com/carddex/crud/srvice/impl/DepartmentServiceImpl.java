package com.carddex.crud.srvice.impl;

import com.carddex.crud.dto.DepartmentDto;
import com.carddex.crud.entity.DepartmentEntity;
import com.carddex.crud.repository.DepartmentRepository;
import com.carddex.crud.srvice.DepartmentService;
import org.hibernate.HibernateException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }

    @Override
    public DepartmentDto createDepartment(DepartmentDto department) {

        DepartmentEntity entity = dtoToEntity(department);
        try {
            departmentRepository.addDepartments(entity);
        }catch (HibernateException e) {
            e.printStackTrace();
        }
        return entityToDto(entity);
    }



    @Override
    public DepartmentDto getDepartmentById(Long uuid) {

        DepartmentDto dto = null;
        try {
            DepartmentEntity entity = departmentRepository.findById(uuid).orElseThrow(EntityNotFoundException::new);
            dto = entityToDto(entity);
        }catch (EntityNotFoundException e) {
            e.printStackTrace();
        }
        return dto;
    }

    @Override
    public void deleteDepartment(Integer uuid) {
        departmentRepository.deleteDepartment(uuid);
    }


    private DepartmentEntity dtoToEntity(DepartmentDto dto) {
        DepartmentEntity entity = new DepartmentEntity();
        entity.setDepartmentUuid(dto.getDepartmentUuid());
        entity.setDepartmentIdPers(dto.getDepartmentIdPers());
        entity.setDepartmentIdStruct(dto.getDepartmentIdStruct());
        entity.setDepartmentName(dto.getDepartmentName());
        entity.setOrganizationUuid(dto.getOrganizationUuid());
        entity.setOrganizationName(dto.getOrganizationName());
        entity.setParentDepartmentUuid(dto.getParentDepartmentUuid());
        entity.setParentDepartmentName(dto.getParentDepartmentName());
        entity.setChiefPersonUuid(dto.getChiefPersonUuid());
        entity.setChiefPersonName(dto.getChiefPersonName());
        entity.setIsWorkCenter(dto.getIsWorkCenter());
        entity.setIsWorkCenterStr(dto.getIsWorkCenterStr());
        entity.setQualityCheck(dto.getQualityCheck());
        entity.setQualityCheckStr(dto.getQualityCheckStr());
        entity.setWhseCheck(dto.getWhseCheck());
        entity.setWhseCheckStr(dto.getWhseCheckStr());
        entity.setDeleted(dto.getDeleted());
        entity.setDeletedStr(dto.getDeletedStr());
        entity.setCreationDate(dto.getCreationDate());
        entity.setUserCreated(dto.getUserCreated());
        entity.setExternalId(dto.getExternalId());
        entity.setDepartmentGuidPers(dto.getDepartmentGuidPers());
        entity.setDepartmentGuIdStruct(dto.getDepartmentGuIdStruct());
        entity.setDepartmentsTypeId(dto.getDepartmentsTypeId());
        entity.setDepartmentsName(dto.getDepartmentsName());

        return entity;

    }

    private DepartmentDto entityToDto(DepartmentEntity entity) {

        DepartmentDto dto = new DepartmentDto();
        dto.setDepartmentUuid(entity.getDepartmentUuid());
        dto.setDepartmentIdPers(entity.getDepartmentIdPers());
        dto.setDepartmentIdStruct(entity.getDepartmentIdStruct());
        dto.setDepartmentName(entity.getDepartmentName());
        dto.setOrganizationUuid(entity.getOrganizationUuid());
        dto.setOrganizationName(entity.getOrganizationName());
        dto.setParentDepartmentUuid(entity.getParentDepartmentUuid());
        dto.setParentDepartmentName(entity.getParentDepartmentName());
        dto.setChiefPersonUuid(entity.getChiefPersonUuid());
        dto.setChiefPersonName(entity.getChiefPersonName());
        dto.setIsWorkCenter(entity.getIsWorkCenter());
        dto.setIsWorkCenterStr(entity.getIsWorkCenterStr());
        dto.setQualityCheck(entity.getQualityCheck());
        dto.setQualityCheckStr(entity.getQualityCheckStr());
        dto.setWhseCheck(entity.getWhseCheck());
        dto.setWhseCheckStr(entity.getWhseCheckStr());
        dto.setDeleted(entity.getDeleted());
        dto.setDeletedStr(entity.getDeletedStr());
        dto.setCreationDate(entity.getCreationDate());
        dto.setUserCreated(entity.getUserCreated());
        dto.setExternalId(entity.getExternalId());
        dto.setDepartmentGuidPers(entity.getDepartmentGuidPers());
        dto.setDepartmentGuIdStruct(entity.getDepartmentGuIdStruct());
        dto.setDepartmentsTypeId(entity.getDepartmentsTypeId());
        dto.setDepartmentsName(entity.getDepartmentsName());
        return dto;
    }
}
