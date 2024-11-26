package com.mycompany._4id_gonzaga_verifica.zip;

//Creo la classe "Output" per stampare i vari valori degli attributi inseriti dall'utente
public class Output {
    
    //Creo il metodo "Stampa" per stampare in modo migliore i valori degli attributi dati dall'utente
    public void Stampa (){
        
        //Istanzio l'oggetto "Ragazzo" di tipo "Studente"
        Studente Ragazzo = new Studente ();
        
        //Istanzio l'oggetto "Insegnante" di tipo "Docente"
        Docente Insegnante = new Docente ();
        
        //Mostro una riga vuota per la migliore stampa
        System.out.println("");
        
        //Mostro una riga con il nome e il cognome dello studente attraverso i metodi get
        System.out.println("Studente: " + Ragazzo.getCognome() + ", " + Ragazzo.getNome());
        
        //Mostro una riga con il voto di informatica dello studente attraverso il metodo get
        System.out.println("Voto di informatica: " + Ragazzo.getVotoInformatica());
        
        //Mostro una riga con il voto di matematica dello studente attraverso il metodo get
        System.out.println("Voto di matematica: " + Ragazzo.getVotoMatematica());
        
        //Mostro una riga con il voto di italiano dello studente attraverso il metodo get
        System.out.println("Voto di italiano: " + Ragazzo.getVotoItaliano());
        
        //Mostro una riga vuota per la migliore stampa
        System.out.println("");
        
        //Mostro una riga vuota per la migliore stampa
        System.out.println("");
        
        //Mostro una riga con il cognome del docente di informatica attraverso il metodo get
        System.out.println("Docente di informatica: " + Insegnante.getProfInformatica());
        
        //Mostro una riga con il cognome del docente di italiano attraverso il metodo get
        System.out.println("Docente di italiano: " + Insegnante.getProfItaliano());
        
        //Mostro una riga con il cognome del docente di matematica attraverso il metodo get
        System.out.println("Docente di matematica: " + Insegnante.getProfMatematica());
        
    }
}
