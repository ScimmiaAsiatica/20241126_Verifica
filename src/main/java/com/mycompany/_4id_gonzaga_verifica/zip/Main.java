/*Edward Gonzaga  4INF.D    26/11/2024

Titolo: Gestione degli studenti e degli insegnanti di una scuola

Funzionamento: Progetta e definisci il codice per un programma in linguaggio Java che gestisca una scuola con studenti e docenti. 
Ogni studente ha cognome, nome, e 3 tre voti (1 per ogni materia), mentre ogni docente ha un cognome e una materia che insegna.

*/
package com.mycompany._4id_gonzaga_verifica.zip;


public class Main {
    
    public static void main(String[] args) {
        
        //Istanzio l'oggetto "Alunno" di tipo "Studente"
        Studente Alunno = new Studente ();
        
        //Istanzio l'oggetto "Professore" di tipo "Docente"
        Docente Professore = new Docente ();
        
        //Istanzio l'oggetto "Stampa" di tipo "Output"
        Output Stampa = new Output (); 
        
        //Attraverso l'oggetto utilizzo il metodo "InputCognome" della classe "Studente"
        Alunno.InputCognome();
        
        //Attraverso l'oggetto utilizzo il metodo "InputNome" della classe "Studente"
        Alunno.InputNome();
        
        //Attraverso l'oggetto utilizzo il metodo "InputVotoInformatica" della classe "Studente"
        Alunno.InputVotoInformatica();
        
        //Attraverso l'oggetto utilizzo il metodo "InputVotoItaliano" della classe "Studente"
        Alunno.InputVotoItaliano();
        
        //Attraverso l'oggetto utilizzo il metodo "InputVotoMatematica" della classe "Studente"
        Alunno.InputVotoMatematica();
        
        //Attraverso l'oggetto utilizzo il metodo "InputProfInformatica" della classe "Docente"
        Professore.InputProfInformatica();
        
        //Attraverso l'oggetto utilizzo il metodo "InputProfItaliano" della classe "Docente"
        Professore.InputProfItaliano();
        
        //Attraverso l'oggetto utilizzo il metodo "InputProfMatematica" della classe "Docente"
        Professore.InputProfMatematica();
        
        //Attraverso l'oggetto utilizzo il metodo "Stampa" della classe "Output"
        Stampa.Stampa();
        
        
    }
}
