package com.company.chapnineteen;

/**
 * @author czy
 * @date 2021/3/15
 */
enum Signal {
    GREEN,YELLOW,RED,
}
public class TrafficLight{
    Signal color = Signal.RED;
    public void change(){
        switch(color){
            case RED: color=Signal.GREEN;
            break;
            case GREEN:color=Signal.YELLOW;
            break;
            case YELLOW:color=Signal.RED;
            break;
        }
    }

    @Override
    public String toString() {
        return "the traffic light id : " + color;
    }

    public static void main(String[] args) {
        System.out.println(Signal.GREEN.ordinal());
        TrafficLight light = new TrafficLight();
        for (int i = 0; i < 7; i++) {
            System.out.println(light);
            light.change();
        }
    }
}