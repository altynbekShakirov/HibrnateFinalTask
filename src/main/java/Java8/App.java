package Java8;

import Java8.config.HibernateConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
       HibernateConfiguration hibernateConfiguration = new HibernateConfiguration();
        System.out.println(hibernateConfiguration.getEntityManager());
    }
}
