package com.example.myapplication_post;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.myapplication_post.post_object_pojos.Data;
import com.example.myapplication_post.post_object_pojos.MainPostObjectClass;
import com.example.myapplication_post.response.MainResponsePost;
import com.example.myapplication_post.retrofit_service.PostRequestResponseService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    Data data;
    MainPostObjectClass mainPostObjectClass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://app.fakejson.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        data = new Data("Jumaer","Ahamed","Hridoy","Jumaer Ahamed Hridoy","Jr","Android");
        mainPostObjectClass = new MainPostObjectClass("FE5ThJE_xrHs_JynE3qNLQ",data);
        PostRequestResponseService service = retrofit.create(PostRequestResponseService.class);
        Call<MainResponsePost> mainResponsePost =  service.getResponsePost(mainPostObjectClass);


        mainResponsePost.enqueue(new Callback<MainResponsePost>() {
            @Override
            public void onResponse(Call<MainResponsePost> call, Response<MainResponsePost> response) {

                if(response.code()==200){

                String f_name=    response.body().getNameFirst();
                String l_name=    response.body().getNameLast();
                String m_name=  response.body().getNameMiddle();
                String full_name= response.body().getName();
                String name_Pref = response.body().getNamePrefix();
                String name_Suffix = response.body().getNameSuffix();



                Log.d("f_name",f_name);
                Log.d("l_name",l_name);
                Log.d("m_name",m_name);
                Log.d("full_name",full_name);
                Log.d("name_pref",name_Pref);
                Log.d("name_Suffix",name_Suffix);


                }
                else{
                    Log.d("response","Net is ok but, it is not working (may be server issue), Failed");
                }

            }

            @Override
            public void onFailure(Call<MainResponsePost> call, Throwable t) {
               Log.d("response","It is not working, Failed");
            }
        });

    }
}