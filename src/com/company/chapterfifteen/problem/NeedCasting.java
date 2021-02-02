package com.company.chapterfifteen.problem;

import com.company.chapterfifteen.Widget;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * @author czy
 * @date 2021/1/31
 */
public class NeedCasting {
    //@SuppressWarnings("unchecked")
    public void f(String[] args)throws Exception{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(args[0]));
        List<Widget> shaps = (List<Widget>) in.readObject();
    }
}
