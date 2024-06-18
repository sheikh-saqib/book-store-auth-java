package com.bookstore.BookStore.controllers;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {

    @GetMapping("/home")
    @PreAuthorize("hasRole('client')")
    public String home() {
        return "Home Page";
    }

    @GetMapping("/store")
    public String store() {
        return "Store Page";
    }

    @GetMapping("/admin/home")
    public String getAdminHome() {
        return "Admin Home Page";
    }

    @GetMapping("/client/home")
    public String getClientHome() {
        return "Client Home Page";
    }

}
