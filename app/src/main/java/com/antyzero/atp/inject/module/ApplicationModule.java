package com.antyzero.atp.inject.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Singleton
@Module
public class ApplicationModule {

    private final Application application;

    public ApplicationModule(Application application){
        this.application = application;
    }

    @Provides @Singleton
    public Context provideContext(){
        return application;
    }
}
