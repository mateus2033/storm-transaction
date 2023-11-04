package com.api.storm.domain.services.address;

import com.api.storm.domain.interfaces.address.ShowAddressDomainInterface;
import com.api.storm.domain.model.Address;
import com.api.storm.domain.repositories.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ShowAddressDomainService implements ShowAddressDomainInterface {
    final AddressRepository addressRepository;

    public ShowAddressDomainService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address execute(UUID id) {
        return null;
    }
}
