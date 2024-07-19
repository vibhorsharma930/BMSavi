package com.example.demo.Service;

import com.example.demo.Entity.Registration;
import com.example.demo.Repositery.RegistrationRepositery;
import com.example.demo.payload.RegistrationDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RegistrationServiceImpl implements RegistrationService{

    private RegistrationRepositery registrationRepositery;


    public RegistrationServiceImpl(RegistrationRepositery registrationRepositery) {
        this.registrationRepositery = registrationRepositery;
    }


    @Override
    public RegistrationDto createRegistration(RegistrationDto registrationDto) {
        Registration registration= this.mapToEntity(registrationDto);
        Registration registration1 = registrationRepositery.save(registration);
       RegistrationDto registrationDto1= this.mapToDto(registration1);


        return registrationDto1;


    }

    @Override
    public void deleteRegistrationBYId(String id) {


         registrationRepositery.deleteById(id);

    }

    @Override
    public RegistrationDto findData(String id) {


        Optional<Registration> byId = registrationRepositery.findById(id);
        Registration registration = byId.get();
        RegistrationDto registrationDto = this.mapToDto(registration);
        return registrationDto;
    }

    private RegistrationDto mapToDto(Registration registration1) {
        RegistrationDto registrationDto = new RegistrationDto();
        registrationDto.setEmail(registration1.getEmail());
        registrationDto.setName(registration1.getName());
        registrationDto.setId(registration1.getId());
        registrationDto.setMobile(registration1.getMobile());
        return  registrationDto;


    }

    private Registration mapToEntity(RegistrationDto registrationDto) {
        Registration registration=new Registration();
        registration.setMobile(registrationDto.getMobile());
        registration.setEmail(registrationDto.getEmail());
        registration.setId(registrationDto.getId());
        registration.setName(registrationDto.getName());


        return registration;



    }
}
