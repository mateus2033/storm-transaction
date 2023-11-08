package com.api.storm.controllers;

import com.api.storm.application.services.user.*;
import com.api.storm.application.dtos.user.CreateUserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<Object> createUser(@RequestBody CreateUserDTO userDTO) throws Exception {
        var user = this.createUserApplication.execute(userDTO);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}
