package com.api.storm.domain.interfaces.user;

import com.api.storm.domain.model.User;
import java.util.Optional;
import java.util.UUID;

public interface GetUserByIdDomainInterface {

    Optional<User> execute(UUID id) throws Exception;
}
