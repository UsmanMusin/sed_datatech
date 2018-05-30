package dao;

import model.Employee;
import model.Poruchenie;
import org.hibernate.Session;
import util.hibernateUtil;

import javax.ejb.Stateless;

@Stateless
public class PoruchenieDAO {
    private Session session;

    public PoruchenieDAO() {
        session = hibernateUtil.getSessionFactory().getCurrentSession();
    }

    public void addPoruchenie(Poruchenie poruchenie){
        session.beginTransaction();
        session.save(poruchenie);
        session.getTransaction().commit();
    }

    public Poruchenie getPoruchenie(long id){
        Poruchenie poruchenie = session.load(Poruchenie.class, id);
        return poruchenie;
    }

    public void updatePoruchenie(Poruchenie poruchenie){
        session.beginTransaction();
        session.update(poruchenie);
        session.getTransaction().commit();
    }

    public void deletePoruchenie(Poruchenie poruchenie){
        session.beginTransaction();
        session.delete(poruchenie);
        session.getTransaction().commit();
    }



}