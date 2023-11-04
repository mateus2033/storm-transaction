package com.api.storm.domain.repositories;

import java.util.UUID;
import com.api.storm.domain.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
