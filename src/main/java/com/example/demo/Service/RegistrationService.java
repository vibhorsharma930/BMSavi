package com.example.demo.Service;

import com.example.demo.payload.RegistrationDto;

public interface RegistrationService {
    RegistrationDto createRegistration(RegistrationDto registrationDto);

    void deleteRegistrationBYId(String id);

    RegistrationDto findData(String id);
}
