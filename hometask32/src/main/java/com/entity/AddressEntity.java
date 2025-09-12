package com.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
@ToString
public class AddressEntity {

    private String city;
    private String street;
    private String houseNumber;

}
