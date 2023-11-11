package com.api.storm.application.validation.user;

import com.api.storm.domain.model.User;
import com.api.storm.presentation.dtos.user.CreateUserDTO;
import com.api.storm.utils.message.user.UserMessage;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class CreateUserValidation {

    public String message;
    public Boolean isValid;
    public String[] error;
    Map<String, String> makeUser = new HashMap<>();

    public Optional<User> execute(CreateUserDTO user)
    {
        Map<String, String> response = this.validateUser(user);
        return null;
    }

    private Optional<User> mountUser(CreateUserDTO user)
    {
        return null;
    }

    private Map<String, String> validateUser(CreateUserDTO user)
    {
        Map<String, String> mapUser = new HashMap<>();
        mapUser.put("name", this._name(user.getName()));
        mapUser.put("lastName", this._lastName(user.getLastName()));
        mapUser.put("cpf", this._cpf(user.getCpf()));
        mapUser.put("dataBirth", this._dataBirth(user.getDataBirth()));
        mapUser.put("cellphone", this._cellphone(user.getCellphone()));
        mapUser.put("image", this._image(user.getImage()));
        mapUser.put("email", this._email(user.getEmail()));
        mapUser.put("password", this._password(user.getPassword()));
        return null;
    }

    private String _name(String name)
    {
        if (name != null && !name.isEmpty())
        {
            return UserMessage.REQUIRED;
        }

        if (name.length() >= 100)
        {
            return  UserMessage.MAX_LENGTH_ONE_HUNDRED;
        }

        this.makeUser.put("name",name);
        return null;
    }

    private String _lastName(String lastName)
    {
        if (lastName != null && !lastName.isEmpty())
        {
            return UserMessage.REQUIRED;
        }

        if (lastName.length() >= 100)
        {
            return  UserMessage.MAX_LENGTH_ONE_HUNDRED;
        }

        this.makeUser.put("lastName",lastName);
        return null;
    }

    private String _cpf(String cpf)
    {
        return null;
    }

    private String _dataBirth(Date dataBirth)
    {
        return null;
    }

    private String _cellphone(String cellphone)
    {
        return null;
    }

    private String _image(String image)
    {
        return null;
    }

    private String _email(String email)
    {
        return null;
    }

    private String _password(String password)
    {
        return null;
    }
}
