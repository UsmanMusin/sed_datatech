package dao;

import model.Assignment;
import org.hibernate.Session;
import util.hibernateUtil;

import javax.ejb.Stateless;

@Stateless
public class AssignmentDAO {
    private Session session;

    public AssignmentDAO() {
        session = hibernateUtil.getSessionFactory().getCurrentSession();
    }

    public void addAssignment(Assignment assignment){
        session.beginTransaction();
        session.save(assignment);
        session.getTransaction().commit();
    }

    public Assignment getAssignment(long id){
         return session.load(Assignment.class, id);
    }

    public void updateAssignment(Assignment assignment){
        session.beginTransaction();
        session.update(assignment);
        session.getTransaction().commit();
    }

    public void deleteAssignment(Assignment assignment){
        session.beginTransaction();
        session.delete(assignment);
        session.getTransaction().commit();
    }
}