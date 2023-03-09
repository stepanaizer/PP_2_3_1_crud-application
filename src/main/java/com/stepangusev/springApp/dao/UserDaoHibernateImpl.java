package com.stepangusev.springApp.dao;

import com.stepangusev.springApp.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoHibernateImpl implements UserDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void save(User user) {
        em.persist(user);
    }

    @Override
    public User findById(Long id) {
        return em.find(User.class, id);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        User user = findById(id);
        if (user != null) {
            em.remove(user);
        }
    }

    @Override
    @Transactional
    public void update(User user) {
        em.merge(user);
    }

    @Override
    public List<User> listAllUsers() {
        return (List<User>) em.createQuery("from User").getResultList();
    }
}
