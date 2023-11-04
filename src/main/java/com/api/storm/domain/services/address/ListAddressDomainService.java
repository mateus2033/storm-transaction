package com.api.storm.domain.services.address;

import com.api.storm.domain.interfaces.address.ListAddressDomainInterface;
import com.api.storm.domain.model.Address;
import com.api.storm.domain.repositories.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListAddressDomainService implements ListAddressDomainInterface {
    final AddressRepository addressRepository;

    public ListAddressDomainService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public List<Address> execute(int page, boolean paginate, int limit) {
        return null;
    }
}
