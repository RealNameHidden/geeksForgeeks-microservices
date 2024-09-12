package com.msgeekforgeeks.employee_service.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Address {

    private int id;
    private String city;
    private String state;

}
