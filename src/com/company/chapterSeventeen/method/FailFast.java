package com.company.chapterSeventeen.method;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author czy
 * @date 2021/2/8
 */
public class FailFast {
    public static void main(String[] args) {
        List<String> c = new ArrayList<>();
        Iterator<String> it = c.iterator();
        c.add("An objet");
        try {
            String s = it.next();
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e);
        }

    }

}
