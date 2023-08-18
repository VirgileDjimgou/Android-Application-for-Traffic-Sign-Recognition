package com.roadassistant.model.bus.model;

import com.roadassistant.model.bus.EventModel;
import com.roadassistant.model.entity.Data;

public class EventUpdateLocation implements EventModel {

    private Data data;

    public EventUpdateLocation(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

}
