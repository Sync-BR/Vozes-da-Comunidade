package com.vozesdacomunidade.init.service;

import com.vozesdacomunidade.init.handle.exception.ResourceAlreadyExistsException;
import com.vozesdacomunidade.init.model.entity.ClientEntity;
import com.vozesdacomunidade.init.repository.ClientRepository;
import com.vozesdacomunidade.init.service.implement.ImplementExtends;
import com.vozesdacomunidade.init.valid.EmailValidate;
import com.vozesdacomunidade.init.valid.PhoneValidate;
import org.springframework.stereotype.Service;




@Service
public class ClientService implements ImplementExtends<ClientEntity> {
    private final EmailValidate validatorEmail;
    private final PhoneValidate validatorPhone;

    private final ClientRepository repository;

    public ClientService(EmailValidate emailValidator, PhoneValidate validatorPhone, ClientRepository repository) {
        this.validatorEmail = emailValidator;
        this.validatorPhone = validatorPhone;
        this.repository = repository;
    }

    /**
     * Salva um novo cliente no banco de dados após validar seus dados.
     *
     * <p>Este método realiza as seguintes validações antes de persistir o cliente:</p>
     * <ul>
     *   <li>Verifica se o e-mail do cliente é válido, através do validador {@code validatorEmail}</li>
     *   <li>Verifica se o número de telefone do cliente é válido, através do validador {@code validatorPhone}</li>
     * </ul>
     *
     * <p>Se os dados forem válidos, o cliente será salvo utilizando o repositório {@code repository}</p>
     *
     * @param object objeto do tipo {@link ClientEntity} contendo os dados do cliente a ser salvo
     * @throws ResourceAlreadyExistsException caso o e-mail ou telefone sejam inválidos
     * @throws ResourceAlreadyExistsException caso já exista um cliente com os mesmos dados
     *
     * @author Eduardo
     * @since 2025-07-18
     */

    @Override
    public void save(ClientEntity object) {
        validatorEmail.validate(object.getClientEmail());
        validatorPhone.validate(object.getClientPhoneNumber());
        repository.save(object);
    }

    @Override
    public void disable(ClientEntity object) {

    }

    @Override
    public ClientEntity update(ClientEntity object) {
        return null;
    }
}
