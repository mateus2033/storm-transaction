package com.api.storm.presentation.dtos.address;

import java.util.UUID;

public class DeleteAddressDTO {
    private UUID id;

    public DeleteAddressDTO(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
