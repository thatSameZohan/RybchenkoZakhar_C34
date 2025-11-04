package com.entity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class PhoneEntity {

    @Id
    @UuidGenerator
    private UUID id;

    private Long number;

    @ManyToOne
    @ToString.Exclude
    private OrderEntity orderEntity;

    public PhoneEntity(Long number) {
        this.number = number;
    }
}