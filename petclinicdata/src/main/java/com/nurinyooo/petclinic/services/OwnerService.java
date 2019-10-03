package com.nurinyooo.petclinic.services;

import com.nurinyooo.petclinic.model.Owner;

import java.util.List;

public interface OwnerService  extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
