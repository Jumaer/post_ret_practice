
package com.example.myapplication_post.post_object_pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MainPostObjectClass {

    @SerializedName("token")
    @Expose
    private String token;

    public MainPostObjectClass() {
    }

    @SerializedName("data")
    @Expose
    private Data data;

    public MainPostObjectClass(String token, Data data) {
        this.token = token;
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

}
