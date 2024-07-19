package com.example.demo.Controller;

import com.example.demo.Entity.Registration;
import com.example.demo.Repositery.RegistrationRepositery;
import com.example.demo.Service.RegistrationService;
import com.example.demo.payload.RegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/registration")
public class RegistrationController {

   private RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping
    public ResponseEntity<RegistrationDto>  createRegistration(@RequestBody RegistrationDto registrationDto){


        System.out.println(registrationDto.getEmail());
        RegistrationDto registrationDto1 = registrationService.createRegistration(registrationDto);

        return new ResponseEntity<>(registrationDto1, HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteRegistration(@RequestParam String id){

        System.out.println(id);
        registrationService.deleteRegistrationBYId(id);
        return new ResponseEntity<>("delete successfully",HttpStatus.OK);
    }
@GetMapping
    public ResponseEntity<?> getData(@RequestParam String id){

        RegistrationDto registrationDto=registrationService.findData(id);
        return new ResponseEntity<>(registrationDto,HttpStatus.OK);
}


}
