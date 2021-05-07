package com.proxystatic;

/**
 * 静态代理：
 * 真实对象和代理对象都要实现同一个接口
 * 代理对象要代理真实角色，即代理对象要获取真实角色
 *
 * 优点：
 *  代理对象可以做很多真实对象做不了的事，
 *  真实对象专注做自己的事情。
 *
 * @author czy
 * @date 2021/5/7
 */
public class StaticProxy {
    public static void main(String[] args) {

        new Thread(()-> System.out.println("结婚了")).start();

        You you = new You();
        WeddingCompany company = new WeddingCompany(you);
        company.HappyMarry();
    }

}

interface Marry {
    void HappyMarry();
}

/**
 * 真实角色
 */
class You implements Marry {
    @Override
    public void HappyMarry() {
        System.out.println("结婚了，超开心");
    }
}

/**
 * 代理角色
 */
class WeddingCompany implements  Marry{
    private Marry target;
    public WeddingCompany(Marry target){
        this.target = target;
    }
    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();
        after();
    }

    private void after() {
        System.out.println("结婚之后要收费");
    }

    private void before() {
        System.out.println("结婚之前布置现场");
    }

}