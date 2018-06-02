package dao;

import model.Assignment;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class AssignmentDAO {
    @PersistenceContext
    EntityManager em;

    public AssignmentDAO(){

    }

    public void addAssignment(Assignment assignment){
        em.persist(assignment);
    }

    public Assignment getAssignment(long id){
        Assignment assign = em.find(Assignment.class, id);
        return assign;
    }

    public List<Assignment> getAssignList(){
        List<Assignment> res = em.createQuery("select a from Assignment a",Assignment.class).getResultList();
        return res;
    }

    public void updateAssignment(Assignment assignment){
        em.merge(assignment);
    }

    public void deleteAssignment(long id){
        Assignment assign = em.find(Assignment.class, id);
        em.remove(assign);
    }
}