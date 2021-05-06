package dataType;

import org.apache.commons.lang.StringUtils;
import org.openjdk.jol.info.ClassLayout;

/**
 * @author czy
 * @date 2021/3/25
 */
public class StringComp {
    public static void main(String[] args) {
        A a = new A();
        String b = "";
        String c = "";
       /* System.out.println(b.hashCode())*/;
        //String s = ClassLayout.parseInstance(b).toPrintable();
        //System.out.println("b information :\n"+s);
        int i = System.identityHashCode(b);
        System.out.println(i);
        int m = System.identityHashCode(c);
        System.out.println(m);
        //System.out.println(a.a.hashCode());
       // String k = ClassLayout.parseInstance(a.a).toPrintable();
        //System.out.println("a information :" + k);
        int j = System.identityHashCode(a.a);
        System.out.println(j);
        System.out.println(a.a == "");
        boolean notEmpty = StringUtils.isNotEmpty(a.a);
        System.out.println("a.a 不是空字符串 并且不是null");
    }
}
class A{
    String a ;
    A(){
        this.a = new String("");
    }
}