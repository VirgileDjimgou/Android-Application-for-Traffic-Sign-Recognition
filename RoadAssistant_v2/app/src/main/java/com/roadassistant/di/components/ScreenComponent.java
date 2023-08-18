package com.roadassistant.di.components;

import com.roadassistant.di.scopes.ScreenScope;
import com.roadassistant.ui.activities.DetectorActivity;

import dagger.Component;

@ScreenScope
@Component(dependencies = ApplicationComponent.class)
public interface ScreenComponent {


    void inject(DetectorActivity detectorActivity);
}
