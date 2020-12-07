package com.carddex.crud.srvice;

import com.carddex.crud.dto.OrganizationDto;

public interface OrganisationService {
    OrganizationDto creatOrganization(OrganizationDto organization);
    OrganizationDto getOrganizationById(Long id);
}
