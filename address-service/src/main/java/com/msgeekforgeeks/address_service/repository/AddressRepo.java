package com.msgeekforgeeks.address_service.repository;

import java.util.Optional;

import com.msgeekforgeeks.address_service.entity.AddressEntity;
import com.msgeekforgeeks.address_service.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

    @Query(
            nativeQuery = true,
            value
                    = "SELECT ea.id, ea.city, ea.state FROM address ea join employee e on e.id = ea.employee_id where ea.employee_id=:employeeId")
    Optional<AddressEntity> findAddressByEmployeeId(@Param("employeeId") int employeeId);
}
