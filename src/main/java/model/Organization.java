package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Organization {

    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    private Employee manager;

    private String name;
    private String legalAddress;
    private String physicalAddress;

    public Organization() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public String getLegalAddress() {
        return legalAddress;
    }

    public void setLegalAddress(String legalAddress) {
        this.legalAddress = legalAddress;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    @Override
    public String toString(){
        return "\nOrganization:\n" + "name: " + name + "\nmanager:" + manager +
                "\nlegalAddress: " + legalAddress + "\nphysicalAddress: " + physicalAddress;
    }
}
