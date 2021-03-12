package TP4;

public class IterateurListe<Type> extends Iterateur<Type>{

    Maillon<Type> courant, precedent; 

    IterateurListe(SequenceListe<Type> l){
        courant = l.tete;
        peutsupprimer = false;
        precedent = null; 
    }
    
    @Override
    public boolean aProchain(){
        return courant != null && courant.suivant != null;
    }
    
    @Override
    public Type prochain(){
        Type element;
        precedent = courant;
        element = courant.element; 
        courant = courant.suivant;
        super.prochain();
        return element;
    }

    @Override
    public void supprime(){
        Maillon<Type> new_courant; 
        super.supprime();
        new_courant = courant.suivant;
        precedent.suivant = new_courant;
        courant = new_courant; 
    }
    
}
