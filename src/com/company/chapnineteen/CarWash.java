package com.company.chapnineteen;

import java.util.EnumSet;

/**
 * @author czy
 * @date 2021/3/18
 */
public class CarWash {
    public enum Cycle{
        UNDERBODY{
            @Override
            void action(){
                System.out.println("spraying the underbody");
            }
        },
        WHEELWASH{
            @Override
            void action(){
                System.out.println("Washing the wheels");
            }
        },
        PREWASH{
            @Override
            void action(){
                System.out.println("Loosening the dirt");
            }
        },
        BASIC{
            @Override
            void action(){
                System.out.println("The basic wash");
            }
        },
        HOTWAX{
            @Override
            void action(){
                System.out.println("Applying hot wax");
            }
        },
        RINES{
            @Override
            void action(){
                System.out.println("Rinsing");
            }
        },
        BLOWDAY{
            @Override
            void action(){
                System.out.println("Blowing dry");
            }
        };
        abstract void action();
    }
    EnumSet<Cycle> cycles =
    EnumSet.of(Cycle.BASIC, Cycle.RINES);
    public void add(Cycle cycle){
        cycles.add(cycle);
    }
    public void washCar(){
        for (Cycle cycle : cycles) {
            cycle.action();
        }
    }
    @Override
    public String toString(){
       return cycles.toString();
    }
    public static void main(String[] args) {
        CarWash wash = new CarWash();
        System.out.println(wash);
        wash.washCar();
        wash.add(Cycle.BLOWDAY);
        wash.add(Cycle.BLOWDAY);
        wash.add(Cycle.RINES);
        wash.add(Cycle.HOTWAX);
        System.out.println(wash);
        wash.washCar();
    }
}
