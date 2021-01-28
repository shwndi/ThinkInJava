package com.company.chapterfifteen;

import java.util.List;

/**
 * @author czy
 * @date 2021/1/28
 */
interface SuperPower{}
interface XRayVision extends SuperPower{
    String seeThroughWalls();
}
interface SuperHearing extends SuperPower{
    String hearSubtleNoises();
}
interface SuperSmell extends SuperPower{
    String trackBySmell();
}
class SuperHero<POWER extends SuperPower>{
    POWER power;
    SuperHero(POWER power){
        this.power=power;
    }
    POWER getPower(){
        return power;
    }
}
class SuperSleuth<POWER extends XRayVision> extends SuperHero<POWER>{

    SuperSleuth(POWER power) {
        super(power);
    }
    void see(){
        power.seeThroughWalls();
    }
}
class CanineHero<POWER extends SuperHearing & SuperSmell> extends SuperHero<POWER>{
    CanineHero(POWER power){
        super(power);
    }
    void heat(){
        power.hearSubtleNoises();
    }
    void smell(){power.trackBySmell();}
}
class SuperHeatSmell implements SuperHearing,SuperSmell{
    @Override
    public String hearSubtleNoises() {
        return "顺风耳";
    }

    @Override
    public String trackBySmell() {
        return "追风逐影";
    }
}
class DogBoy extends CanineHero<SuperHeatSmell>{
    DogBoy(){
        super(new SuperHeatSmell());
    }
}
public class EpicBattle {
    static <POWER extends SuperHearing> void useSuperHearing(SuperHero<POWER> hero){
        hero.getPower().hearSubtleNoises();
    }
    static <POWER extends SuperHearing & SuperSmell> void superFind(SuperHero<POWER> hero){
        String s = hero.getPower().hearSubtleNoises();
        System.out.println(s);
        String track = hero.getPower().trackBySmell();
        System.out.println(track);
    }

    public static void main(String[] args) {
        DogBoy dogBoy = new DogBoy();
        useSuperHearing(dogBoy);
        superFind(dogBoy);
        List<? extends SuperHearing> audioBoys;
    }
}
