package com.antyzero.atp.inject;

import com.antyzero.atp.inject.module.ApplicationModule;
import com.antyzero.atp.inject.module.NetworkModule;

import dagger.Component;

@Component(
        modules = {
                ApplicationModule.class,
                NetworkModule.class
        }
)
public interface ApplicationComponent {

    ActivityComponent plus();
}
