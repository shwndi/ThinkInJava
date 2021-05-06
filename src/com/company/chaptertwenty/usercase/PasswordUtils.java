package com.company.chaptertwenty.usercase;

import java.util.List;

/**
 * @author czy
 * @date 2021/3/19
 */
public class PasswordUtils{
    public static void main(String[] args) {
        PasswordUtils utils = new PasswordUtils();
        utils.age=1;
        utils.name = "dog";
        System.out.println(  "utils.add():"+utils.add());
        System.out.println("add(int age):"+utils.add(2));
        System.out.println("add(int age,String name):"+utils.add(3,"cat"));
        System.out.println("add(String name,int age):" + utils.add("tian",4));
    }
    int age;
    String name;
    public int add(){
        return age;
    }
    public String add(int age){
        return name;
    }
    public String add(int age,String name){
        return name;
    }
    public String add(String name,int age){
        return name;
    }
    /**
     * 密码验证
     * @param password
     * @return
     */
    @UseCase(id = 47, description = "Password must contain at least one numeric(数字)")
    public boolean validatePassword(String password){
        return password.matches("\\w*\\d\\w*");
    }
    @UseCase(id =48)
    public String encryptPassword(String password){
        return new StringBuilder(password).reverse().toString();
    }
    @UseCase(id =49, description = "New password can`t equal previously used ones")
    public boolean checkForNewPassword(List<String> prevPasswords, String password){
        return !prevPasswords.contains(password);
    }
}
