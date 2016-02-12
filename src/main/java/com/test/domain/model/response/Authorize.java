package com.test.domain.model.response;

import java.util.Arrays;

/**
 * Created by BigFoot on 11.02.2016.
 */
public class Authorize {
    private String token;
    private String sso_token;
    private Object[] settings;
    private Object user;
    private Object[] permissions;

    public String getToken() {
        return token;
    }

    public String getSso_token() {
        return sso_token;
    }

    public Object[] getPermissions() {
        return permissions;
    }

    public Object[] getSettings() {
        return settings;
    }

    public Object getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "AuthorizeResponse{" +
                "token='" + token + '\'' +
                ", sso_token='" + sso_token + '\'' +
                ", settings=" + Arrays.toString(settings) +
                ", user=" + user +
                ", permissions=" + Arrays.toString(permissions) +
                '}';
    }
}
