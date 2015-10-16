package com.antyzero.atp.inject.module;


import com.antyzero.atp.network.Api;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Singleton
@Module
public class NetworkModule {

    @Provides
    @Singleton
    public Api provideApi() {
        return new Api();
    }
}
