package dao;

import model.Department;
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

    public void addDepartment(Department department){
        session.beginTransaction();
        session.save(department);
        session.getTransaction().commit();
    }

    public Department getDepartment(long id){
        return session.load(Department.class, id);
    }

    public void updateDepartment(Department department){
        session.beginTransaction();
        session.update(department);
        session.getTransaction().commit();
    }

    public void deleteDepartment(Department department){
        session.beginTransaction();
        session.delete(department);
        session.getTransaction().commit();
    }



}
