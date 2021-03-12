package com.company.chapterfifteen;

import com.company.chapterfourteen.individual.Person;
import com.company.chapterfourteen.individual.Pet;

import java.util.List;
import java.util.Map;

/**
 * @author czy
 * @date 2021/1/21
 */
public class LimitOfInterface {
    static void f(Map<Person, List<? extends Pet>> petPeople) {
    }

    public static void main(String[] args) {
        f(New.map());
    }
}
