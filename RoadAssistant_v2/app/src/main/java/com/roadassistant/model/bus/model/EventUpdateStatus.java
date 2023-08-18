package com.roadassistant.model.bus.model;

import com.roadassistant.model.bus.EventModel;
import com.roadassistant.model.entity.GpsStatusEntity;

public class EventUpdateStatus implements EventModel {

    private GpsStatusEntity status;

    public EventUpdateStatus(GpsStatusEntity status) {
        this.status = status;
    }

    public GpsStatusEntity getStatus() {
        return status;
    }

}

