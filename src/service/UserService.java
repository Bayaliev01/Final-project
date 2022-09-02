package service;

import com.company.MyException;
import model.User;



public interface UserService {
    void userKoshuu(User user);

    User naityPoId(int id) throws MyException;

    void udalitPoIt(int id);

    void user();


}
