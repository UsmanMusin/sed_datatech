package model;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String surname;
    private String middleName;
    private String position;

    @ManyToOne
    private Department department;


    public Employee() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getPosition() {
        return position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString(){
        return "\nEmployee:\n" + "name: " + name + "\nsurname:" + surname +
                "\nmiddlename: " + middleName + "\nposition: " + position+
                "\ndepartment: " + department;
    }
}
