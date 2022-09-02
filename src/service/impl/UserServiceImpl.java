package service.impl;

import com.company.MyException;
import dao.UserDao;
import model.User;
import service.UserService;




public class UserServiceImpl implements UserService {
    private final UserDao userDao = new UserDao();


    @Override
    public void userKoshuu(User user) {
        userDao.getUsers().add(user);
    }

    @Override
    public User naityPoId(int id) {
        User user1 = null;
        for (User user : userDao.getUsers()) {
            if (user.getId() == id) {
                user1 = user;
            }
        }
        if (user1 == null) {
            throw new MyException("нет такого id😎");
        } else {
            return user1;
        }
    }

    @Override
    public void udalitPoIt(int id) {
        try {
            User user = userDao.getUsers()
                    .stream()
                    .filter(u -> u.getId() == id)
                    .findFirst()
                    .orElseThrow(() -> new MyException("нет такого id😎"));
            userDao.getUsers().remove(user);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void user() {
        for (User user : userDao.getUsers()) {
            System.out.println(user);
        }
    }
}


