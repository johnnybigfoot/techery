package com.test.domain.model.response;

import java.util.Arrays;

/**
 * Created by BigFoot on 12.02.2016.
 */
//TODO Need to migrate Object type of Activity and Dining to real classes
public class Bucket {
    private int id;
    private String uid;
    private String name;
    private String status;
    private String target_date;
    private String completed_at;
    private String created_at;
    private Category category;
    private String[] friends;
    private String description;
    private CoverPhoto cover_photo;
    private String link;
    private int likes_count;
    private boolean liked;
    private int comments_count;
    private String type;
    private Object dining;
    private Location location;
    private String[] tags;
    private String[] photos;
    private Object activity;

    public void setId(int id) {
        this.id = id;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTarget_date(String target_date) {
        this.target_date = target_date;
    }

    public void setCompleted_at(String completed_at) {
        this.completed_at = completed_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setFriends(String[] friends) {
        this.friends = friends;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCover_photo(CoverPhoto cover_photo) {
        this.cover_photo = cover_photo;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setLikes_count(int likes_count) {
        this.likes_count = likes_count;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDining(Object dining) {
        this.dining = dining;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void setPhotos(String[] photos) {
        this.photos = photos;
    }

    public void setActivity(Object activity) {
        this.activity = activity;
    }

    public Object getActivity() {
        return activity;
    }

    public Object getDining() {
        return dining;
    }

    public int getId() {
        return id;
    }

    public String getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getTarget_date() {
        return target_date;
    }

    public String getCompleted_at() {
        return completed_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public Category getCategory() {
        return category;
    }

    public String[] getFriends() {
        return friends;
    }

    public String getDescription() {
        return description;
    }

    public CoverPhoto getCover_photo() {
        return cover_photo;
    }

    public String getLink() {
        return link;
    }

    public int getLikes_count() {
        return likes_count;
    }

    public boolean isLiked() {
        return liked;
    }

    public int getComments_count() {
        return comments_count;
    }

    public String getType() {
        return type;
    }

    public Location getLocation() {
        return location;
    }

    public String[] getTags() {
        return tags;
    }

    public String[] getPhotos() {
        return photos;
    }

    @Override
    public String toString() {
        return "BucketResponse{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", target_date='" + target_date + '\'' +
                ", completed_at='" + completed_at + '\'' +
                ", created_at='" + created_at + '\'' +
                ", category=" + category +
                ", friends=" + Arrays.toString(friends) +
                ", description='" + description + '\'' +
                ", cover_photo=" + cover_photo +
                ", link='" + link + '\'' +
                ", likes_count=" + likes_count +
                ", liked=" + liked +
                ", comments_count=" + comments_count +
                ", type='" + type + '\'' +
                ", location=" + location +
                ", tags=" + Arrays.toString(tags) +
                ", photos=" + Arrays.toString(photos) +
                '}';
    }
}
