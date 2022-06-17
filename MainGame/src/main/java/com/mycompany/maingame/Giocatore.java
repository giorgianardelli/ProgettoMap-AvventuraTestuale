/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maingame;

/**
 *
 * @author giorg
 */
import com.mycompany.Controllo.Controlli;
import com.mycompany.ZoneMappa.Posizione;
import java.util.Scanner;
import java.util.regex.Pattern;

class Giocatore {
  Scanner scanner = new Scanner(System.in);
  Controlli control = new Controlli();
  
  private int vita;
  private int stamina;
  private int forza;
  private Posizione posizione;    

  Giocatore(int vita, int stamina, int forza, Posizione posizione){
    this.vita = vita;
    this.stamina = stamina;
    this.forza = forza;
    this.posizione=posizione;
    }

  public void setPosizione(Posizione posizione) {
        this.posizione = posizione;
    }
  
  public Posizione getPosizione() {
        return posizione;
    }
  
  public int getVita(){
        return vita;
    }

  public void setVita(int vita){
        this.vita = vita;
    }
   
  public int getStamina(){
        return stamina;
    } 

  public void setStamina(int stamina){
        this.stamina = stamina;
    }

  public int getForza(){
        return forza;
    }

  public void setForza(int forza){
        this.forza = forza;
    }

  public void getStatistiche(){
    System.out.println("                                            ---------------------------");
    System.out.println("                                            | ECCO LE TUE STATISTICHE |");
    System.out.println("                                            ---------------------------");
    System.out.println("                                            | FORZA: " + forza);
    System.out.println("                                            | VITA: " + vita);
    System.out.println("                                            | STAMINA: " + stamina);
    System.out.println("                                            ---------------------------");

    }
  
  public int cammina(){
    int scelta = 0;
    
    do{
      try{
        System.out.println("Dove vuoi andare? ");
        System.out.println("1 - Su\t\t2 - Giu\t\t\t\n3 - Destra\t4 - Sinistra");
        System.out.print("Inserisci mossa --> ");
        scelta = scanner.nextInt();
      }catch(Exception e){
        System.out.println("ATTENZIONE !!! Non hai inserito un input corretto ..." + scanner.next());
      }
    }while(scelta >= 5);
    
    return scelta;
  } 

  public void esaminaStatistiche(Giocatore player, Inventario zaino){
    if(getVita() <= 0){
      System.out.println("Forse non eri l'uomo adatto ...");
      System.exit(0);
    }else if(getStamina() <= 30){
      System.out.println("Hai bisogno di mangiare qualcosa!!!");
      mangia(player, zaino);
    } 
  }

  public void lotta(Giocatore player){
    int scelta = 0;
    int vita_nemico = 60;

    System.out.println("\nHai incontrato un guardiano del labirinto, preparati a combattere !!!");

    do{

       int random_lotta = (int)Math.floor(Math.random()*((2-0)+0)+1);

       if(random_lotta == 1){

      do{
        try{
          System.out.println("\nChe vuoi fare? ");
          System.out.print("1 - Attacca\t\t2 - Insulta\n");
          System.out.print("Inserisci mossa --> ");
          scelta = scanner.nextInt();
        }catch(Exception e){
        System.out.println("ATTENZIONE !!! Non hai inserito un input corretto ..." + scanner.next());
       }  
      }while(scelta >= 3);

      if(scelta == 1){

        int random_schiva = (int)Math.floor(Math.random()*((2-0)+0)+1);

        if(random_schiva == 1){
          
          System.out.println("\nBel colpo, il nemico ne ha risentito. Continua cosi!!!");
          vita_nemico = vita_nemico -20;
          System.out.println("VITA AVVERSARIO: " + vita_nemico);
          
        }else if(random_schiva == 2){

          System.out.println("\nPresta più attenzione il nemico ha schivato il tuo colpo ...");
          int stamina = getStamina() - 1;
          setStamina(stamina);
          
        }
        
      }else if(scelta == 2){

        int random_insulto = (int)Math.floor(Math.random()*((3-0)+0)+1);

        if(random_insulto == 1){
          
          System.out.println("Per quanto sei brutto mi fai pena!!! \n");

        }else if(random_insulto == 2){
          
          System.out.println("Dai sprigiona la forza che è in te e sparisci dai c****i!!! \n");
          
        }else if(random_insulto == 3){

          System.out.println("Senti l'ora delle visite è finita, vedi di andare a f***o \n");
          
        }
        
      }
      
    }else if(random_lotta == 2){

      System.out.println("Il nemico si sta scagliando verso di te, attenzione!!!");
      
      do{
        try{
          System.out.println("\nChe vuoi fare? ");
          System.out.print("1 - Schiva\t\t2 - Para\n");
          System.out.print("Inserisci mossa --> ");
          scelta = scanner.nextInt();
        }catch(Exception e){
        System.out.println("ATTENZIONE !!! Non hai inserito un input corretto ..." + scanner.next());
       }  
      }while(scelta >= 3);

      if(scelta == 1){

        int random_schiva = (int)Math.floor(Math.random()*((2-0)+0)+1);

        if(random_schiva == 1){
          
          System.out.println("\nCaspita, questo colpo ha fatto male ...");
          int vita = getVita() - 5;
          setVita(vita);
          
        }else if(random_schiva == 2){

          System.out.println("\nGrande continua cosi, hai schivato il colpo. Ma rimani concentrato!!!");
          int stamina = getStamina() - 1;
          setStamina(stamina);
          
        }
        
      }else if(scelta == 2){

        int random_parata = (int)Math.floor(Math.random()*((2-0)+0)+1);

        if(random_parata == 1){

          System.out.println("Caspita, questo colpo ha fatto male, non sei riuscito a parare il colpo ...");
          int vita = getVita() - 5;
          setVita(vita);
          
        }else if(random_parata == 2){

          System.out.println("Grande, hai parato il colpo!!");
          
        }
        
      }
      
    }

      if(getVita() <= 0){
        
        System.out.println("Non eri l'uomo adatto ...");
        System.exit(0);
        
      }else{
        
        getStatistiche();
        
      }

    }while(vita_nemico >= 0);

    int forza = getForza() + 5;
    setForza(forza);

  }  

