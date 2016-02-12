package com.test.domain.model.request;

import java.util.Arrays;

/**
 * Created by BigFoot on 12.02.2016.
 */
public class BucketRequest {
    private String type;
    private int id;
    private int category_id;
    private String description;
    private String target_data;
    private String[] friends;
    private String status;

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public BucketRequest(String type, int id) {
        this.type = type;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTarget_data() {
        return target_data;
    }

    public void setTarget_data(String target_data) {
        this.target_data = target_data;
    }

    public String[] getFriends() {
        return friends;
    }

    public void setFriends(String[] friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "TripRequest{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", category_id=" + category_id +
                ", description='" + description + '\'' +
                ", target_data='" + target_data + '\'' +
                ", friends=" + Arrays.toString(friends) +
                ", status='" + status + '\'' +
                '}';
    }
}
