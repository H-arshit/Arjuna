package com.example.harshit.arjunatextextractor;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by harshit on 13/10/17.
 */

public interface Api {


    String BASE_URL = "http://192.168.0.114:5000/";



    @POST("uploadimage")
    Call<ResultData> getresult(@Body RequestData requestData);
}
