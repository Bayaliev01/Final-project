package dao;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
   private List<User> users = new ArrayList<>();

    public UserDao() {
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
