package com.vozesdacomunidade.init.repository;

import com.vozesdacomunidade.init.model.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
    ClientEntity findByClientEmail(String email);
    ClientEntity findByClientPhoneNumber(String clientPhoneNumber);
}
