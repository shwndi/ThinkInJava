package com.company.chaptereleven.collection;

import java.util.Map;

/**
 * @author czy
 * @date 2020-9-25
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry entity : System.getenv().entrySet()) {
            System.out.println(entity.getKey() + ":" + entity.getValue());
        }
    }
}
