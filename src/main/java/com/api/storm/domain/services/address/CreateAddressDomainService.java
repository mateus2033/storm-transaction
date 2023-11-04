package com.api.storm.domain.services.address;

import com.api.storm.domain.interfaces.address.CreateAddressDomainInterface;
import com.api.storm.domain.model.Address;
import com.api.storm.domain.repositories.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateAddressDomainService implements CreateAddressDomainInterface {

    final AddressRepository addressRepository;

    public CreateAddressDomainService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address execute(Address address) {
        return null;
    }
}
