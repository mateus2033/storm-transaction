package com.api.storm.domain.services.address;

import com.api.storm.domain.interfaces.address.UpdateAddressDomainInterface;
import com.api.storm.domain.model.Address;
import com.api.storm.domain.repositories.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class UpdateAddressDomainService implements UpdateAddressDomainInterface {

    final AddressRepository addressRepository;

    public UpdateAddressDomainService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address execute(Address user) {
        return null;
    }
}
