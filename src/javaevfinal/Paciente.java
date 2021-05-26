/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaevfinal;

/**
 *
 * @author a
 */
public class Paciente {
    int id;
    String namePat;

    public Paciente(int id, String name) {
        this.id = id;
        this.namePat = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return namePat;
    }

    public void setName(String name) {
        this.namePat = name;
    }
    
    
}
