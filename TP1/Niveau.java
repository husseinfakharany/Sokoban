//import java.util.;

class Niveau{
    /* Une case contiet un entier pour coder MUR, POUSSEUR, BUT, POUSSEUR_SUR_BUT, ... 
    On choisit de prendre un bit différent de notre entier pour coder la presence de chaque objet
    */
    final int MUR = 1; //final = constante
    final int POUSSEUR = 2;
    final int BUT = 4;
    final int CAISSE = 8;

    String nom;
    int nb_l, nb_c;
    int [][] contenu;

    Niveau(){
        contenu = new int[100][100];
        nb_l = 0;
        nb_c = 0;
    }

    void redimensionne(int i, int j){
        if(nb_l <= i)
            nb_l=i+1;
        if (nb_c <= j)
            nb_c=j+1;

    }
    void fixeNom(String s){
        nom = s; 
    }
    void videCase(int i, int j){
        contenu[i][j] = 0;
    }
    void ajoute(int element, int i, int j){
        redimensionne(i, j);
        contenu[i][j] |= element;
    }
    void ajouteMur(int i, int j){
        //System.out.println("Ajout mur");
        ajoute(MUR,i,j);
    }
    void ajoutePousseur(int i, int j){
        //System.out.println("Ajout pousseur");
        ajoute(POUSSEUR,i,j);
    }
    void ajouteCaisse(int i, int j){
        //System.out.println("Ajout caisse");
        ajoute(CAISSE,i,j);
    }
    void ajouteBut(int i, int j){
        //System.out.println("Ajout but");
        ajoute(BUT,i,j);
    }
    int lignes(){
        return nb_l;
    }
    int colonnes(){
        return nb_c;
    }
    String nom(){
        return nom;
    }
    boolean estVide(int i, int j){
        return (contenu[i][j]==0);
    }
    boolean aMur(int i, int j){
        return ((contenu[i][j] & MUR) == MUR);
    }
    boolean aBut(int i, int j){
        return ((contenu[i][j] & BUT) == BUT);
    }
    boolean aPousseur(int i, int j){
        return ((contenu[i][j] & POUSSEUR) == POUSSEUR);
    }
    boolean aCaisse(int i, int j){
        return ((contenu[i][j] & CAISSE) == CAISSE); 
    }
}