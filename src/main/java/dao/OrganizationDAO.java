package dao;

import model.Organization;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class OrganizationDAO {
    @PersistenceContext
    EntityManager em;

    public OrganizationDAO(){

    }

    public void addOrganization(Organization organization){
        em.persist(organization);
    }

    public Organization getOrganization(long id){
        Organization org = em.find(Organization.class, id);
        return org;
    }

    public List<Organization> getOrgList(){
        List<Organization> res = em.createQuery("select o from Organization o",Organization.class).getResultList();
        return res;
    }

    public void updateOrganization(Organization organization){
        em.merge(organization);
    }

    public void deleteOrganization(long id){
        Organization org = em.find(Organization.class, id);
        em.remove(org);
    }



}