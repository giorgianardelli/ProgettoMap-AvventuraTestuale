/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ZoneMappa;

/**
 *
 * @author giorg
 */
public class Posizione {
    int colonna;
    int riga;
    public Posizione(int colonna, int riga) {
        this.colonna = colonna;
        this.riga = riga;
    }

    public void setColonna(int colonna) {
        this.colonna = colonna;
    }

    public void setRiga(int riga) {
        this.riga = riga;
    }

    public int getColonna() {
        return colonna;
    }

    public int getRiga() {
        return riga;
    }
    
    
}
