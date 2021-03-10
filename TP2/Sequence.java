public interface Sequence {
    void insereTete(int element);
//insère l'élément element en début de séquence (en première position)
    void insereQueue(int element);
//insère l'élément element en fin de séquence (en dernière position)
    int extraitTete();
//extrait et renvoie la valeur de l'élément situé en début de séquence (en première position)
    boolean estVide();
//renvoie vrai si et seulement si la séquence est vide
}
