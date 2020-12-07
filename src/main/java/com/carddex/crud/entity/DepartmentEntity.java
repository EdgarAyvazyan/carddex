package com.carddex.crud.entity;

import com.carddex.crud.dto.DepartmentDto;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "departments_user_v")
@NamedStoredProcedureQueries(
@NamedStoredProcedureQuery(name = "addDepartments", procedureName = "cdx_cims.add_departments", resultClasses ={ DepartmentDto.class}, parameters = {
        @StoredProcedureParameter( name = "department",type = DepartmentDto.class)} ))
@NamedStoredProcedureQuery(name = "deleteDepartments", procedureName = "cdx_cims.delete_departments", resultClasses ={ DepartmentEntity.class}, parameters = {
        @StoredProcedureParameter( name = "uuid",type = UUID.class)})
public class DepartmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "department_uuid")
    private UUID departmentUuid;
    @Column(name = "dep_id_pers")
    private String departmentIdPers;
    @Column(name = "dep_id_struct")
    private String departmentIdStruct;
    @Column(name = "dep_name")
    private String departmentName;
    @Column(name = "organization_uuid")
    private UUID organizationUuid;
    @Column(name = "org_name")
    private String organizationName;
    @Column(name = "parent_department_uuid")
    private UUID parentDepartmentUuid;
    @Column(name = "parent_department_name")
    private String parentDepartmentName;
    @Column(name = "chief_person_uuid")
    private UUID chiefPersonUuid;
    @Column(name = "chief_person_name")
    private String chiefPersonName;
    @Column(name = "is_work_center")
    private Integer isWorkCenter;
    @Column(name = "is_work_center_str")
    private String isWorkCenterStr;
    @Column(name = "quality_check")
    private Integer qualityCheck;
    @Column(name = "quality_check_str")
    private String qualityCheckStr;
    @Column(name = "whse_check")
    private Integer whseCheck;
    @Column(name = "whse_check_str")
    private String whseCheckStr;
    @Column(name = "deleted")
    private Integer deleted;
    @Column(name = "deleted_str")
    private String deletedStr;
    @Column(name = "creation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @Column(name = "user_created")
    private String userCreated;
    @Column(name = "external_id")
    private String externalId;
    @Column(name = "dep_guid_pers")
    private UUID departmentGuidPers;
    @Column(name = "dep_guid_struct")
    private UUID departmentGuIdStruct;
    @Column(name = "dep_type_id")
    private Integer departmentsTypeId;
    @Column(name = "dep_type_name")
    private String departmentsName;
}
