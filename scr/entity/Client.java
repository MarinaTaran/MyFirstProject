package entity;

public class Client extends User{


    public Client(String name, String password, String email, String telephon) {
        super(name, password, email, telephon);
    }

    @Override
    boolean enterLogin(String email, String password) {
        return false;
    }
}
