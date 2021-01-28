package com.company.chapterfifteen;

/**
 * @author czy
 * @date 2021/1/28
 */
interface Car{}
interface Forward extends Car{
    String front();
}
interface BackWard extends Car{
    String after();
}
class Person<PERSON extends Car>{
    PERSON item;
    Person(PERSON item){
        this.item=item;
    }
    PERSON getRun(){
        return item;
    }
}
class Do<PERSON extends Forward &BackWard> extends Person<PERSON> {
    Do(PERSON item) {
        super(item);
    }
    void font(){
        item.front();
        }
    void bcak(){
        item.after();
    }
}


class Driver implements Forward,BackWard {

    @Override
    public String front() {
        return "向前";
    }

    @Override
    public String after() {
        return "向后";
    }
}

class MM extends Do<Driver>{
    MM(){
        super(new Driver());
    }
}
public class RunCar {
    static <PERSON extends Forward> void q(Person<PERSON> person){
        person.getRun().front();
    }
    static <PERSON extends BackWard> void t(Person<PERSON> person){
        person.getRun().after();
    }
    public static void main(String[] args) {
        MM mm = new MM();
        q(mm);
        t(mm);
    }
}
