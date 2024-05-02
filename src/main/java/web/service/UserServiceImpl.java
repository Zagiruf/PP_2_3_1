package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDAO userDAO;
    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public List<User> gelAllUsers() {
        return userDAO.gelAllUsers();
    }
    @Override
    @Transactional
    public User show(int id) {
        return userDAO.show(id);
    }
    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }
    @Override
    @Transactional
    public void updateUser(User updatedUser, int id) {
        userDAO.updateUser(updatedUser, id);
    }
    @Override
    @Transactional
    public void deleteUser(int id){
        userDAO.deleteUser(id);
    }


}
