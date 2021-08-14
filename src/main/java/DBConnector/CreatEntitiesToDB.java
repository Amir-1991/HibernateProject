package DBConnector;

import Entity.Student.StudentEntity;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class CreatEntitiesToDB {
    public static void main(String[] args) {
        String firstName = "Armin";
        String lastName = "Noori";
        String nationalCode = "1234567890";
        String phoneNumber = "09351111111";

        Session session = new Configuration().configure().buildSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.save(new StudentEntity(firstName, lastName, nationalCode, phoneNumber));
            session.getTransaction().commit();
        } finally {

        }
    }
}
