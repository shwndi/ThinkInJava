package com.company.chapterten.applicationfreamwork;

import java.util.ArrayList;
import java.util.List;

/**
 * @author czy
 * @date 2020-8-6
 */
public class Controller {
    private List<Event> eventList = new ArrayList<>();

    public void addEvent(Event event) {
        eventList.add(event);
    }

    public void run() {
        while (eventList.size() > 0) {
            for (Event event : new ArrayList<Event>(eventList)) {
                if (event.ready()) {
                    System.out.println(event);
                    event.action();
                    eventList.remove(event);
                }
            }
        }
    }
}
