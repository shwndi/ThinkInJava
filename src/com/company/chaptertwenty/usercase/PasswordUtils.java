package com.company.chaptertwenty.usercase;

import java.util.List;

/**
 * @author czy
 * @date 2021/3/19
 */
public class PasswordUtils {
    /**
     * 密码验证
     * @param password
     * @return
     */
    @UserCase(id = 47, description = "Password must contain at least one numeric(数字)")
    public boolean validatePassword(String password){
        return password.matches("\\w*\\d\\w*");
    }
    @UserCase(id =48)
    public String encryptPassword(String password){
        return new StringBuilder(password).reverse().toString();
    }
    @UserCase(id =49, description = "New password can`t equal previously used ones")
    public boolean checkForNewPassword(List<String> prevPasswords, String password){
        return !prevPasswords.contains(password);
    }
}
