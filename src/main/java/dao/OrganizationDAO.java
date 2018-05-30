package dao;

import model.Employee;
import model.Organization;
import org.hibernate.Session;
import util.hibernateUtil;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Stateless
public class OrganizationDAO {
    private Session session;

    public OrganizationDAO() {
        session = hibernateUtil.getSessionFactory().getCurrentSession();
    }

    public void addOrganization(Organization organization){
        session.beginTransaction();
        session.save(organization);
        session.getTransaction().commit();
    }

    public Organization getOrganization(long id){
        Organization org = session.load(Organization.class, id);
        return org;
    }

    public Collection<Organization> getOrgList(){
        session.beginTransaction();
        List<Organization> department = new ArrayList<Organization>();
        department = session.createCriteria(Organization.class).list();
        session.getTransaction().commit();
        return department;
    }

    public void updateOrganization(Organization organization){
        session.beginTransaction();
        session.saveOrUpdate(organization);
        session.getTransaction().commit();
    }

    public void deleteOrganization(long id){
        session.beginTransaction();
        Organization org = session.load(Organization.class, id);
        session.delete(org);
        session.getTransaction().commit();
    }



}