package com.example.myapplication_post.retrofit_service;

import com.example.myapplication_post.post_object_pojos.MainPostObjectClass;
import com.example.myapplication_post.response.MainResponsePost;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface PostRequestResponseService {


          @POST("q")
          Call<MainResponsePost> getResponsePost(@Body MainPostObjectClass mainPostObjectClass);
}
