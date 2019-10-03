package com.nurinyooo.petclinic.services.map;

import com.nurinyooo.petclinic.model.Owner;
import com.nurinyooo.petclinic.services.OwnerService;
import lombok.experimental.SuperBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {

    OwnerService ownerService;

    @BeforeEach
    void setUp() {
        ownerService = new OwnerServiceMap(new PetTypeMap(), new PetServiceMap());

    }

    @Test
    void findAll() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void delete() {
    }

    @Test
    void save() {
    }

    @Test
    void findById() {
    }

    @Test
    void findByLastName() {
    }
}