package com.api.storm.domain.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 200)
    private String name;

    @Column(nullable = false, length = 200)
    private String lastName;

    @Column(nullable = false, length = 14, unique = true)
    private String cpf;

    @Column(nullable = false)
    private Date dataBirth;

    @Column(nullable = false, length = 20)
    private String cellphone;

    @Column(nullable = true, length = 255)
    private String image;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, length = 255)
    private String password;

    public User(UUID id, String name, String lastName, String cpf, Date dataBirth, String cellphone, String image, String email, String password) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.cpf = cpf;
        this.dataBirth = dataBirth;
        this.cellphone = cellphone;
        this.image = image;
        this.email = email;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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
