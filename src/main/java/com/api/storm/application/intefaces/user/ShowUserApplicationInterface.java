package com.api.storm.application.intefaces.user;

import com.api.storm.domain.model.User;
import java.util.UUID;

public interface ShowUserApplicationInterface {
    User execute(UUID id);
}
