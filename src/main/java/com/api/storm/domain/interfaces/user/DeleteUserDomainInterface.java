package com.api.storm.domain.interfaces.user;

import java.util.UUID;

public interface DeleteUserDomainInterface {
    String execute(UUID user);
}
