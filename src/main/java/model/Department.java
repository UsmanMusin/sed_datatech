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
    private Employee rukovoditel;

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

    public Employee getRukovoditel() {
        return rukovoditel;
    }

    public void setRukovoditel(Employee rukovoditel) {
        this.rukovoditel = rukovoditel;
    }

    public Organization getOrganizacia() {
        return organization;
    }

    public void setOrganizacia(Organization organizacia) {
        this.organization = organizacia;
    }

    @Override
    public String toString(){
        return "\nDepartment:\n" + "name: " + name + "\ncontacts:" + contacts +
                "\nrukovoditel: " + rukovoditel + "\norganization: " + organization;
    }
}
