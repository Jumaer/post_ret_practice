package com.example.myapplication_post.ui_form_post;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreateUserClass {

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("title")
    @Expose
    private  String title;

    @SerializedName("body")
    @Expose
    private String body;

    @SerializedName("userId")
    @Expose
    private int userId;

    public CreateUserClass() {
    }

    public CreateUserClass(int id, String title, String body, int userId) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
