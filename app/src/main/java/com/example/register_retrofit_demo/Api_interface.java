package com.example.register_retrofit_demo;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api_interface {
    @FormUrlEncoded
    @POST("register.php")
    Call<model_class> MODEL_CLASS_CALL(@Field("name") String name, @Field("email") String email, @Field("password") String password);

}
