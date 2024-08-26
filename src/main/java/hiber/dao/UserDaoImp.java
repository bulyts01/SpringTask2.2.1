package hiber.dao;

import hiber.model.Car;
import hiber.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public void add(User user) {
      sessionFactory.getCurrentSession().save(user);
   }

   @Override
   @SuppressWarnings("unchecked")
   public List<User> listUsers() {
      TypedQuery<User> query=sessionFactory.getCurrentSession().createQuery("from User");
      return query.getResultList();
   }

   @Override
   @Transactional
   public List<User> getUser(String model, int series) {
      Session session = sessionFactory.getCurrentSession();
      TypedQuery<User> query = session.createQuery("from User u left join fetch u.userCar where u.userCar.model=:model and u.userCar.series=:series", User.class);
      query.setParameter("model", model);
      query.setParameter("series", series);
      List<User> users = query.getResultList();
      return users;
   }
}
