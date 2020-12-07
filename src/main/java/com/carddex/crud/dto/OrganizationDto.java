package com.carddex.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationDto {
    private UUID organizationUuid;
    private String organizationId;
    private String organizationForm;
    private UUID parentOrganizationUuid;
    private String parentOrganizationName;
    private String shortName;
    private String legalName;
    private String inn;
    private String legalAddress;
    private String phoneNumber;
    private Integer isMain;
    private String isMainStr;
    private Integer deleted;
    private String deletedStr;
    private Date creationDate;
    private String userCrated;
    private Long externalId;
    private UUID organizationGuid;
}
