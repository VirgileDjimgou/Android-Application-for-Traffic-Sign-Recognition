package com.roadassistant.di.modules;

import android.content.Context;

import com.roadassistant.application.CarAssistantApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private CarAssistantApplication context;

    public ApplicationModule(CarAssistantApplication context) {
        this.context = context;
    }

    @Provides
    @Singleton
    Context provideApplicationContext(){
        return context;
    }

}
