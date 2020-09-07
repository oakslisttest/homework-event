package com.epam.homework.bean.dao;

import java.util.HashSet;
import java.util.Set;

import com.epam.homework.bean.event.ControlEventAbstract;

public class Storage {

    private Set<ControlEventAbstract> eventSet = new HashSet<>();

    public Set<ControlEventAbstract> getEventSet() {
        return eventSet;
    }

    public void setEventSet(Set<ControlEventAbstract> eventSet) {
        this.eventSet = eventSet;
    }

    public ControlEventAbstract getControlEventByEventName(String eventName) {
        for (ControlEventAbstract event : eventSet) {
            if (event.getName().equals(eventName)) {
                return event;
            }
        }
        return null;
    }

    public void addOrUpdateControlEvent(ControlEventAbstract event) {
        eventSet.add(event);
    }

}
