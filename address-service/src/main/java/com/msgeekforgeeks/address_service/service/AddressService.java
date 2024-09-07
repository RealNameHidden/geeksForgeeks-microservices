package com.msgeekforgeeks.address_service.service;

import com.msgeekforgeeks.address_service.entity.AddressEntity;
import com.msgeekforgeeks.address_service.model.Address;
import com.msgeekforgeeks.address_service.repository.AddressRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private ModelMapper mapper;

    public Address findAddressByEmployeeId(int employeeId) {
        Optional<AddressEntity> addressByEmployeeId = addressRepo.findAddressByEmployeeId(employeeId);
        Address addressResponse = mapper.map(addressByEmployeeId, Address.class);
        return addressResponse;
    }

}