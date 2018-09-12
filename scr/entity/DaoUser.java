package entity;

import java.util.List;

public interface DaoUser {
    User createUser(String name, String emeil, String password, String telephone) throws ClientException;

    boolean remove(User user);

    User update(String emeil,User temp);

    User findUserByID(int ID);

    List<User> findeAllUser();

    User findUserforEmeil(String emeil);


}
