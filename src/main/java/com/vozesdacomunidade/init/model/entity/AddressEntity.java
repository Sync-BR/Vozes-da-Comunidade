package com.vozesdacomunidade.init.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "CLIENT ADDRESS")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String postalCode;
    private String street;
    private String complement;
    private String unit;
    private String neighborhood ;
    private String city;
    private String stateCode;
    private String state;
    private String region;
    private String ibgeCode;
    private String giaCode;
    private String areaCode;
    private String siafiCode;
}
