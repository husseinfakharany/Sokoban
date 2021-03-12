package TP4;

public class FAPListe<Type extends Comparable<Type>> extends FAP<Type>{
    SequenceListe<Type> s;

    FAPListe(){
        s = new SequenceListe<>();
    }

    @Override
    void insere(Type element){
        Maillon<Type> courant; 
        while((courant != null) && (element.compareTo(courant.element)>0)){
            courant = courant.suivant; 
        }

        Maillon<Type> new_Maillon = new Maillon<>(element,courant);
    }
}