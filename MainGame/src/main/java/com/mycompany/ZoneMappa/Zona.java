/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ZoneMappa;

/**
 *
 * @author giorg
 */
public class Zona {
    private final int inizioColonnaZona;
    private final int fineRigaZona;
    private final int fineColonnaZona;
    private final int inizioRigaZona;
    private String name;
    private int id;
    
    
    public Zona(int id, String name, int inizioRigaZona, int inizioColonnaZona) {
        this.id=id;
        this.name = name;
        this.inizioRigaZona=inizioRigaZona;
        this.inizioColonnaZona=inizioColonnaZona;
        this.fineRigaZona=inizioRigaZona+4;
        this.fineColonnaZona=inizioColonnaZona+9;
    }

    public int getInizioColonnaZona() {
        return inizioColonnaZona;
    }

    public int getFineRigaZona() {
        return fineRigaZona;
    }

    public int getFineColonnaZona() {
        return fineColonnaZona;
    }

    public int getInizioRigaZona() {
        return inizioRigaZona;
    }
    
    public int getId() {
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
    
}
