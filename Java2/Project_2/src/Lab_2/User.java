/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_2;

/**
 *
 * @author Khai
 */
public class User {
    private String UserName, PassWord, Role;

    public User() {
    }

    public User(String UserName, String PassWord, String Role) {
        this.UserName = UserName;
        this.PassWord = PassWord;
        this.Role = Role;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    @Override
    public String toString() {
        return "User{" + "UserName=" + UserName + ", PassWord=" + PassWord + ", Role=" + Role + '}';
    }
    
    
}
