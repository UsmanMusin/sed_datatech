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
    private Employee rukovoditel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String yurAddress;
    private String fizAddress;

    public Organization() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee getRukovoditel() {
        return rukovoditel;
    }

    public void setRukovoditel(Employee rukovoditel) {
        this.rukovoditel = rukovoditel;
    }

    public String getYurAddress() {
        return yurAddress;
    }

    public void setYurAddress(String yurAddress) {
        this.yurAddress = yurAddress;
    }

    public String getFizAddress() {
        return fizAddress;
    }

    public void setFizAddress(String fizAddress) {
        this.fizAddress = fizAddress;
    }

    @Override
    public String toString(){
        return "\nOrganization:\n" + "name: " + name + "\nrukovoditel:" + rukovoditel +
                "\nyur.Address: " + yurAddress + "\nfiz.Address: " + fizAddress;
    }
}
