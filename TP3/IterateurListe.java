package TP3;

public class IterateurListe implements Iterateur{

    Maillon courant;

    IterateurListe(SequenceListe l){
        courant = l.tete;
    }
    
    public boolean aProchain(){
        return courant.suivant != null;
    }
    public int prochain(){
        int element;
        element = courant.element; 
        courant = courant.suivant;
        return element;
    }

    public void supprime(){}
    
}
