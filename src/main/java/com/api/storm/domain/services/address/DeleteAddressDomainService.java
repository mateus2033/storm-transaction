package com.api.storm.domain.services.address;

import com.api.storm.domain.interfaces.address.DeleteAddressDomainInterface;
import com.api.storm.domain.repositories.AddressRepository;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class DeleteAddressDomainService implements DeleteAddressDomainInterface {
    final AddressRepository addressRepository;

    public DeleteAddressDomainService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public String execute(UUID id) {
        return null;
    }
}
