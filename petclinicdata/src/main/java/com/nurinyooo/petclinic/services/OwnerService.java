package com.nurinyooo.petclinic.services;

import com.nurinyooo.petclinic.model.Owner;

public interface OwnerService  extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);
}
