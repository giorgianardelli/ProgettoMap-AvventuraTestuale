/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controllo;

import java.util.regex.Pattern;
import java.util.Scanner;

/**
 *
 * @author giorg
 */

public class Controlli {
    
Scanner scanner = new Scanner(System.in);

    public String controlloStringMenu() {
    boolean flag = true;
    String scelta = "";
    Pattern gioca = Pattern.compile("gioca", Pattern.CASE_INSENSITIVE);
    Pattern aiuto = Pattern.compile("aiuto", Pattern.CASE_INSENSITIVE);
    Pattern esci = Pattern.compile("esci", Pattern.CASE_INSENSITIVE);

        do {

        System.out.print("Cosa vuoi fare?\nInserisci scelta: ");
        scelta = scanner.nextLine();

            if(gioca.matcher(scelta).matches()) {
                scelta = "gioca";
                flag = true;
            } else if(aiuto.matcher(scelta).matches()) {
                scelta = "aiuto";
                flag = true;
            } else if(esci.matcher(scelta).matches()) {
                scelta = "esci";
                flag = true;
            } else {
                System.out.println("Inserimento errato, inserire un valore corretto!!!\n");
                flag = false;
            }
      
        } while(flag == false);
    return scelta;
    }

    public String controlloRisposta() {
    boolean flag = true;
    String scelta = "";
    Pattern si = Pattern.compile("si", Pattern.CASE_INSENSITIVE);
    Pattern no = Pattern.compile("no", Pattern.CASE_INSENSITIVE);

    scelta = scanner.nextLine();

        if(si.matcher(scelta).matches()) {
            scelta = "si";
        } else if(no.matcher(scelta).matches()) {
            scelta = "no";
        } else {
            System.out.println("Inserimento errato, inserire un valore corretto!!!\n");
        } 
    return scelta;
    }
}

