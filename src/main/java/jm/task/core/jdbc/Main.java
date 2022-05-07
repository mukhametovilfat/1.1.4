package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoHibernateImpl();

        userDao.createUsersTable();

        userDao.saveUser("Петя","Кузнецов",(byte) 18);
        userDao.saveUser("Иван","Иванов",(byte) 20);
        userDao.saveUser("Анна","Ивановна",(byte) 24);
        userDao.saveUser("Алюша","Папович",(byte) 35);

        userDao.getAllUsers();

        userDao.cleanUsersTable();

        userDao.dropUsersTable();
    }
}
