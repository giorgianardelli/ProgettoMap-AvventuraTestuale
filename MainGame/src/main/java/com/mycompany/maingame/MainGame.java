/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.maingame;

import com.mycompany.Trama.Trama;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author giorg
 */
public class MainGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Trama trama = new Trama();
    Mappa mappa = new Mappa();

    String cmd = "";
    trama.game();

        do{
        cmd = trama.menu();
            switch(cmd){
            case "gioca" :
            trama.visualizzaTrama();
            mappa.inizializzaZone();
            mappa.generaNemici();
            break;
            case "aiuto" :
                try{
                    File file = new File("aiuto.txt");
                    Scanner leggi = new Scanner(file);
                    while (leggi.hasNextLine()) {
                        String data = leggi.nextLine();
                        System.out.println(data);
                    }
            
                leggi.close();
            
                }catch(FileNotFoundException e){
                System.out.println("Si è verificato un errore");
                e.printStackTrace();
                }
            break;
            case "esci" :
            System.out.println("\nGrazie per aver provato il nostro gioco, a presto");
            System.exit(0);
            break;
            default :
            System.out.println("\nCOMANDO ERRATO!!! Se non sai cosa inserire puoi sempre chiedere aiuto");
            }
        }while(!cmd.equalsIgnoreCase("esci"));
    }
}
