package com.antyzero.atp.network;

import com.antyzero.atp.network.endpoint.JsonPlaceHolder;

import retrofit.Retrofit;

/**
 *
 */
public class Api {

    private final JsonPlaceHolder jsonplaceholder;

    public Api() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl( "http://jsonplaceholder.typicode.com" )
                .build();

        jsonplaceholder = retrofit.create( JsonPlaceHolder.class );
    }

    public JsonPlaceHolder getJsonplaceholder() {
        return jsonplaceholder;
    }
}
