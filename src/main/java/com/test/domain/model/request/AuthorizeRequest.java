package com.test.domain.model.request;

/**
 * Created by BigFoot on 11.02.2016.
 */
public class AuthorizeRequest {
    private String username;
    private String password;

    public AuthorizeRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
