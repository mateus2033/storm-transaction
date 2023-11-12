package com.api.storm.application.validation.user;

import com.api.storm.domain.model.User;
import com.api.storm.presentation.dtos.user.CreateUserDTO;
import com.api.storm.utils.cellphone.CellphoneValidation;
import com.api.storm.utils.email.EmailValidation;
import com.api.storm.utils.message.user.UserMessage;
import com.api.storm.utils.taxvat.CpfValidation;
import com.api.storm.utils.timeconfig.DateValidation;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class CreateUserValidation {

    final PasswordEncoder encoder;

    public String message;

    public Boolean isValid;

    public String[] error;

    private CpfValidation cpfValidation;
    Map<String, Object> makeUser = new HashMap<>();

    public CreateUserValidation(PasswordEncoder encoder)
    {
        this.encoder = encoder;
    }

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
        if (name == null && name.isEmpty())
        {
            return UserMessage.REQUIRED;
        }

        if(!(name instanceof String))
        {
            return UserMessage.ONLY_STRING;
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
        if (lastName == null && lastName.isEmpty())
        {
            return UserMessage.REQUIRED;
        }

        if(!(lastName instanceof String))
        {
            return UserMessage.ONLY_STRING;
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
        if (cpf == null && cpf.isEmpty())
        {
            return UserMessage.REQUIRED;
        }

        if(!(cpf instanceof String))
        {
            return UserMessage.ONLY_STRING;
        }

        if (cpf.length() != 14)
        {
            return UserMessage.INVALID_CPF;
        }

        CpfValidation cpfValidation = new CpfValidation();
        if (!cpfValidation.execute(cpf))
        {
            return UserMessage.INVALID_CPF;
        }

        this.makeUser.put("cpf", cpf);
        return null;
    }

    private String _dataBirth(Date dataBirth)
    {
        if (dataBirth == null)
        {
            return UserMessage.REQUIRED;
        }

        DateValidation dateValidation = new DateValidation();
        if(!dateValidation.execute(dataBirth))
        {
            return UserMessage.INVALID_DATA;
        }

        this.makeUser.put("dataBirth", dataBirth);
        return null;
    }

    private String _cellphone(String cellphone)
    {
        if (cellphone == null && cellphone.isEmpty())
        {
            return UserMessage.REQUIRED;
        }

        if(!(cellphone instanceof String))
        {
            return UserMessage.ONLY_STRING;
        }

        CellphoneValidation cellphoneValidation = new CellphoneValidation();

        if (!cellphoneValidation.execute(cellphone))
        {
            return UserMessage.INVALID_CELLPHONE_NUMBER;
        }

        this.makeUser.put("cellphone",cellphone);
        return null;
    }

    private String _image(String image)
    {
        if (image == null && image.isEmpty())
        {
            return UserMessage.REQUIRED;
        }

        if(!(image instanceof String))
        {
            return UserMessage.ONLY_STRING;
        }

        this.makeUser.put("image",image);
        return null;
    }

    private String _email(String email)
    {
        if (email == null && email.isEmpty())
        {
            return UserMessage.REQUIRED;
        }

        if(!(email instanceof String))
        {
            return UserMessage.ONLY_STRING;
        }

        EmailValidation emailValidation = new EmailValidation();
        if(!emailValidation.execute(email))
        {
            return UserMessage.EMAIL_INVALID;
        }

        this.makeUser.put("email",email);
        return null;
    }

    private String _password(String password)
    {
        if (password == null && password.isEmpty())
        {
            return UserMessage.REQUIRED;
        }

        if(!(password instanceof String))
        {
            return UserMessage.ONLY_STRING;
        }

        if(password.length() < 8)
        {
            return UserMessage.MIN_LENGTH_EIGHT;
        }

        this.makeUser.put("email", encoder.encode(password));
        return null;
    }
}
