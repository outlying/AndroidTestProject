package com.antyzero.atp.network;

import com.antyzero.atp.network.endpoint.JsonPlaceHolder;
import com.squareup.okhttp.HttpUrl;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

/**
 *
 */
public class Api {

    private static final String DEFAULT_API_URL = "http://jsonplaceholder.typicode.com/";

    private final JsonPlaceHolder jsonplaceholder;

    public Api() {
        this( HttpUrl.parse( DEFAULT_API_URL ) );
    }

    public Api( HttpUrl httpUrl ) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl( httpUrl )
                .addCallAdapterFactory( RxJavaCallAdapterFactory.create() )
                .addConverterFactory( GsonConverterFactory.create() )
                .build();

        jsonplaceholder = retrofit.create( JsonPlaceHolder.class );
    }

    public JsonPlaceHolder getJsonplaceholder() {
        return jsonplaceholder;
    }
}
