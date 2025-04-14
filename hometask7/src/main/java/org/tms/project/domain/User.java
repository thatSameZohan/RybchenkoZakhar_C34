package org.tms.project.domain;

public class User {
    private String login;
    private String password;
    private int age;

    public User(String login, String password, int age) {
        this.login = login;
        this.password = password;
        this.age = age;
    }
//    public User() {
//        this.login = "login";
//        this.password = "password";
//        this.age =0;
//    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
