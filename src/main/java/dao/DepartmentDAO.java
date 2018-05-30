package dao;

import model.Employee;
import org.hibernate.Session;
import util.hibernateUtil;

import javax.ejb.Stateless;

@Stateless
public class DepartmentDAO {
    private Session session;

    public DepartmentDAO() {
        session = hibernateUtil.getSessionFactory().getCurrentSession();
    }

    public void addDepartment(Employee employee){
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
    }

    public Employee getDepartment(long id){
        Employee emp = session.load(Employee.class, id);
        return emp;
    }

    public void updateDepartment(Employee employee){
        session.beginTransaction();
        session.update(employee);
        session.getTransaction().commit();
    }

    public void deleteDepartment(Employee employee){
        session.beginTransaction();
        session.delete(employee);
        session.getTransaction().commit();
    }



}
