package dao;

import model.Employee;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Stateless
public class EmployeeDAO {
    @PersistenceContext(unitName = "derby_DB")
    EntityManager em;

    public EmployeeDAO(){
    }

    public void addEmployee(Employee employee){
        em.persist(employee);
    }

    public Employee getEmployee(long id){
        Employee emp = em.find(Employee.class, id);
        return emp;
    }


    public List<Employee> getEmpList(){
        List<Employee> res = em.createQuery("select e from Employee e",Employee.class).getResultList();
        return res;
    }


    public void updateEmployee(Employee employee){
        em.merge(employee);
    }

    public void deleteEmployee(long id){
        Employee emp = em.find(Employee.class, id);
        em.remove(emp);
    }

}
