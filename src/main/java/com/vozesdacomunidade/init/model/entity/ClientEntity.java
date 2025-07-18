package com.vozesdacomunidade.init.model.entity;

import com.vozesdacomunidade.init.model.enums.PermissionEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "CLIENT")
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String clientFullName;
    private String clientEmail;
    private String clientPhoneNumber;

    @OneToOne()
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private  AddressEntity clientAddress;
    @OneToOne()
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity clientUser;
    @OneToOne()
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private ProfileEntity clientProfile;

    @Enumerated(EnumType.STRING)
    private PermissionEnum permission;


}
