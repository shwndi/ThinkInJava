package com.company.chapterfifteen;

import java.util.ArrayList;
import java.util.List;

/**
 * @author czy
 * @date 2021/1/27
 */
public class ListMaker <T>{
    List<T> create(){
        return new ArrayList<T>();
    }

    public static void main(String[] args) {
        ListMaker<String> stringListMaker = new ListMaker<>();
        List<String> stringList = stringListMaker.create();
        System.out.println(stringList);
    }
}
