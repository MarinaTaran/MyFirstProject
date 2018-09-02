package entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DaoClient implements DaoUser {

    @Override
    public User createUser(String name, String emeil, String password, String telephone) throws ClientExceptin {
        User result = null;
        if (findUserforEmeil(emeil) == null) {
            result = new Client(name, password, emeil, telephone);
            result.getListUsers().add(result);
        } else {
            throw new ClientExceptin("Дублирование клиента !");
        }

        return result;
    }

    @Override
    public boolean remove(User user) {
        for (User temp : findeAllUser()) {
            if (temp.email.equals(user)) {

            }
        }

        return false;
    }

    @Override
    public User update(User user) {


        return null;
    }


    @Override
    public User findUserByID(int ID) {
        User result = null;
        for (User temp : findeAllUser()) {
            if (temp.ID == ID) {
                result = temp;
            }

        }
        return result;
    }

    @Override
    public List<User> findeAllUser() {

        return User.getListUsers();
    }

    @Override
    public User findUserforEmeil(String emeil) {
        if (findeAllUser().equals(emeil)) {

        }


        return null;
    }
}
