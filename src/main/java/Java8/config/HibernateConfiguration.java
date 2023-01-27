package Java8.config;


import Java8.model.Course;
import Java8.model.Instructor;
import Java8.model.Lesson;
import Java8.model.Task;
import jakarta.persistence.EntityManager;
import org.hibernate.cfg.Configuration;

import static org.hibernate.cfg.AvailableSettings.*;

/**
 * The golden boy
 */
public class HibernateConfiguration {
    public  EntityManager getEntityManager() {
        Configuration configuration = new Configuration();
        configuration.setProperty(DRIVER, "org.postgresql.Driver");
        configuration.setProperty(URL, "jdbc:postgresql://localhost:5432/postgres");
        configuration.setProperty(USER, "postgres");
        configuration.setProperty(PASS, "altynbek695");
        configuration.setProperty(HBM2DDL_AUTO, "create");
        configuration.setProperty(DIALECT, "org.hibernate.dialect.PostgreSQL9Dialect");
        configuration.setProperty(SHOW_SQL, "true");
        configuration.addAnnotatedClass(Course.class);
        configuration.addAnnotatedClass(Instructor.class);
        configuration.addAnnotatedClass(Lesson.class);
        configuration.addAnnotatedClass(Task.class);
        return configuration.buildSessionFactory().createEntityManager();

    }

}
