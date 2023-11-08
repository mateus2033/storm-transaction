package com.api.storm.application.dtos.user;

import java.util.UUID;

public class DeleteUserDTO {

    private UUID id;

    public DeleteUserDTO(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
