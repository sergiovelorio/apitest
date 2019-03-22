package com.example.sergiovelorio.apitest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;

public class PhotoHandler extends RetroBase {
    private Photo routes;

    public PhotoHandler(AppCompatActivity appCompatActivity){
        super(appCompatActivity);
        routes = retroft.create(Photo.class);
    }

    public void photos(Callback<ResponseBody> callBack){
        Call<ResponseBody> call = routes.photos();
        call.enqueue(callBack);
    }
}
