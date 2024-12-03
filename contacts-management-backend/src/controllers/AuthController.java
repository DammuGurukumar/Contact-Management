package controllers;

import utils.SimpleResponse;

public class AuthController {
    public static SimpleResponse authenticate(String username, String password) {
        if ("admin".equals(username) && "password".equals(password)) {
            return new SimpleResponse(true, "Login successful");
        }
        return new SimpleResponse(false, "Invalid credentials");
    }
}
