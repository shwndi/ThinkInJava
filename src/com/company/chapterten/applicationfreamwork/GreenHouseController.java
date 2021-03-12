package com.company.chapterten.applicationfreamwork;

/**
 * @author czy
 * @date 2020-8-7
 */
public class GreenHouseController {
    private boolean light = false;

    public class LightOn extends Event {
        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString() {
            return "Light is on.";
        }
    }

    public class LightOff extends Event {
        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;
        }

        @Override
        public String toString() {
            return "Light is off";
        }
    }

    public boolean water = false;

    public class WaterOn extends Event {
        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }

        @Override
        public String toString() {
            return "WaterOn is on.";
        }
    }

    public class WaterOff extends Event {
        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }

        @Override
        public String toString() {
            return "WaterOff is on.";
        }
    }

    public String thermostat = "Day";

    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }

        @Override
        public String toString() {
            return "ThermostatNight is on.";
        }
    }

    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }

        @Override
        public String toString() {
            return "ThermostatDay is on.";
        }
    }

    public class Bell extends Event {
        public Bell(long delayTme) {
            super(delayTme);
        }

        @Override
        public void action() {
//			addEvent(new Bell(delayTime));
        }

        @Override
        public String toString() {
            return "Bing !!!";
        }
    }

    public class ReStart extends Event {
        private Event[] eventList;

        public ReStart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event event : eventList) {
                //addEvent(event);
            }
        }

        @Override
        public void action() {
            for (Event event : eventList) {
                event.start();
                //addEvent(event);
            }
        }

        @Override
        public String toString() {
            return "restart system";
        }
    }

    public static class Terminate extends Event {
        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Terminating";
        }

    }

}
