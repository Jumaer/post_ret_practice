package com.example.myapplication_post;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.myapplication_post.retrofit_service.Post_Response_Service_UI;
import com.example.myapplication_post.ui_form_post.CreateUserClass;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainMove2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_move2);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Post_Response_Service_UI service_ui = retrofit.create(Post_Response_Service_UI.class);
      Call<CreateUserClass> createUserClass = service_ui.getUserClass("Nothing","What to do ?? ",234);
      createUserClass.enqueue(new Callback<CreateUserClass>() {
          @Override
          public void onResponse(Call<CreateUserClass> call, Response<CreateUserClass> response) {

           if(response.isSuccessful()){
               String body =   response.body().getBody();
               String title = response.body().getTitle();
               int Uid =  response.body().getUserId();


               Log.d("body",body);
               Log.d("title",title);
               Log.d("userId", String.valueOf(Uid));



           }

          else{
               Log.d("True Display","Something Wrong may be");
           }






          }

          @Override
          public void onFailure(Call<CreateUserClass> call, Throwable t) {

              Log.d("False Display","Net Problem");

          }
      });
    }
}