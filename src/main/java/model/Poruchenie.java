package model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Poruchenie {

    @Id
    @GeneratedValue
    private long id;

    private String theme;

    @ManyToOne
    private Employee author;

    @ManyToMany
    private Set<Employee> ispolniteli;

    private int srok;
    private boolean kontrol;
    private String text;
    private boolean ispolnenie;
    private String status;

    public Poruchenie() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Employee getAuthor() {
        return author;
    }

    public void setAuthor(Employee author) {
        this.author = author;
    }

    public Set<Employee> getIspolnitel() {
        return ispolniteli;
    }

    public void setIspolnitel(Set<Employee> ispolnitel) {
        this.ispolniteli = ispolnitel;
    }

    public int getSrok() {
        return srok;
    }

    public void setSrok(int srok) {
        this.srok = srok;
    }

    public boolean isKontrol() {
        return kontrol;
    }

    public void setKontrol(boolean kontrol) {
        this.kontrol = kontrol;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isIspolnenie() {
        return ispolnenie;
    }

    public void setIspolnenie(boolean ispolnenie) {
        this.ispolnenie = ispolnenie;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return "\nPoruchenie:\n" + "theme: " + theme + "\nauthor:" + author +
                "\nispolniteli: " + ispolniteli + "\nsrok: " + srok + "\nkontrol: " + kontrol +
                "\ntext: " + text + "\nispolnenie: " + ispolnenie + "\nstatus: " + status;
    }
}
