/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maingame;

import com.mycompany.ZoneMappa.Posizione;
import com.mycompany.ZoneMappa.Zona;
import java.util.ArrayList;

/**
 *
 * @author giorg
 */
class Mappa {
  Giocatore player = new Giocatore(100, 100, 10,new Posizione(0,1));
  Inventario zaino = new Inventario(3, 3, 3);
  ArrayList<Zona> zone = new ArrayList();
  Zona zonaAttuale;
 
private String[][] labirinto = {{"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}
                , {"X", " ", " ", " ", "A", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}
                , {"0", "0", "0", "0", "!", "0", "0", "0", "0", "0", "0", "0", "0", " ", " ", " ", " ", " ", " ", " ", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "0", "0"}
                , {"0", "0", "0", "0", "?", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0"}
                , {"0", "0", "0", "0", "A", " ", " ", " ", "?", " ", "A", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0"}
                , {"0", "0", "0", "0", " ", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0"}
                , {"0", "0", "0", "0", "A", "0", "0", "0", "0", "0", " ", " ", " ", " ", "?", " ", " ", " ", " ", " ", "?", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0"}
                , {"0", " ", " ", " ", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", " ", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", " ", " ", " ", " ", " ", "0", "0", "0", "0", "0", "0", "0"}
                , {"0", "0", "0", "0", "?", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0"}
                , {"0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", " ", " ", " ", " ", "?", " ", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "0", "0", "0", "0", "0"}
                , {"0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", " ", "?", " ", " ", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0"}
                , {"0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0"}
                , {"0", "0", "0", "0", " ", " ", "?", " ", " ", " ", " ", " ", " ", " ", " ", " ", "?", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", " ", " ", " ", " ", " ", " ", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", " ", " ", " ", " ", " ", " ", " ", " ", "0", "0", "0", "0", "0"}
                , {"0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0"}
                , {"0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "E", " ", "A", "?", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0"}
                , {"0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", " ", " ", " ", " ", " ", " ", " ", "0", "0", "0", "0", "0"}
                , {"0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "?", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}
                , {"0", "0", " ", " ", " ", " ", " ", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", " ", " ", " ", " ", " ", " ", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}
                , {"0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", " ", " ", " ", " ", " ", " ", " ", " ", "0", "0", "0", "0", "0"}
                , {"0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0"}
                , {"0", "0", " ", " ", " ", " ", "0", "0", "0", "0", "0", "0", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "0", "0", "0", "0", "0", "0", " ", " ", " ", " ", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0"}
                , {"0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", " ", " ", " ", " ", " ", " ", " ", "0", "0", "0", "0", "0"}
                , {"0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", " ", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}
                , {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", " ", " ", " ", " ", " ", " ", " ", " ", " ", "0", "0", "0", "0", "0", "0", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "0", "0", "0", "0", "0", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "0", "0"}
                , {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}};  
private int posX = 0;   
private int posY = 1;  

    public void inizializzaZone(){
        this.zonaAttuale=new Zona(1, "zona1", 0, 0);
        zone.add(0, this.zonaAttuale);
    }
    
    public void generaNemici(){
        for(int i = 0; i<50; i++){   
            int posizioneX = (int)(Math.random()*59);
            int posizioneY = (int)(Math.random()*24);
            if((labirinto[posizioneY][posizioneX].compareTo("0")) == 0 || (labirinto[posizioneY][posizioneX].compareTo("X")) == 0 || (labirinto[posizioneY][posizioneX].compareTo("E")) == 0 ){}
            else{labirinto[posizioneY][posizioneX] = "A";}
        }
    generaIndovinelli();
    }

    public void generaIndovinelli(){
        for(int i = 0; i<50; i++){   
            int posizioneX = (int)(Math.random()*59);
            int posizioneY = (int)(Math.random()*24);
            if((labirinto[posizioneY][posizioneX].compareTo("0")) == 0 || (labirinto[posizioneY][posizioneX].compareTo("X")) == 0 || (labirinto[posizioneY][posizioneX].compareTo("A")) == 0 || (labirinto[posizioneY][posizioneX].compareTo("E")) == 0 ){}
            else{labirinto[posizioneY][posizioneX] = "!";}
        }
    visualizzaMappa();
    }

    
    public Zona getZona(Zona zonaAttuale){
        if(player.getPosizione().getColonna()>zonaAttuale.getFineColonnaZona()){
            return new Zona(zonaAttuale.getId()+1,"zona"+String.valueOf(zonaAttuale.getId()+1),zonaAttuale.getInizioRigaZona(),player.getPosizione().getColonna());
        }
        else if(player.getPosizione().getRiga()>zonaAttuale.getFineRigaZona()){
            return new Zona(zonaAttuale.getId()+6,"zona"+String.valueOf(zonaAttuale.getId()+6),player.getPosizione().getRiga(), zonaAttuale.getInizioColonnaZona());
        }
        else if(player.getPosizione().getColonna()<zonaAttuale.getInizioColonnaZona()){
            return new Zona(zonaAttuale.getId()-1,"zona"+String.valueOf(zonaAttuale.getId()-1),zonaAttuale.getInizioRigaZona(), player.getPosizione().getColonna()-10);
        }
        else if(player.getPosizione().getRiga()<zonaAttuale.getInizioRigaZona()){
            return new Zona(zonaAttuale.getId()-6,"zona"+String.valueOf(zonaAttuale.getId()-6), player.getPosizione().getRiga()-5, zonaAttuale.getInizioColonnaZona());
        }
        else{
            return zonaAttuale;
        }
    }
  
    public void visualizzaMappa(){
    System.out.println(" \n-------------------------LABIRINTO------------------------------");
    System.out.println();
        for (String[] a : labirinto) {
        for (String b : a) {  System.out.print(b); }
        System.out.println();
        }
    System.out.println("-----------------------------------------------------------");
    zonaAttuale = getZona(zonaAttuale);
        if(zone.contains(zonaAttuale)!=true){
        zone.add(zonaAttuale);
        }
    System.out.println("Ti trovi nella: ");
    System.out.println(zone.get(zone.size() -1).getName());
    movimento();
    } 

    public void movimento(){
    player.esaminaStatistiche(player, zaino);
    int scelta = player.cammina();
        switch(scelta){
        case 1:
            if(muoviSu()){ System.out.println("Ti sei mosso in avanti"); }
            else{ System.out.println("c'è il muro"); }
        break;
        case 2:
            if(muoviGiu()){ System.out.println("Ti sei mosso in giu"); }
            else{ System.out.println("c'è il muro"); } 
        break;
        case 3:
            if(muoviDestra()){ System.out.println("Ti sei mosso a destra"); }
            else{ System.out.println("c'è il muro"); }
        break;
        case 4:
            if(muoviSinistra()){ System.out.println("Ti sei mosso a sinistra");}
            else{ System.out.println("c'è il muro"); }
        break;
        }
    visualizzaMappa();
    }

    public boolean muoviDestra(){
    player.getPosizione().setColonna(player.getPosizione().getColonna()+1);
        if((labirinto[posY][posX+1].compareTo("0")) == 0){
            return false; 
        }else if((labirinto[posY][posX+1].compareTo("E")) == 0){
            System.out.println("COMPLIMENTI HAI SALVATO IL MONDO!!!!");
            labirinto[posY][posX] = " ";
            posX++;
            labirinto[posY][posX] = "X";
            System.exit(0);
            return true;
        }else if(labirinto[posY][posX+1].compareTo("A") == 0){
            player.lotta(player);
            labirinto[posY][posX] = " ";
            posX++;
            labirinto[posY][posX] = "X";
            return true;
        }else if(labirinto[posY][posX+1].compareTo("?") == 0){
            player.raccogli(player, zaino);
            labirinto[posY][posX] = " ";
            posX++;
            labirinto[posY][posX] = "X";
            return true;
        }else if(labirinto[posY][posX+1].compareTo("!") == 0){
            player.indovinello(player);
            labirinto[posY][posX] = " ";
            posX++;
            labirinto[posY][posX] = "X";
            return true;
        }else{
            labirinto[posY][posX] = " "; //Lascio la posizione attuale
            posX++;
            labirinto[posY][posX] = "X"; //Occupo la nuova posizione
            return true;
        }
    }

    public boolean muoviSinistra(){
    player.getPosizione().setColonna(player.getPosizione().getColonna()-1);
        if((labirinto[posY][posX-1].compareTo("0")) == 0){
            return false; 
        }else if((labirinto[posY][posX-1].compareTo("E")) == 0){
            System.out.println("COMPLIMENTI HAI SALVATO IL MONDO!!!!");
            labirinto[posY][posX] = " ";
            posX--;
            labirinto[posY][posX] = "X";
            System.exit(0);
            return true;
        }else if(labirinto[posY][posX-1].compareTo("A") == 0){
            player.lotta(player);
            labirinto[posY][posX] = " ";
            posX--;
            labirinto[posY][posX] = "X";
            return true;
        }else if(labirinto[posY][posX-1].compareTo("?") == 0){
            player.raccogli(player, zaino);
            labirinto[posY][posX] = " ";
            posX--;
            labirinto[posY][posX] = "X";
            return true;
        }else if(labirinto[posY][posX-1].compareTo("!") == 0){
            player.indovinello(player);
            labirinto[posY][posX] = " ";
            posX--;
            labirinto[posY][posX] = "X";
            return true;
        }else{
            labirinto[posY][posX] = " "; 
            posX--;
            labirinto[posY][posX] = "X";  
            return true;
        }
    }

    public boolean muoviGiu(){
    player.getPosizione().setRiga(player.getPosizione().getRiga()+1);
        if((labirinto[posY+1][posX].compareTo("0")) == 0){
            return false; 
        }else if((labirinto[posY+1][posX].compareTo("E")) == 0){
            System.out.println("COMPLIMENTI HAI SALVATO IL MONDO!!!!");
            labirinto[posY][posX] = " ";
            posY++;
            labirinto[posY][posX] = "X";
            System.exit(0);
            return true;
        }else if(labirinto[posY+1][posX].compareTo("A") == 0){
            player.lotta(player);
            labirinto[posY][posX] = " ";
            posY++;
            labirinto[posY][posX] = "X";
            return true;
        }else if(labirinto[posY+1][posX].compareTo("?") == 0){
            player.raccogli(player, zaino);
            labirinto[posY][posX] = " ";
            posY++;
            labirinto[posY][posX] = "X";
            return true;
        }else if(labirinto[posY+1][posX].compareTo("!") == 0){
            player.indovinello(player);
            labirinto[posY][posX] = " ";
            posY++;
            labirinto[posY][posX] = "X";
            return true;
        }else{
            labirinto[posY][posX] = " ";  
            posY++;
            labirinto[posY][posX] = "X";
            return true;
        }
    }

    public boolean muoviSu(){
    player.getPosizione().setRiga(player.getPosizione().getRiga()-1);
        if((labirinto[posY-1][posX].compareTo("0")) == 0){
            return false;
        }else if(labirinto[posY-1][posX].compareTo("A") == 0){
            player.lotta(player);
            labirinto[posY][posX] = " ";
            posY--;
            labirinto[posY][posX] = "X";
            return true;
        }else if(labirinto[posY-1][posX].compareTo("?") == 0){
            player.raccogli(player, zaino);
            labirinto[posY][posX] = " ";
            posY--;
            labirinto[posY][posX] = "X";
            return true;
        }else if(labirinto[posY-1][posX].compareTo("!") == 0){
            player.indovinello(player);
            labirinto[posY][posX] = " ";
            posY--;
            labirinto[posY][posX] = "X";
            return true;
        }else{
            labirinto[posY][posX] = " "; 
            posY--;
            labirinto[posY][posX] = "X";   
            return true;
        }
    }
}

