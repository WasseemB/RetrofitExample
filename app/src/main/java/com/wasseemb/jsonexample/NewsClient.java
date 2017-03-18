package com.wasseemb.jsonexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Wasseem on 15/03/2017.
 */

public interface NewsClient {
    @GET("articles/?apiKey=504afa2551f146cbada4dccce50ddae2")
    Call<NewsResponse> getArticles(@Query("source") String source, @Query("sortBy") String sortBy

    );

}
