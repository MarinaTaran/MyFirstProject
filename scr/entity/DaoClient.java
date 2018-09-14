package entity;

import java.util.List;

public class DaoClient implements DaoUser {

    @Override
    public User createUser(String name, String emeil, String password, String telephone) throws ClientException {
        User result = null;
        if (findUserforEmeil(emeil) == null) {
            result = new Client(name, password, emeil, telephone);
            result.getListUsers().add(result);
        } else {
            throw new ClientException("Such a customer already exists  !");
        }

        return result;
    }

    @Override
    public boolean remove(User user) {
        for (User temp : findeAllUser()) {
            if (temp.getEmail().equals(user)) {
//            temp.email.
            }
        }
        return false;
    }

    @Override
    public User update(String emeil, User temp) {
       User resulrt=null;
        User oldUser=findUserforEmeil(emeil);
        if(oldUser==null){
            System.out.println("no such user");
        }else{
            oldUser.password=temp.password;
            oldUser.name=temp.name;
            oldUser.telephon=temp.telephon;
            resulrt=temp;
        }
        return resulrt;
    }


    @Override
        public User findUserByID ( int ID){
            User result = null;
            for (User temp : findeAllUser()) {
                if (temp.ID == ID) {
                    result = temp;
                }

            }
            return result;
        }

        @Override
        public List<User> findeAllUser () {

            return User.getListUsers();
        }

        @Override
        public User findUserforEmeil (String emeil){
            User result = null;
            for (User temp : findeAllUser()) {
                if (temp.getEmail().equals(emeil)) {
                    result = temp;
                }
            }

            return result;
        }
    }
