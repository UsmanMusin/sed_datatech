package model;

import javax.persistence.*;

@Entity
public class Department {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String contacts;
    @OneToOne
    private Employee manager;

    @ManyToOne
    private Organization organization;

    public Department() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @Override
    public String toString(){
        return "\nDepartment:\n" + "name: " + name + "\ncontacts:" + contacts +
                "\nmanager: " + manager + "\norganization: " + organization;
    }
}