  public void mangia(Giocatore player, Inventario zaino){
    Pattern mela = Pattern.compile("mela", Pattern.CASE_INSENSITIVE);
    Pattern lampone = Pattern.compile("lampone", Pattern.CASE_INSENSITIVE);
    Pattern fungo = Pattern.compile("fungo", Pattern.CASE_INSENSITIVE);
    String scelta ;
    scelta = scanner.nextLine();

    if(getStamina() >= 95){
      System.out.println("Non hai bisogno di mangiare, hai ancora molta energia");
    }else{
      
      do{
        try{
          System.out.print("\nInserisci il cibo che vuoi mangiare --> ");
          scelta = scanner.nextLine();
        }catch(Exception e){
          System.out.println("ATTENZIONE !!! Non hai inserito un input corretto ..." + scanner.next());
        }
      }while(!scelta.equalsIgnoreCase("mela") && !scelta.equalsIgnoreCase("lampone") && !scelta.equalsIgnoreCase("fungo"));

      if(scelta.equalsIgnoreCase("mela")){
        
        System.out.println("Hai mangiato una mela");
        int stamina = getStamina() + 5;
        setStamina(stamina);
        int mele= zaino.getMela() - 1;
        zaino.setMela(mele);
      
      }else if(scelta.equalsIgnoreCase("lampone")){

        System.out.println("Hai mangiato un lampone");
        int stamina = getStamina() + 5;
        setStamina(stamina);
        int lamponi = zaino.getLampone() - 1;
        zaino.setLampone(lamponi);
      
      }else if(scelta.equalsIgnoreCase("fungo")) {

        System.out.println("Hai mangiato un fungo");
        int stamina = getStamina() + 5;
        setStamina(stamina);
        int funghi = zaino.getFungo() -1;
        zaino.setFungo(funghi);
      }
      zaino.getInventario();
      getStatistiche();
    }
  }

  public void raccogli(Giocatore player, Inventario zaino){
    int random = (int)Math.floor(Math.random()*((3-0)+0)+1);
    String scelta = "";

    if(random == 1){

      System.out.println("Fantastico, hai trovato una mela!!!");
      int mela = zaino.getMela() + 1;
      zaino.setMela(mela);
      
    }else if(random == 2){

      System.out.println("Fantastico, hai trovato un lampone!!!");
      int lampone = zaino.getLampone() + 1;
      zaino.setLampone(lampone);
      
    }else if(random == 3){

      System.out.println("Fantastico, hai trovato un fungo!!!");
      int fungo = zaino.getFungo() + 1;
      zaino.setFungo(fungo);
      
    }

    zaino.getInventario();

    do{
      System.out.print("Vuoi mangiare qualosa? ");
      scelta = control.controlloRisposta();
    }while(!scelta.equalsIgnoreCase("si") && !scelta.equalsIgnoreCase("no"));

    if(scelta.compareTo("no") == 0){
      System.out.println("OK proseguiamo");
    }else{
      mangia(player, zaino);
    }

  }

