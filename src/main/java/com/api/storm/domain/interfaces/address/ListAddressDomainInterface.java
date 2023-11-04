package com.api.storm.domain.interfaces.address;

import com.api.storm.domain.model.Address;

import java.util.List;

public interface ListAddressDomainInterface {
    List<Address> execute(int page, boolean paginate, int limit);
}
