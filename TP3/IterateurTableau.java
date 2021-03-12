package TP3;

public class IterateurTableau implements Iterateur{
    
    int indice;
    SequenceTableau s; 
    
    IterateurTableau(SequenceTableau t){
        s = t; 
    }

    @Override
    public boolean aProchain(){
        return indice < s.length;
    }

    @Override
    public int prochain(){
        int resultat = s.tableau[indice];
        indice++;
        return resultat;
    }

    @Override
    public void supprime(){}

    
}
