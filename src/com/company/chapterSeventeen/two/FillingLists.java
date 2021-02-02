package com.company.chapterSeventeen.two;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author czy
 * @date 2021/2/2
 */
class StringAddress{
    private String s;
    public StringAddress(String s){
        this.s= s;
    }
    @Override
    public String toString(){
//        return super.toString()+" "+s;
        return getClass().getSimpleName()+":{ "+s+" }";
    }

}

/**
 * 填充容器/两者有区别
 * Collections.nCopies(num,Object)
 * Collections.fill(Object)
 */
public class FillingLists {
    public static void main(String[] args) {
        List<StringAddress> list = new ArrayList<>(Collections.nCopies(4, new StringAddress("Hello")));
        System.out.println(list);
        Collections.fill(list,new StringAddress("World!"));
        System.out.println(list);
        List<StringAddress> list2 = new ArrayList<>();
        Collections.fill(list2,new StringAddress("aaa"));
        System.out.println(list2);
    }
}
