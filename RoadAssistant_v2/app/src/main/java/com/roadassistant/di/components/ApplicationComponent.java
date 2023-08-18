package com.roadassistant.di.components;

import android.content.Context;

import com.roadassistant.di.modules.ApplicationModule;
import com.roadassistant.managers.SharedPreferencesManager;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    // объекты из модулей, которые будут доступны дочерним компонентам:
    Context context();
    SharedPreferencesManager sharedPreferences();

}
