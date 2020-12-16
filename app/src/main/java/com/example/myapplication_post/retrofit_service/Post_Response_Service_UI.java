package com.example.myapplication_post.retrofit_service;

import com.example.myapplication_post.ui_form_post.CreateUserClass;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Post_Response_Service_UI {
    @FormUrlEncoded
    @POST("posts")
    Call<CreateUserClass> getUserClass(

              @Field("title") String title,
            @Field("body") String body,
            @Field("userId") int userId


    );
}
