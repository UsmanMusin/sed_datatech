package dao;

import model.Employee;
import org.hibernate.Session;
import util.hibernateUtil;

import javax.ejb.Stateless;

@Stateless
public class EmployeeDAO {
    private Session session;

    public EmployeeDAO() {
        session = hibernateUtil.getSessionFactory().getCurrentSession();
    }

    public void addEmployee(Employee employee){
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
    }

    public Employee getEmployee(long id){
        Employee emp = session.load(Employee.class, id);
        return emp;
    }

    public void updateEmployee(Employee employee){
        session.beginTransaction();
        session.update(employee);
        session.getTransaction().commit();
    }

    public void deleteEmployee(Employee employee){
        session.beginTransaction();
        session.delete(employee);
        session.getTransaction().commit();
    }



}