  public void indovinello(Giocatore player){
    String scelta = "", risposta = "";
    Pattern candela = Pattern.compile("candela", Pattern.CASE_INSENSITIVE);
    Pattern uovo = Pattern.compile("uovo", Pattern.CASE_INSENSITIVE);
    Pattern bandiera = Pattern.compile("bandiera", Pattern.CASE_INSENSITIVE);
    
    System.out.println("\nIn lontananza senti una voce ...");
    
    do{
      System.out.print("Vuoi avvicinarti? ");
      scelta = control.controlloRisposta();
    }while(!scelta.equalsIgnoreCase("si") && !scelta.equalsIgnoreCase("no"));
    
    if(scelta.compareTo("si") == 0){
      System.out.println("Non preoccuparti, non ti farò nulla di male\nSe risponderai correttamente ad una domanda troverai all'interno del muro un dono, esso ti aiuterà a proseguire al meglio nella tua avventura, la domanda è:");
      int random = (int)Math.floor(Math.random()*((3-0)+0)+1);

      if(random == 1){

        System.out.println("                                            ---------------------------------------");
        System.out.println("                                            |     QUELLO CHE PRODUCO MI DIVORA    |");
        System.out.println("                                            |                  E                  |");
        System.out.println("                                            | LA MIA VITA PUO' DURARE QUALCHE ORA |");
        System.out.println("                                            |            CHE COSA SONO?           |");
        System.out.println("                                            ---------------------------------------");
        System.out.print("RISPOSTA: ");
        scanner.nextLine();
        risposta = scanner.nextLine();

        if(candela.matcher(risposta).matches()) {
          System.out.println("Complimenti hai risposto in maniera corretta, ti meriti un premio");
          if(getVita() >= 95){
            System.out.println("Caspita la tua vita è al massimo, allora ti donerò qualcosa che incrementerà la tua forza");
            System.out.println("Hai vinto una bevanda miracolosa!\nEssa è capace di aumentare la tua forza.");
System.out.println("La pozione è cristallina, emana una luce sorprendente,\n è inodore e dopo averla bevuta ti rendi conto essere anche insapore.\ne la cosa migliore e l'aumento della forza che ne consegue.");
            int forza = getForza() + 5;
            setForza(forza);
            getStatistiche();
          } else{
            System.out.println("Hai vinto una pozione!\nEssa ripristinerà la tua vita.");
            System.out.println("Noti che la pozione di un colore verde ributtante, ha un odore nauseante, ma per la tua sopravvivenza è necessario berla!");
            int vita = 100;
            setVita(vita);
            getStatistiche();
          }
        } else{
          System.out.println("Torna a scuola capra !!!");
        }
        
      } else if(random == 2){

        System.out.println("                                            -------------------------------");
        System.out.println("                                            |     TUTTI SANNO APRIRMI     |");
        System.out.println("                                            |              MA             |");
        System.out.println("                                            |     NESSUNO SA CHIUDERMI    |");
        System.out.println("                                            |        CHE COSA SONO?       |");
        System.out.println("                                            -------------------------------");
        System.out.print("RISPOSTA: ");
        scanner.nextLine();
        risposta = scanner.nextLine();

        if(uovo.matcher(risposta).matches()) {
          System.out.println("Complimenti hai risposto in maniera corretta, ti meriti un premio");
          if(getVita() >= 95){
      System.out.println("Caspita la tua vita è al massimo, allora ti donerò qualcosa che incrementerà la tua forza");
            System.out.println("Hai vinto una bevanda miracolosa!\nEssa è capace di aumentare la tua forza.");
System.out.println("La pozione è cristallina, emana una luce sorprendente,\n è inodore e dopo averla bevuta ti rendi conto essere anche insapore.\ne la cosa migliore e l'aumento della forza che ne consegue.");
            int forza = getForza() + 5;
            setForza(forza);
           getStatistiche();
          } else{
             System.out.println("Hai vinto una pozione!\nEssa ripristinerà la tua vita.");
             System.out.println("Noti che la pozione di un colore verde ributtante, ha un odore nauseante, ma per la tua sopravvivenza è necessario berla!");
            int vita = 100;
            setVita(vita);
            getStatistiche();
          }
        } else{
          System.out.println("Torna a scuola capra !!!");
        }
        
      } else if(random == 3){

        System.out.println("                                            ---------------------------------------");
        System.out.println("                                            |   MI SALUTANO SOLO SE SONO ALZATA   |");
        System.out.println("                                            |            CHE COSA SONO?           |");
        System.out.println("                                            ---------------------------------------");
        System.out.print("RISPOSTA: ");
        scanner.nextLine();
        risposta = scanner.nextLine();

        if(bandiera.matcher(risposta).matches()) {
          System.out.println("Complimenti hai risposto in maniera corretta, ti meriti un premio");
          if(getVita() >= 95){
      System.out.println("Caspita la tua vita è al massimo, allora ti donerò qualcosa che incrementerà la tua forza");
            System.out.println("Hai vinto una bevanda miracolosa!\nEssa è capace di aumentare la tua forza.");
System.out.println("La pozione è cristallina, emana una luce sorprendente,\n è inodore e dopo averla bevuta ti rendi conto essere anche insapore.\ne la cosa migliore e l'aumento della forza che ne consegue.");
            int forza = getForza() + 5;
            setForza(forza);
            getStatistiche();
          } else{
             System.out.println("Hai vinto una pozione!\nEssa ripristinerà la tua vita.");
             System.out.println("Noti che la pozione di un colore verde ributtante, ha un odore nauseante, ma per la tua sopravvivenza è necessario berla!");
            int vita = 100;
            setVita(vita);
            getStatistiche();
          }
        } else{
          System.out.println("Torna a scuola capra !!!");
        }
        
      }
      
    }else {
      System.out.println("Va bene fifone, continua per la tua strada");
    } 
    
  } 
}