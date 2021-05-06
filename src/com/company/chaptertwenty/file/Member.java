package com.company.chaptertwenty.file;

/**
 * @author czy
 * @date 2021/3/22
 */
@DBTable
public class Member {
    @SQLString(30)
    String firstName;
    @SQLString(50)
    String secondName;
    @SQLInteger
    Integer age;
    @SQLString(value = 30, constraints = @Constraints(primaryKey = true))
    String handle;
    static int memberCount;
    public String getHandle(){
        return handle;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getSecondName(){
        return secondName;
    }
    public Integer getAge(){
        return age;
    }
    @Override
    public String toString(){
        return handle;
    }

}
