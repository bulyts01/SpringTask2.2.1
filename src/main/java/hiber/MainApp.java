package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);
//
//        User user1 = new User("User1", "Lastname1", "user1@mail.ru");
//        Car car1 = new Car("BMV", 5);
//        user1.setUserCar(car1);
//        List<User> users = userService.listUsers();
//        for (User user : users) {
//            System.out.println(user);
//        }

//      userService.add(new User("User1", "Lastname1", "user1@mail.ru"));
//      userService.add(new User("User2", "Lastname2", "user2@mail.ru"));
//      userService.add(new User("User3", "Lastname3", "user3@mail.ru"));
//      userService.add(new User("User4", "Lastname4", "user4@mail.ru"));
//
//      List<User> users = userService.listUsers();
//      for (User user : users) {
//         System.out.println("Id = "+user.getId());
//         System.out.println("First Name = "+user.getFirstName());
//         System.out.println("Last Name = "+user.getLastName());
//         System.out.println("Email = "+user.getEmail());
//         System.out.println();
//      }
//      System.out.println("Hei!");
        context.close();


//        Configuration configuration = new Configuration()
//                .setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/postgres")
//                .setProperty("hibernate.connection.username", "postgres")
//                .setProperty("hibernate.connection.password", "postgres")
//                .setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect")
//                .setProperty("show_sql", "true")
//                .setProperty("current_session_context_class", "thread")
//                .addAnnotatedClass(User.class)
//                .addAnnotatedClass(Car.class);
//
//        SessionFactory factory = configuration.buildSessionFactory();
//        Session session = null;
//
//        try {
//            session = factory.openSession();

        //Удаление таблиц:
//            Transaction transaction = session.beginTransaction();
//            session.createNativeQuery("DROP TABLE IF EXISTS cars CASCADE").executeUpdate();
//            session.createNativeQuery("DROP TABLE IF EXISTS users CASCADE").executeUpdate();
//            transaction.commit();

        // Добавление таблиц

//            Transaction transaction2 = session.beginTransaction();
//
//            session.createNativeQuery("CREATE TABLE IF NOT EXISTS cars (" +
//                                      "id SERIAL PRIMARY KEY, " +
//                                      "model VARCHAR(128) NOT NULL, " +
//                                      "series int)")
//                    .executeUpdate();
//
//            session.createNativeQuery("CREATE TABLE IF NOT EXISTS users (" +
//                                      "id SERIAL PRIMARY KEY," +
//                                      "name VARCHAR(128) NOT NULL, " +
//                                      "last_name VARCHAR(128) NOT NULL, " +
//                                      "email VARCHAR(128) NOT NULL," +
//                                      "car_id int," +
//                                      "FOREIGN KEY (car_id) REFERENCES cars(id))")
//                    .executeUpdate();
//
//            transaction2.commit();
//
////
//        } finally {
//            session.close();
//            factory.close();
//        }


    }
}
