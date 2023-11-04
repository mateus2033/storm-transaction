package com.api.storm.domain.interfaces.address;

import com.api.storm.domain.model.Address;

public interface CreateAddressDomainInterface {
    Address execute(Address address);
}
