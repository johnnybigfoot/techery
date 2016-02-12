package com.test.domain.model.response;

/**
 * Created by BigFoot on 11.02.2016.
 */
public class Location {
    private int id;
    private String name;
    private String url;
    private String description;
    private String short_description;
    private CoverPhoto cover_photo;

    public CoverPhoto getCover_photo() {
        return cover_photo;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public String getShort_description() {
        return short_description;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", short_description='" + short_description + '\'' +
                ", cover_photo=" + cover_photo +
                '}';
    }
}
