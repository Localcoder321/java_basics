package oop.class_object.equals_and_hashcode_practice;

import java.util.Objects;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(obj instanceof User user) {
            return this.getLogin().equals(user.getLogin()) && this.getPassword().equals(user.getPassword()) ;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getLogin().hashCode();
    }
}
