/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuitonlist;

import java.util.ArrayList;

/**
 *
 * @author green
 */
public class Course {
    private String Id;
    private String name;
    private String lectur;
    ArrayList studs=new ArrayList();

    public Course(String Id, String name, String lectur) {
        this.Id = Id;
        this.name = name;
        this.lectur = lectur;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLectur() {
        return lectur;
    }

    public void setLectur(String lectur) {
        this.lectur = lectur;
    }

    public ArrayList getStuds() {
        return studs;
    }

    public void setStuds(ArrayList studs) {
        this.studs = studs;
    }
    
    
}
