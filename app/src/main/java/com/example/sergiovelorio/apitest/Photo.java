package com.example.sergiovelorio.apitest;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface Photo {
    @Headers({"Accept:application/json","Content-Type:application/json"})
    @GET("photos")
    Call<ResponseBody> photos();
}
