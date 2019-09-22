package com.nurinyooo.petclinic.services.map;

import com.nurinyooo.petclinic.model.Speciality;
import com.nurinyooo.petclinic.services.SpecialitesService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialityMap extends AbstractMapService<Speciality,Long> implements SpecialitesService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
