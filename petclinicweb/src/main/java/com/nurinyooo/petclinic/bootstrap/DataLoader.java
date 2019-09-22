package com.nurinyooo.petclinic.bootstrap;

import com.nurinyooo.petclinic.model.Owner;
import com.nurinyooo.petclinic.model.Pet;
import com.nurinyooo.petclinic.model.PetType;
import com.nurinyooo.petclinic.model.Vet;
import com.nurinyooo.petclinic.services.OwnerService;
import com.nurinyooo.petclinic.services.PetTypeService;
import com.nurinyooo.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private  final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(dog);

        Owner owner1 = new Owner();
        owner1.setFirstName("Rozerin");
        owner1.setLastName("Erdemci");
        owner1.setAddress("Diyarbakir");
        owner1.setCity("Diyarbakir 2");
        owner1.setTelephone("123456");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);
        ownerService.save(owner1);

        Owner owner2= new Owner();
        owner2.setFirstName("Nurullah");
        owner2.setLastName("Dursun");
        owner1.setAddress("İstanbul");
        owner1.setCity("Mardin");
        owner1.setTelephone("1234567890");

        Pet fionasCat = new Pet();
        fionasCat.setName("Just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        owner2.getPets().add(fionasCat);

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
