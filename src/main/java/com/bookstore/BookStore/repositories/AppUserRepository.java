package com.bookstore.BookStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.BookStore.models.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {

    public AppUser findByUsername(String username);

    public AppUser findByEmail(String email);
}
