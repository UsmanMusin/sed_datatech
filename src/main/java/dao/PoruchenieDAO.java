package dao;

import model.Employee;
import org.hibernate.Session;
import util.hibernateUtil;

import javax.ejb.Stateless;

@Stateless
public class PoruchenieDAO {
    private Session session;

    public PoruchenieDAO() {
        session = hibernateUtil.getSessionFactory().getCurrentSession();
    }

    public void addPoruchenie(Employee employee){
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
    }

    public Employee getPoruchenie(long id){
        Employee emp = session.load(Employee.class, id);
        return emp;
    }

    public void updatePoruchenie(Employee employee){
        session.beginTransaction();
        session.update(employee);
        session.getTransaction().commit();
    }

    public void deletePoruchenie(Employee employee){
        session.beginTransaction();
        session.delete(employee);
        session.getTransaction().commit();
    }



}