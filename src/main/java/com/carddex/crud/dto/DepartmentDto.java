package com.carddex.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {
    private UUID departmentUuid;
    private String departmentIdPers;
    private String departmentIdStruct;
    private String departmentName;
    private UUID organizationUuid;
    private String organizationName;
    private UUID parentDepartmentUuid;
    private String parentDepartmentName;
    private UUID chiefPersonUuid;
    private String chiefPersonName;
    private Integer isWorkCenter;
    private String isWorkCenterStr;
    private Integer qualityCheck;
    private String qualityCheckStr;
    private Integer whseCheck;
    private String whseCheckStr;
    private Integer deleted;
    private String deletedStr;
    private Date creationDate;
    private String userCreated;
    private String externalId;
    private UUID departmentGuidPers;
    private UUID departmentGuIdStruct;
    private Integer departmentsTypeId;
    private String departmentsName;
}
