package com.example.android.retrofit;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * @Description:
 * @Author: huangyonghuang
 * @CreateDate: 2020/3/22 7:56 PM
 * @Email:huangyonghuang@doumi.com
 */
public interface ApiService {

    @GET("users/{user}/repos")
    Call<String> getResult(@Path("user") String user);
}
