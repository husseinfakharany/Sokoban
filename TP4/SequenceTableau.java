package TP4;

public class SequenceTableau<Type> implements Sequence<Type>{
    
    Object[] tableau;
    int length;
    int max = 1;

    SequenceTableau(){
        tableau = new Object[max];
        length = 0;
    }

    public void insereTete(Type element){
        if (length >= max){
            Object[] tmp;
            max++;
            tmp = tableau; 
            tableau = new Object[max];
            for(int i=0; i<length; i++)
                tableau[i]=tmp[i];
        }
        if (length==0){
            tableau[0]=element;
        }
        else{
            int i=length;
            while (i>0){
                tableau[i]=tableau[i-1];
                i--;
            }
            tableau[0]=element;
        }
        length++;
    }

    public void insereQueue(Type element){
        if (length >= max){
            Object[] tmp;
            max++;
            tmp = tableau; 
            tableau = new Object[max];
            for(int i=0; i<length; i++)
                tableau[i]=tmp[i];
        }
        if (length==0){
            tableau[0] = element;
        } 
        else {
            tableau[length]=element; 
        }
        length++;
    }

    public Type extraitTete(){
        if (length == 0){
            throw new RuntimeException("La liste est vide");
        } else {
            Type tete = (Type) tableau[0];
            for (int i=0; i<length-1; i++){
                tableau[i] = tableau[i+1];
            }
            length--;
            return tete;
        }
    }

    public boolean estVide(){
        return length==0; 
    }

    public String toString(){
        String res = "[";
        for(int i=0; i<length; i++){
            res += (tableau[i] + " ");
        }
        return res + "]";
    }

    public Iterateur<Type> iterateur(){
        return new IterateurTableau<>(this);
    }
}
