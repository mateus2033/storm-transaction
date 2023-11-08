package com.api.storm.domain.services.user;

import com.api.storm.domain.interfaces.user.GetUserByIdDomainInterface;
import com.api.storm.domain.model.User;
import com.api.storm.domain.repositories.UserRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.UUID;

@Service
public class GetUserByIdDomainService implements GetUserByIdDomainInterface {
    final UserRepository userRepository;

    public GetUserByIdDomainService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> execute(UUID id) throws Exception {
        Optional<User> response = this.userRepository.findById(id);
        if(response.isEmpty()) {
            throw new Exception("user not found");
        }
        return response;
    }
}
