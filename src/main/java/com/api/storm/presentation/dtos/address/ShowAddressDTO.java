package com.api.storm.presentation.dtos.address;

import java.util.UUID;

public class ShowAddressDTO {

    private UUID id;

    public ShowAddressDTO(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
