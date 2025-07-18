package com.vozesdacomunidade.init.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "PROFILE_CLIENT")
public class ProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String profileName;
    private String profileUrlName;
    private String profileBios;
    private byte[] profilePhoto;
    private int profileAges;
}
