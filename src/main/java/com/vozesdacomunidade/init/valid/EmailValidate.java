package com.vozesdacomunidade.init.valid;

import com.vozesdacomunidade.init.handle.exception.ResourceAlreadyExistsException;
import com.vozesdacomunidade.init.repository.ClientRepository;
import com.vozesdacomunidade.init.valid.validate.Validate;
import org.springframework.stereotype.Component;

@Component
public class EmailValidate implements Validate<String> {
    private final ClientRepository repository;

    public EmailValidate(ClientRepository repository) {
        this.repository = repository;
    }

    @Override
    public void validate(String object) {
        if(repository.findByClientEmail(object) != null){
            throw new ResourceAlreadyExistsException("Este e-mail já está cadastrado no sistema.");
        }
    }
}
