package TP4;

public abstract class Iterateur<Type> {
    boolean peutsupprimer;

    boolean aProchain(){
        return true; 
    }

    Type prochain(){
        peutsupprimer = true;
        return null;
    }

    void supprime(){
        if (!peutsupprimer)
            throw new IllegalStateException("Suppression pas possible");
    }
}
