package DBConnector;

import Entity.Student.StudentEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreatEntitiesToDB {
    public static void main(String[] args) {
        String firstName = "Amir";
        String lastName = "Abedi";
        String nationalCode = "0013981064";
        String phoneNumber = "09356336630";

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            session.getTransaction().begin();
            session.save(new StudentEntity(firstName, lastName, nationalCode, phoneNumber));
            session.getTransaction().commit();
        } finally {

        }
        sessionFactory.close();
    }
}
