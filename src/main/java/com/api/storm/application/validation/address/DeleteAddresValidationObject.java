package com.api.storm.application.validation.address;

import com.api.storm.utils.message.address.AddressMessage;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class DeleteAddresValidationObject {
    @NotBlank(message = AddressMessage.REQUIRED)
    private UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
