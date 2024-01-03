package com.cydeo.service.impl;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.cydeo.model.Organization;
import com.cydeo.repository.OrganizationRepository;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {OrganizationServiceImpl.class})
@ExtendWith(SpringExtension.class)
class OrganizationServiceImplDiffblueTest {
    @MockBean
    private OrganizationRepository organizationRepository;

    @Autowired
    private OrganizationServiceImpl organizationServiceImpl;

    /**
     * Method under test: {@link OrganizationServiceImpl#create(Organization)}
     */
    @Test
    void testCreate() {
        Organization organization = new Organization();
        organization.setContactEmail("jane.doe@example.org");
        organization.setContactName("Contact Name");
        organization.setContactPhone("6625550144");
        organization.setId(1L);
        organization.setName("Name");
        when(organizationRepository.save(Mockito.<Organization>any())).thenReturn(organization);

        Organization organization2 = new Organization();
        organization2.setContactEmail("jane.doe@example.org");
        organization2.setContactName("Contact Name");
        organization2.setContactPhone("6625550144");
        organization2.setId(1L);
        organization2.setName("Name");
        Organization actualCreateResult = organizationServiceImpl.create(organization2);
        verify(organizationRepository).save(Mockito.<Organization>any());
        assertSame(organization, actualCreateResult);
    }

    /**
     * Method under test: {@link OrganizationServiceImpl#findById(Long)}
     */
    @Test
    void testFindById() throws Exception {
        Organization organization = new Organization();
        organization.setContactEmail("jane.doe@example.org");
        organization.setContactName("Contact Name");
        organization.setContactPhone("6625550144");
        organization.setId(1L);
        organization.setName("Name");
        Optional<Organization> ofResult = Optional.of(organization);
        when(organizationRepository.findById(Mockito.<Long>any())).thenReturn(ofResult);
        Organization actualFindByIdResult = organizationServiceImpl.findById(1L);
        verify(organizationRepository).findById(Mockito.<Long>any());
        assertSame(organization, actualFindByIdResult);
    }

    /**
     * Method under test: {@link OrganizationServiceImpl#findById(Long)}
     */
    @Test
    void testFindById2() throws Exception {
        Optional<Organization> emptyResult = Optional.empty();
        when(organizationRepository.findById(Mockito.<Long>any())).thenReturn(emptyResult);
        assertThrows(Exception.class, () -> organizationServiceImpl.findById(1L));
        verify(organizationRepository).findById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link OrganizationServiceImpl#delete(Long)}
     */
    @Test
    void testDelete() {
        doNothing().when(organizationRepository).deleteById(Mockito.<Long>any());
        organizationServiceImpl.delete(1L);
        verify(organizationRepository).deleteById(Mockito.<Long>any());
    }
}
