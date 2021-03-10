import java.util.Scanner;
import java.io.InputStream;

class Sokoban{
    public static void main(String [] args){
        LecteurNiveau l = new LecteurNiveau(System.in);
        RedacteurNiveau r = new RedacteurNiveau(System.out);
        for (Niveau n = l.lisProchainNiveau(); n != null; n = l.lisProchainNiveau()){
            r.ecrisNiveau(n);
            }
    }
}