package org.example.authservice.service;

import org.example.authservice.model.UserCredential;

public interface AuthService {
    public String saveUser(UserCredential userCredential);
    public String generateToken(String username);
    public void validateToken(String token);

}
