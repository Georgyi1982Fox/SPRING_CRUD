package web.service;


import web.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    List<User> listAllUsers() throws SQLException;

    void addUser(User user) throws SQLException;

    void updateUser(User user) throws SQLException;

    void deleteUser(Long id) throws SQLException;

    public User getUserById(Long id) throws SQLException;

    public boolean validate(String name, String password) throws SQLException;
}
