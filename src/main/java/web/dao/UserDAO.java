package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> gelAllUsers();
    public User show(int id);

    public void saveUser(User user);
    public void updateUser(User updatedUser, int id);
    public void deleteUser(int id);

}
