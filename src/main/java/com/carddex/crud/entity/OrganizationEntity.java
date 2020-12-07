package com.carddex.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "organizations_user_v")
public class OrganizationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "organization_uuid")
    private UUID organizationUuid;
    @Column(name = "org_id")
    private String organizationId;
    @Column(name = "org_form")
    private String organizationForm;
    @Column(name = "parent_organization_uuid")
    private UUID parentOrganizationUuid;
    @Column(name = "parent_organization_name")
    private String parentOrganizationName;
    @Column(name = "short_name")
    private String shortName;
    @Column(name = "legal_name")
    private String legalName;
    @Column(name = "inn")
    private String inn;
    @Column(name = "legal_address")
    private String legalAddress;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "is_main")
    private Integer isMain;
    @Column(name = "is_main_str")
    private String isMainStr;
    @Column(name = "deleted")
    private Integer deleted;
    @Column(name = "deleted_str")
    private String deletedStr;
    @Column(name = "creation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @Column(name = "user_created")
    private String userCrated;
    @Column(name = "external_id")
    private Long externalId;
    @Column(name = "org_guid")
    private UUID organizationGuid;
}
