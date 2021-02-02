package com.company.chapterfifteen.problem;

/**
 *
 * @author czy
 * @date 2021/1/29
 */
public interface Payable<T> {}
class Employee implements Payable<Employee>{}
//class HourLy extends Employee implements Payable<HourLy>{}