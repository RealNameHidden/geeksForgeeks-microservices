package com.msgeekforgeeks.employee_service.feignclient;

import com.msgeekforgeeks.employee_service.model.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "address-service", url = "http://localhost:8081", path = "/address-service")
public interface AddressClient {

    @GetMapping("/address/{id}")
    public ResponseEntity<Address> getAddressByEmployeeId(@PathVariable("id") int id);

}

