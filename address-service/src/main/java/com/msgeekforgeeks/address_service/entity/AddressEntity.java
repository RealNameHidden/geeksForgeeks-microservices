package com.msgeekforgeeks.address_service.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "address")
@Getter
@Setter
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String city;
    String state;
    int employee_id;
}