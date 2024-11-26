package com.mycompany._4id_gonzaga_verifica.zip;

//Importo la classe "Scanner" che permette 
import java.util.Scanner;


//Creo la classe "Studente" che permette di far inserire il: nome, cognome e i vari voti delle materie
public class Studente {
    
    //Dichiaro l'attributo "cognome" che ha visibilità privata ed è di tipo String
    private String cognome;
    
    //Dichiaro l'attributo "nome" che ha visibilità privata ed è di tipo String
    private String nome; 
    
    //Dichiaro l'attributo "VotoInformatica" che ha visibilità privata ed è di tipo int
    private int VotoInformatica;
    
    //Dichiaro l'attributo "VotoMatematica" che ha visibilità privata ed è di tipo int
    private int VotoMatematica;
    
    //Dichiaro l'attributo "VotoItaliano" che ha visibilità privata ed è di tipo int
    private int VotoItaliano;
    
    //Creo la classe "InputCognome" per far inserire il valore dell'attributo "cognome" dall'utente
    public void InputCognome (){
        
        //Istanzio l'oggetto "InputSurname" di tipo "Scanner"
        Scanner InputSurname = new Scanner(System.in);
        
        //Mostro un messaggio in output
        System.out.println("Inserisci il tuo cognome dello studente: ");
        
        //Assegno all'attributo "cognome" il valore di tipo String dato dall'utente 
        cognome = InputSurname.nextLine();
        
    }
    
    //Creo la classe "InputNome" per far inserire il valore dell'attributo "nome" dall'utente
    public void InputNome (){
        
        //Istanzio l'oggetto "InputName" di tipo "Scanner"
        Scanner InputName = new Scanner(System.in);
        
        //Mostro un messaggio in output
        System.out.println("Inserisci il tuo nome dello studente: ");
        
        //Assegno all'attributo "nome" il valore di tipo String dato dall'utente 
        nome = InputName.nextLine();
        
    }
    
    //Creo la classe "InputVotoInformatica" per far inserire il valore dell'attributo "VotoInformatica" dall'utente
    public void InputVotoInformatica (){
        
        //Istanzio l'oggetto "InputInfoGrade" di tipo "Scanner"
        Scanner InputInfoGrade = new Scanner(System.in);
        
        //Mostro un messaggio in output
        System.out.println("Inserisci il tuo voto di informatica: ");
        
        //Assegno all'attributo "VotoInformatica" il valore di tipo int dato dall'utente
        VotoInformatica = InputInfoGrade.nextInt();
        
    }
    
    //Creo la classe "InputVotoMatematica" per far inserire il valore dell'attributo "VotoMatematica" dall'utente
    public void InputVotoMatematica (){
        
        //Istanzio l'oggetto "InputMathGrade" di tipo "Scanner"
        Scanner InputMathGrade = new Scanner(System.in);
        
        //Mostro un messaggio in output
        System.out.println("Inserisci il tuo voto di matematica: ");
        
        //Assegno all'attributo "VotoMatematica" il valore di tipo int dato dall'utente
        VotoMatematica = InputMathGrade.nextInt();
        
    }
    
    //Creo la classe "InputVotoItaliano" per far inserire il valore dell'attributo "VotoItaliano" dall'utente
    public void InputVotoItaliano (){
        
        //Istanzio l'oggetto "InputItaGrade" di tipo "Scanner"
        Scanner InputItaGrade = new Scanner(System.in);
        
        //Mostro un messaggio in output
        System.out.println("Inserisci il tuo voto di italiano: ");
        
        //Assegno all'attributo "VotoItaliano" il valore di tipo int dato dall'utente
        VotoItaliano = InputItaGrade.nextInt();
        
    }
    
    //Creo il metodo "getCognome" che permette di far accedere alle altre classi al valore dell'attributo "cognome"
    public String getCognome (){
        
        //Ritorno il valore dell'attributo "cognome"
        return cognome;
        
    }
    
    //Creo il metodo "getNome" che permette di far accedere alle altre classi al valore dell'attributo "nome"
    public String getNome (){
        
        //Ritorno il valore dell'attributo "nome"
        return nome;
        
    }
    
    //Creo il metodo "getVotoInformatica" che permette di far accedere alle altre classi al valore dell'attributo "VotoInformatica"
    public int getVotoInformatica (){
        
        //Ritorno il valore dell'attributo "VotoInformatica"
        return VotoInformatica;
        
    }
    
    //Creo il metodo "getVotoMatematica" che permette di far accedere alle altre classi al valore dell'attributo "VotoMatematica"
    public int getVotoMatematica (){
        
        //Ritorno il valore dell'attributo "VotoMatematica"
        return VotoMatematica;
        
    }
    
    //Creo il metodo "getVotoItaliano" che permette di far accedere alle altre classi al valore dell'attributo "VotoItaliano"
    public int getVotoItaliano (){
        
        //Ritorno il valore dell'attributo "VotoItaliano"
        return VotoItaliano;
        
    }
}
