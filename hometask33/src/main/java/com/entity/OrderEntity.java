package com.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
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

    private Long cost;

    @Convert(converter =org.hibernate.type.YesNoConverter.class)
    private boolean priority;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private AddressEntity address;

    @OneToMany(mappedBy = "orderEntity", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<PhoneEntity> phones;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @ToString.Exclude
    @JoinTable(name = "orders_cour_join", joinColumns = @JoinColumn(name = "orders_id"), inverseJoinColumns = @JoinColumn(name = "cour_id"))
    List<CourierEntity> couriers=new ArrayList<>();

    public OrderEntity(String name, Type type, Instant created, Long cost, boolean priority) {
        this.name = name;
        this.type = type;
        this.created = created;
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

    public void addPhone(PhoneEntity phone) {
        if (phones == null) {
            phones = new ArrayList<>();
        }

        phones.add(phone);
        phone.setOrderEntity(this);
    }

    public void addCourier(CourierEntity courier) {

        couriers.add(courier);
        courier.getOrders().add(this);
    }
}