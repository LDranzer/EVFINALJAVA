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
public class Doctor {
    int id;
    String DrName;

    public Doctor(int id, String DrName) {
        this.id = id;
        this.DrName = DrName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDrName() {
        return DrName;
    }

    public void setDrName(String DrName) {
        this.DrName = DrName;
    }


    
    
}
