package com.api.storm.domain.interfaces.address;

import com.api.storm.domain.model.Address;
import java.util.UUID;

public interface ShowAddressDomainInterface {
    Address execute(UUID id);
}
