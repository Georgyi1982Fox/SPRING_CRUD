package web.service;


import web.dao.UserDAO;
import web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserDAO userDAO;

    @Transactional(readOnly=true)
    @Override
    public List<User> listAllUsers() throws SQLException {
        return userDAO.listAllUsers();
    }

    @Transactional
    @Override
    public void addUser(User user) throws SQLException {
        userDAO.addUser(user);
    }

    @Transactional
    @Override
    public void updateUser(User user) throws SQLException {
        userDAO.updateUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(Long id) throws SQLException {
        userDAO.deleteUser(id);
    }

    @Transactional
    @Override
    public User getUserById(Long id) throws SQLException {
        return userDAO.getUserById(id);
    }

    @Transactional
    @Override
    public boolean validate(String name, String password) throws SQLException {
        return userDAO.validate(name,password);
    }
}
