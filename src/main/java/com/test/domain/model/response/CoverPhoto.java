package com.test.domain.model.response;

/**
 * Created by BigFoot on 11.02.2016.
 */
public class CoverPhoto {
    private int id;
    private String url;
    private String uid;

    public String getUid() {
        return uid;
    }

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "cover_photo{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", uid='" + uid + '\'' +
                '}';
    }
}