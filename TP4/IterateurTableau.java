package TP4;

public class IterateurTableau<Type> extends Iterateur<Type>{
    
    int indice;
    SequenceTableau<Type> s;

    
    IterateurTableau(SequenceTableau<Type> t){
        s = t;
        peutsupprimer = false;  
    }

    @Override
    public boolean aProchain(){
        return indice < s.length;
    }

    @Override
    public Type prochain(){
        super.prochain();
        Type resultat = (Type) s.tableau[indice];
        indice++;
        return resultat;
    }

    @Override
    public void supprime(){
        super.supprime();
        int i = indice; 
        while(i<s.length-1){
            s.tableau[i]=s.tableau[i+1];
            i++;
        }
        s.length--;
    }

    
}
