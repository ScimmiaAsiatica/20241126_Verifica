package com.mycompany._4id_gonzaga_verifica.zip;

//Importo la classe "Scanner" che permette 
import java.util.Scanner;

//Creo la classe "Docente" che permette di far inserire il nome dei 3 docenti 
public class Docente {
    
    //Dichiaro l'attributo "ProfInformatica" che ha visibilità privata ed è di tipo String
    private String ProfInformatica;
    
    //Dichiaro l'attributo "ProfMatematica" che ha visibilità privata ed è di tipo String
    private String ProfMatematica;
    
    //Dichiaro l'attributo "ProfItaliano" che ha visibilità privata ed è di tipo String
    private String ProfItaliano;
    
    //Creo la classe "InputProfInformatica" per far inserire il valore dell'attributo "ProfInformatica" dall'utente
    public void InputProfInformatica (){
        
        //Istanzio l'oggetto "InputProfInfo" di tipo "Scanner"
        Scanner InputProfInfo = new Scanner(System.in);
        
        //Mostro un messaggio in output
        System.out.println("Inserisci il cognome del docente di informatica: ");
        
        //Assegno all'attributo "ProfInformatica" il valore di tipo String dato dall'utente
        ProfInformatica = InputProfInfo.nextLine();
        
    }
    
    //Creo la classe "InputProfMatematica" per far inserire il valore dell'attributo "ProfMatematica" dall'utente
    public void InputProfMatematica (){
        
        //Istanzio l'oggetto "InputProfMate" di tipo "Scanner"
        Scanner InputProfMate = new Scanner(System.in);
        
        //Mostro un messaggio in output
        System.out.println("Inserisci il cognome del docente di matematica: ");
        
        //Assegno all'attributo "ProfMatematica" il valore di tipo String dato dall'utente
        ProfMatematica = InputProfMate.nextLine();
        
    }
    
    //Creo la classe "InputProfItaliano" per far inserire il valore dell'attributo "ProfItaliano" dall'utente
    public void InputProfItaliano (){
        
        //Istanzio l'oggetto "InputProfIta" di tipo "Scanner"
        Scanner InputProfIta = new Scanner(System.in);
        
        //Mostro un messaggio in output
        System.out.println("Inserisci il cognome del docente di italiano: ");
        
        //Assegno all'attributo "ProfItaliano" il valore di tipo String dato dall'utente
        ProfItaliano = InputProfIta.nextLine();
        
    }
      
    //Creo il metodo "getProfInformatica" che permette di far accedere alle altre classi al valore dell'attributo "ProfInformatica"
    public String getProfInformatica (){
        
        //Ritorno il valore dell'attributo "ProfInformatica"
        return ProfInformatica;
        
    }
    
    //Creo il metodo "getProfMatematica" che permette di far accedere alle altre classi al valore dell'attributo "ProfMatematica"
    public String getProfMatematica (){
        
        //Ritorno il valore dell'attributo "ProfMatematica"
        return ProfMatematica;
        
    }
    
    //Creo il metodo "getProfItaliano" che permette di far accedere alle altre classi al valore dell'attributo "ProfItaliano"
    public String getProfItaliano (){
        
        //Ritorno il valore dell'attributo "ProfItaliano"
        return ProfItaliano;
        
    }
    
}
