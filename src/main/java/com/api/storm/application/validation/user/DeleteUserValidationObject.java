package com.api.storm.application.validation.user;

import com.api.storm.utils.message.user.UserMessage;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class DeleteUserValidationObject {
    @NotBlank(message = UserMessage.REQUIRED)
    private UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
