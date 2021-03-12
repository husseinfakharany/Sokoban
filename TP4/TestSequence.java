package TP4;

import java.util.Scanner;

public class TestSequence{
    public static void main(String [] args){
        Sequence<Integer> s1 = new SequenceTableau();
        Sequence<Integer> s2 = new SequenceListe<>();

        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        s.close();
        Iterateur<Integer> it;
        switch (input){
            case 1:
                s1.insereTete(3);
                s1.insereTete(2);
                s1.insereTete(4);
                s1.insereTete(5);
                s1.insereTete(0);
                s1.insereTete(6);
                s1.insereTete(3);
                System.out.println();
                System.out.println(s1.extraitTete());
                System.out.println(s1.toString());
                System.out.println(s1.estVide());

                System.out.println("Affichage aver Itérateur: ");
                System.out.print("[");
                it = s1.iterateur();
                while (it.aProchain()) {
                    int n = it.prochain();
                    System.out.print(n+" ");
                    if (n == 0)
                        it.supprime();
                }
                System.out.println("]");
                break;
            case 2:
                s2.insereTete(3);
                s2.insereTete(2);
                s2.insereTete(4);
                s2.insereTete(5);
                s2.insereTete(0);
                s2.insereTete(6);
                s2.insereTete(3);
                System.out.println();
                System.out.println(s2.extraitTete());
                System.out.println(s2.toString());
                System.out.println(s2.estVide());

                System.out.println("Affichage aver Itérateur: ");
                System.out.print("[");
                it = s2.iterateur();
                while (it.aProchain()) {
                    int n = it.prochain();
                    System.out.print(n+" ");
                    if (n == 0) //deletes after 0
                        it.supprime();
                }
                System.out.println("]");
                break;
        }
        
    }
}
