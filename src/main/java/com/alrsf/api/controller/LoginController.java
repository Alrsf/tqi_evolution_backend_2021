package com.alrsf.api.controller;

import com.alrsf.api.controller.request.LoginRequest;
import com.alrsf.api.service.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginController {

    private final LoginService service;

    public LoginController(LoginService service){
        this.service = service;
    }

    @PostMapping
    public void login(@RequestBody LoginRequest request) {
        service.login(request.getEmail(), request.getSenha()); }

}
