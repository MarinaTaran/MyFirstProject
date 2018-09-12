package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public abstract class User {
    String name;
    String password;
   private String email;
    String telephon;
    int ID;
   // DaoUser daoUser=new DaoClient();
private static List<User> listUsers=new ArrayList<>();

    public User() {

    }

    public User(String name, String password, String email, String telephon) {

        this.name = name;
        this.password = password;
        this.email = email;
        this.telephon = telephon;
        listUsers.add(this);
    }


    public static List<User> getListUsers() {
        return listUsers;
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

    public  boolean isThereUser(String name,String email){
        boolean user = false;
        for (User temp:listUsers){
            if (temp.name.equals(name)){
               user=false;
            }
        }return user;

    }

    public String getEmail() {
        return email;
    }

    public static User login(String email, String password) {
        User result = null;
        for (User temp : User.getListUsers()) {
            if (temp.email.equals(email) && temp.password.equals(password)) {
                result = temp;
            }
        }
        return result;
    }

}
