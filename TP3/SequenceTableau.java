package TP3;

public class SequenceTableau implements Sequence{
    
    int[] tableau;
    int length;
    int max = 1;

    SequenceTableau(){
        tableau = new int[max];
        length = 0;
    }

    public void insereTete(int element){
        if (length >= max){
            int[] tmp;
            max++;
            tmp = tableau; 
            tableau = new int[max];
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

    public void insereQueue(int element){
        if (length >= max){
            int[] tmp;
            max++;
            tmp = tableau; 
            tableau = new int[max];
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

    public int extraitTete(){
        if (length == 0){
            throw new RuntimeException("La liste est vide");
        } else {
            int tete = tableau[0];
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

    public Iterateur iterateur(){
        return new IterateurTableau(this);
    }
}
