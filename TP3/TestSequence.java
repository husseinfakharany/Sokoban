package TP3;

public class TestSequence{
    public static void main(String [] args){
        Sequence s1 = new SequenceTableau();
        Sequence s2 = new SequenceListe();
        
        s1.insereTete(3);
        s1.insereTete(2);
        s1.insereTete(4);
        s2.insereTete(5);
        s2.insereTete(6);
        s2.insereTete(3);
        System.out.println();
        System.out.println(s2.extraitTete());
        System.out.println(s2.toString());
        System.out.println(s2.estVide());

        System.out.println("Affichage aver Itérateur: ");
        System.out.print("[");
        Iterateur it = s1.iterateur();
        while(it.aProchain()){
            System.out.print(it.prochain() + " ");
        }
        System.out.println("]");
    }
}
