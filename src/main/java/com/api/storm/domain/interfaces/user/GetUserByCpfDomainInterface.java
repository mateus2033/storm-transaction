package com.api.storm.domain.interfaces.user;

import com.api.storm.domain.model.User;
import java.util.Optional;

public interface GetUserByCpfDomainInterface {
    Optional<User> execute(String cpf) throws Exception;
}
