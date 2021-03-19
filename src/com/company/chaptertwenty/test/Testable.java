package com.company.chaptertwenty.test;
/**
 * @author czy
 * @date 2021/3/19
 */
public class Testable {
    public void execute(){
        System.out.println("execute()");
    }
    @Test
    void testExecute(){
        execute();
    }
}
