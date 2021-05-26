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
public class Cita {
    int id;
    String fecha;

    public Cita(int id, String day) {
        this.id = id;
        this.fecha = day;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDay() {
        return fecha;
    }

    public void setDay(String day) {
        this.fecha = day;
    }
    
    
}
