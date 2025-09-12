package com.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.time.Instant;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter @Setter
@ToString
public class OrderEntity {

    @Id
    @UuidGenerator
    private UUID id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Type type;
    @CreationTimestamp
    private Instant created;
    @Embedded
    private AddressEntity address;
    private Long cost;
    @Convert(converter =org.hibernate.type.YesNoConverter.class)
    private boolean priority;

    public OrderEntity(String name, Type type, Instant created,AddressEntity address, Long cost, boolean priority) {
        this.name = name;
        this.type = type;
        this.created = created;
        this.address = address;
        this.cost = cost;
        this.priority = priority;
    }

    public enum Type{
        PHONE,
        LAPTOP,
        HEADPHONES,
        TV,
        OTHER
    }

}
