package com.nurinyooo.petclinic.repositories;

import com.nurinyooo.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {

}
