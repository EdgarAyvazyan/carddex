package com.carddex.crud.srvice.impl;

import com.carddex.crud.dto.OrganizationDto;
import com.carddex.crud.repository.OrganizationRepository;
import com.carddex.crud.srvice.OrganisationService;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl implements OrganisationService {

    private final OrganizationRepository repository;

    public OrganizationServiceImpl(OrganizationRepository repository) {
        this.repository = repository;
    }

    @Override
    public OrganizationDto creatOrganization(OrganizationDto organization) {
        return null;
    }

    @Override
    public OrganizationDto getOrganizationById(Long id) {
        return null;
    }
}
