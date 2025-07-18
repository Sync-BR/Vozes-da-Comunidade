package com.vozesdacomunidade.init.valid;

import com.vozesdacomunidade.init.repository.ClientRepository;
import com.vozesdacomunidade.init.valid.validate.Validate;
import jakarta.validation.ValidationException;
import org.springframework.stereotype.Component;

@Component
public class PhoneValidate implements Validate<String> {
    private final ClientRepository repository;

    public PhoneValidate(ClientRepository repository) {
        this.repository = repository;
    }

    @Override
    public void validate(String object) {
        if(repository.findByClientPhoneNumber(object) != null){
            throw new ValidationException("O número do cliente informado já existe no sistema.");
        }
    }
}
