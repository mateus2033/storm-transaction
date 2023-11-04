package com.api.storm.controllers;

import com.api.storm.application.services.user.*;
import com.api.storm.application.validation.user.CreateUserValidationObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/user")
public class UserController {

    final ListUserApplicationService listUserApplication;
    final CreateUserApplicationService createUserApplication;
    final DeleteUserApplicationService deleteUserApplication;
    final ShowUserApplicationService showUserApplication;
    final UpdateUserApplicationService UpdateUserApplication;

    public UserController(
         ListUserApplicationService listUserApplication,
         CreateUserApplicationService createUserApplication,
         DeleteUserApplicationService deleteUserApplication,
         ShowUserApplicationService showUserApplication,
         UpdateUserApplicationService UpdateUserApplication
    ){
        this.listUserApplication = listUserApplication;
        this.createUserApplication = createUserApplication;
        this.deleteUserApplication = deleteUserApplication;
        this.showUserApplication = showUserApplication;
        this.UpdateUserApplication = UpdateUserApplication;
    }

    @PostMapping
    public ResponseEntity<Object> createUser(@RequestBody @Valid CreateUserValidationObject createUserValidationObject) {
        return null;
    }

}
