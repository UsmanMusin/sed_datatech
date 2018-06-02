package dao;

import model.Department;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class DepartmentDAO {
    @PersistenceContext
    EntityManager em;

    public DepartmentDAO(){

    }

    public void addDepartment(Department department){
        em.persist(department);
    }

    public Department getDepartment(long id){
        Department dep = em.find(Department.class, id);
        return dep;
    }

    public List<Department> getDepList(){
        List<Department> res = em.createQuery("select d from Department d",Department.class).getResultList();
        return res;
    }

    public void updateDepartment(Department department){
        em.merge(department);
    }

    public void deleteDepartment(long id){
        Department dep = em.find(Department.class, id);
        em.remove(dep);
    }

}
