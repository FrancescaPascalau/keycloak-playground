package com.francesca.pascalau.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @RequestMapping("/admin")
    public String getAdminPath() {
        return "Hello Admin!";
    }

    @RequestMapping("/user")
    public String getUserPath() {
        return "Hello User!";
    }
}