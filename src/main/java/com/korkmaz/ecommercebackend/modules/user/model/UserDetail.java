package com.korkmaz.ecommercebackend.modules.user.model;

import lombok.Data;

@Data
public class UserDetail {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String defaultAddressId;
    private Gender gender;
}
