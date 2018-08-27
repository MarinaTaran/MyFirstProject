package entity;

import java.util.Set;
import java.util.TreeSet;

public abstract class User {
    String name;
    String password;
    String email;
    String telephon;
private Set<User> listUsers=new TreeSet<>();
    public User(String name, String password, String email, String telephon) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.telephon = telephon;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", telephon='" + telephon + '\'' +
                '}';
    }

    abstract boolean enterLogin(String email,String password);
}
