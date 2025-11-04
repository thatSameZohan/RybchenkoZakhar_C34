package com.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
@ToString
public class AddressEntity {

    @Id
    @UuidGenerator
    private UUID id;

    private String city;
    private String street;
    private String houseNumber;


    @OneToOne(mappedBy = "address")
    @ToString.Exclude
    private OrderEntity orderEntity;

    public  AddressEntity(String city, String street, String houseNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }
}