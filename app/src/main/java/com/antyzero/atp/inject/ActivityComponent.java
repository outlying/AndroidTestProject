package com.antyzero.atp.inject;


import com.antyzero.atp.MainActivity;
import com.antyzero.atp.inject.module.ActivityModule;

import dagger.Component;
import dagger.Subcomponent;

@Subcomponent(
        modules = {
                ActivityModule.class
        }
)
public interface ActivityComponent {

    void inject( MainActivity mainActivity );
}
