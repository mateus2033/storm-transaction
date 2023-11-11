package com.api.storm.domain.services.user;

import com.api.storm.domain.interfaces.user.GetUserByCpfDomainInterface;
import com.api.storm.domain.model.User;
import com.api.storm.domain.repositories.UserRepository;
import com.api.storm.utils.message.user.UserMessage;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class GetUserByCpfDomainService implements GetUserByCpfDomainInterface {
    final UserRepository userRepository;

    public GetUserByCpfDomainService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> execute(String cpf) {
        return Optional.ofNullable(Optional.ofNullable(userRepository.findUserByCpf(cpf))
                .orElseThrow(() -> new RuntimeException(UserMessage.USER_NOT_FOUND))
        );
    }
}
