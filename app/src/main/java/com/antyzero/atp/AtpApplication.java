package com.antyzero.atp;

import android.app.Application;
import android.content.Context;

import com.antyzero.atp.inject.ApplicationComponent;
import com.antyzero.atp.inject.DaggerApplicationComponent;
import com.antyzero.atp.inject.module.ApplicationModule;


public class AtpApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule( new ApplicationModule( this ) )
                .build();
    }

    public static AtpApplication get( Context context ) {
        return (AtpApplication) context.getApplicationContext();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
