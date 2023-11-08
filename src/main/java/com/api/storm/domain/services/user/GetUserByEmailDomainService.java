package com.api.storm.domain.services.user;

import com.api.storm.domain.interfaces.user.GetUserByEmailDomainInterface;
import com.api.storm.domain.model.User;
import com.api.storm.domain.repositories.UserRepository;
import com.api.storm.utils.message.user.UserMessage;
import org.springframework.stereotype.Service;

@Service
public class GetUserByEmailDomainService implements GetUserByEmailDomainInterface {
    final UserRepository userRepository;

    public GetUserByEmailDomainService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(String email) throws Exception {
        User user = this.userRepository.findUserByEmail(email);
        if(user == null) {
            throw new Exception(UserMessage.EMAIL_REGISTERED);
        }
        return user;
    }
}
