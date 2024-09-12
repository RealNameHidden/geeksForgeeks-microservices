package com.msgeekforgeeks.address_service.repository;

import java.util.Optional;

import com.msgeekforgeeks.address_service.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<AddressEntity, Integer> {

    @Query(
            nativeQuery = true,
            value
                    = "SELECT ea.id, ea.city, ea.state, ea.employee_id FROM address ea where ea.employee_id=:employeeId")
    Optional<AddressEntity>  findAddressByEmployeeId(@Param("employeeId") int employeeId);
}
