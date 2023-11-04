package com.api.storm.application.validation.user;

import com.api.storm.utils.message.user.UserMessage;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

public class CreateUserValidationObject {
    @NotBlank(message = UserMessage.REQUIRED)
    @Pattern(regexp = "^[A-Z]*$", message = UserMessage.ONLY_STRING)
    @Size(max=200, message = UserMessage.MAX_LENGTH_TWO_HUNDRED)
    private String name;

    @NotBlank(message = UserMessage.REQUIRED)
    @Pattern(regexp = "^[A-Z]*$", message = UserMessage.ONLY_STRING)
    @Size(max=200, message = UserMessage.MAX_LENGTH_TWO_HUNDRED)
    private String lastName;

    @NotBlank(message = UserMessage.REQUIRED)
    @Pattern(regexp = "^[A-Z]*$", message = UserMessage.ONLY_STRING)
    @Size(max=14,message = UserMessage.MAX_LENGTH_FOURTEEN)
    private String cpf;

    @NotBlank(message = UserMessage.REQUIRED)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataBirth;

    @NotBlank(message = UserMessage.REQUIRED)
    @Pattern(regexp = "^[A-Z]*$", message = UserMessage.ONLY_STRING)
    @Size(max=20, message = UserMessage.MAX_LENGTH_TWENTY)
    private String cellphone;

    @Size(max=255, message = UserMessage.MAX_LENGTH_TWO_HUNDRED_FIFTY_FIVE)
    @Pattern(regexp = "^[A-Z]*$", message = UserMessage.ONLY_STRING)
    private String image;

    @NotBlank(message = UserMessage.REQUIRED)
    @Pattern(regexp = "^[A-Z]*$", message = UserMessage.ONLY_STRING)
    @Size(max=255, message = UserMessage.MAX_LENGTH_TWO_HUNDRED_FIFTY_FIVE)
    private String email;

    @NotBlank(message = UserMessage.REQUIRED)
    @Pattern(regexp = "^[A-Z]*$", message = UserMessage.ONLY_STRING)
    @Size(max=255, message = UserMessage.MAX_LENGTH_TWO_HUNDRED_FIFTY_FIVE)
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataBirth() {
        return dataBirth;
    }

    public void setDataBirth(Date dataBirth) {
        this.dataBirth = dataBirth;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
