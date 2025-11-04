package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
@ToString
public class CarEntity {

    @Id
    @UuidGenerator
    private UUID id;
    @Enumerated(EnumType.STRING)
    private Brand brand;
    private Long cost;
    private Integer mileage;
    private Integer year;

    public CarEntity(Brand brand, Long cost, Integer mileage, Integer year) {
        this.brand = brand;
        this.cost = cost;
        this.mileage = mileage;
        this.year = year;
    }

    public enum Brand {
        BMW,
        FORD,
        AUDI,
        NISSAN,
        MITSUBISHI,
        TOYOTA
    }
}
