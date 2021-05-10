package com.proxystatic;

/**
 * @author czy
 * @date 2021/5/10
 */
public class StaticProxyLOL {
    public static void main(String[] args){
        ADC adc = new ADC();
        FZ fz = new FZ(adc);
        fz.action();

    }
}
//接口
interface LOL{
    void action();
}
//代理对象
class FZ implements LOL{
    private LOL lol;
    public FZ(LOL lol){
        this.lol = lol;
    }
    @Override
    public void action(){
        before();
        this.lol.action();
        after();
    }
    private void before(){
        System.out.println("我是辅助要垫刀");
        System.out.println("我是辅助要开团");
    }
    private void after(){
        System.out.println("我是辅助要给adc加状态");
    }
}
//真实角色
class ADC implements LOL{
    @Override
    public void action(){
        System.out.println("我adc要补兵");
        System.out.println("我adc抢人头");
    }
}