package com.antyzero.atp.network.endpoint;

import com.antyzero.atp.network.model.Post;

import java.util.List;

import retrofit.http.GET;
import rx.Observable;

/**
 * API using http://jsonplaceholder.typicode.com/
 */
public interface JsonPlaceHolder {

    @GET("/posts")
    Observable<List<Post>> posts();
}
