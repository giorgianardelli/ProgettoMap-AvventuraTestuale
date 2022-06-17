/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maingame;

/**
 *
 * @author giorg
 */
class Inventario {
private int mela;
private int lampone;
private int fungo;

    Inventario(int mela, int lampone, int fungo){
        this.mela = mela;
        this.lampone = lampone;
        this.fungo = fungo;
    }

    public int getMela(){
        return mela;
    }

    public void setMela(int mela){
        this.mela = mela;
    }

    public int getLampone(){
        return lampone;
    }

    public void setLampone(int lampone){
        this.lampone = lampone;
    }

    public int getFungo(){
        return fungo;
    }

    public void setFungo(int fungo){
        this.fungo = fungo;
    }

    public void getInventario(){
    System.out.println("                                            ---------------------");
    System.out.println("                                            | IL TUO INVENTARIO |");
    System.out.println("                                            ---------------------");
    System.out.println("                                            | MELE: " + mela);
    System.out.println("                                            | LAMPONI: " + lampone);
    System.out.println("                                            | FUNGHI: " + fungo);
    System.out.println("                                            ---------------------");
    }
}
