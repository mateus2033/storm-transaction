package com.api.storm.domain.services.user;

import com.api.storm.domain.interfaces.user.GetUserByEmailDomainInterface;
import com.api.storm.domain.model.User;
import com.api.storm.domain.repositories.UserRepository;
import com.api.storm.utils.message.user.UserMessage;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class GetUserByEmailDomainService implements GetUserByEmailDomainInterface {
    final UserRepository userRepository;

    public GetUserByEmailDomainService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> execute(String email) {
        return Optional.ofNullable(Optional.ofNullable(userRepository.findUserByEmail(email))
                .orElseThrow(() -> new RuntimeException(UserMessage.USER_NOT_FOUND))
        );
    }
}
