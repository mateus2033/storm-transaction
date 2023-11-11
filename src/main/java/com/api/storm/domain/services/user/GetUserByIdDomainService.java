package com.api.storm.domain.services.user;

import com.api.storm.domain.interfaces.user.GetUserByIdDomainInterface;
import com.api.storm.domain.model.User;
import com.api.storm.domain.repositories.UserRepository;
import com.api.storm.utils.message.user.UserMessage;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.UUID;

@Service
public class GetUserByIdDomainService implements GetUserByIdDomainInterface {
    final UserRepository userRepository;

    public GetUserByIdDomainService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> execute(UUID id) {
        return Optional.ofNullable(Optional.ofNullable(userRepository.findUserById(id))
                .orElseThrow(() -> new RuntimeException(UserMessage.USER_NOT_FOUND))
        );
    }
}
