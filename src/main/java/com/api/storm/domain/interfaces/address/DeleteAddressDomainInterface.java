package com.api.storm.domain.interfaces.address;

import java.util.UUID;

public interface DeleteAddressDomainInterface {
    String execute(UUID id);
}
