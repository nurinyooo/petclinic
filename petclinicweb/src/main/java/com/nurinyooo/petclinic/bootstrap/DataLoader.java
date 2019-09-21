package com.nurinyooo.petclinic.bootstrap;

import com.nurinyooo.petclinic.model.Owner;
import com.nurinyooo.petclinic.model.Vet;
import com.nurinyooo.petclinic.services.OwnerService;
import com.nurinyooo.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private  final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Rozerin");
        owner1.setLastName("Erdemci");

        ownerService.save(owner1);

        Owner owner2= new Owner();
        owner2.setFirstName("Nurullah");
        owner2.setLastName("Dursun");

        ownerService.save(owner2);

        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Same");
        vet2.setLastName("Axem");

        vetService.save(vet2);

        System.out.println("Loading Vets...");
    }
}
