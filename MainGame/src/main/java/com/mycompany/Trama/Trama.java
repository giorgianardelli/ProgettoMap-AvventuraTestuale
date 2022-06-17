/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Trama;
import com.mycompany.Controllo.Controlli;
import java.util.Scanner;

/**
 *
 * @author giorg
 */
public class Trama {
  Scanner scanner = new Scanner(System.in);
  Controlli control = new Controlli();
  
  public void game(){
    System.out.println("                                            ------------------------------------");
    System.out.println("                                            |             NEPHILIM              |");
    System.out.println("                                            | IL PROTETTORE DELLA COPPA MORTALE |");
    System.out.println("                                            ------------------------------------");
  }

  public String menu() {
    System.out.println("                                                [GIOCA]    [AIUTO]    [ESCI]");
    String scelta = control.controlloStringMenu();
    return scelta;
  }
  
  public void visualizzaTrama(){
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("Mille anni fa l'angelo Raziel ha mescolato il proprio sangue con quello dei Mondani, gli esseri umani,");
    System.out.println("dando così vita ai Nephilim, metà uomini e metà angeli che abitano il mondo dei Mondani senza che nessuno possa vederli. ");
    System.out.println("Il loro compito è proteggere i Mondani e il mondo nascosto, un mondo formato da creature tanto intelligenti quanto pericolose.\nVampiri, lupi, seelie e stregoni fanno parte di tale mondo nascosto.");
    System.out.println("I Nephilim sono rappresentati da un’assemblea dei più intrepidi, il Clave. \nMa c’è qualcuno che non appoggia l’idea di proteggere le creature del mondo Nascosto, ritenendo tali creature degli abomini.");
    System.out.println("Valentine Morgenstern, un Nephilim che si è ribellato all’autorità del Clave, è entrato in possesso della Coppa Mortale, \nuno strumento che se attivato distruggerebbe l’intero mondo nascosto.");
    System.out.println("Tale strumento è tenuto sotto sorveglianza dai tirapiedi di Valentine all’interno di un intricato labirinto, pieno di insidie.");
    System.out.println("C’è bisogno di un Nephilim potente e intrepido in grado di distruggere per sempre la coppa mortale per porre fine alla ribellione di Valentine. ");
    System.out.println("Sei stato scelto per questa rischiosa avventura per il tuo animo intrepido, sei pronto per questa avventura?");
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.print("Conosciamoci un po, come ti chiami ---> ");
    String nome = scanner.nextLine();
    System.out.println("OK " + nome + " la tua avventura ha inizio, contiamo tutti su di te!!!");
    avvertenze();
  }

  public void avvertenze(){
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("Presta attenzione durante il tuo cammino a non terminare la salute e la stamina:");
    System.out.println("Potrai recuperare queste statistiche utilizzando gli oggetti che troverai lungo il tuo cammino.");
    System.out.println("La tua forza, invece, aumenterà ogni volta che vinci uno scontro.");
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
    letturaCartello();
  }

  public void letturaCartello(){
    String risposta = ""; 

    System.out.println("Dopo un lungo viaggio sei all'entrata del labirinto.");
    System.out.println("Davanti a te si trova l'entrata del labirinto dai muri tanto alti quanto imponenti.");
    System.out.println("Facendo attenzione si nota che all'entrata del labirinto è presente un cartello. ");
    
    do {
      System.out.print("Vuoi leggerlo? ");
      risposta = control.controlloRisposta();
    } while(!risposta.equalsIgnoreCase("si") && !risposta.equalsIgnoreCase("no"));

    if(risposta.compareTo("si") == 0){
      contenutoCartello();
    } else {
      System.out.println("Va bene andiamo avanti !!!");
    }
  }

  public void contenutoCartello(){
    System.out.println("\n                                          -------------------------------------");
    System.out.println("                                            |  BISOGNA STARE SEMPRE IN ALLERTA  |");
    System.out.println("                                            | LE INSIDIE SONO SEMPRE IN AGGUATO |");
    System.out.println("                                            -------------------------------------");
  }
}
