//import java.util.;

class Niveau{
    String nom;
    int nb_l, nb_c;
    String [][] tableau;

    void fixeNom(String s){
        nom = s; 
    }
    void videCase(int i, int j){
        
    }
    void ajouteMur(int i, int j){
    }
    void ajoutePousseur(int i, int j){
    }
    void ajouteCaisse(int i, int j){
    }
    void ajouteBut(int i, int j){
    }
    int lignes(){
        return 1;
    }
    int colonnes(){
        return 1;
    }
    String nom(){
        return "abc";
    }
    boolean estVide(int l, int c){
        return true;
    }
    boolean aMur(int l, int c){
        return true;
    }
    boolean aBut(int l, int c){
        return true; 
    }
    boolean aPousseur(int l, int c){
        return true;
    }
    boolean aCaisse(int l, int c){
        return true; 
    }
}