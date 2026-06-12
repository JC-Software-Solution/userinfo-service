package com.userinfo_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-info")
public class UserInfoController {

    // This is a simple endpoint to return user information. In a real application, you would typically fetch this information from a database or another service.
    @GetMapping()
    public ResponseEntity<?> getUserInfo() {
        return  ResponseEntity.ok("Jovanie");
    }
}
