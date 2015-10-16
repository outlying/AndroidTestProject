package com.antyzero.atp.inject;

import com.antyzero.atp.inject.module.ActivityModule;
import com.antyzero.atp.inject.module.ApplicationModule;
import com.antyzero.atp.inject.module.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                ApplicationModule.class,
                NetworkModule.class
        }
)
public interface ApplicationComponent {

    ActivityComponent plus( ActivityModule activityModule );
}
