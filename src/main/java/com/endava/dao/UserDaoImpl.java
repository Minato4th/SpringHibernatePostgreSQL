package com.endava.dao;

import com.endava.model.User;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    DataSource dataSource;

    public UserDaoImpl() {
    }

    @Transactional
    public List<User> getUsers() {
        String sql = "FROM User";
        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        List<User> listUser = (List<User>) query.list();

        return listUser;
    }

    public UserDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /*@Transactional
    public List<User> getUsers() {
        List<User> userList = (List<User>) sessionFactory.getCurrentSession()
                .createCriteria(User.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
        return userList;
    }*/




    /*@Transactional
    public String getPassword(int id) {
        String sql = "SELECT password FROM User WHERE id=" + id;
        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        List<String> listUser = (List<String>) query.list();

        return listUser.get(0);
    }*/
}
