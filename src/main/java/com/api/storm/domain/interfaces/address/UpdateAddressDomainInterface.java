package com.api.storm.domain.interfaces.address;

import com.api.storm.domain.model.Address;

public interface UpdateAddressDomainInterface {
    Address execute(Address user);
}
