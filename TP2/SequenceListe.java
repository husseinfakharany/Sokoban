class Maillon{
    int element; 
    Maillon suivant; 
}

public class SequenceListe implements Sequence{
    Maillon tete, queue;
    public void insereTete(int element){
        Maillon nouveau_Maillon = new Maillon();
        nouveau_Maillon.element = element; 
        nouveau_Maillon.suivant = tete;  
        if (tete == null){
            tete = nouveau_Maillon; 
            queue = nouveau_Maillon;
        } else {
            tete = nouveau_Maillon;
        }
    }
    
    public void insereQueue(int element){
        Maillon nouveau_Maillon = new Maillon();
        nouveau_Maillon.element = element; 
        nouveau_Maillon.suivant = null;
        if (tete == null){
            tete = nouveau_Maillon;
            queue = nouveau_Maillon; 
        } else {
            queue.suivant = nouveau_Maillon;
            queue = nouveau_Maillon;
        }
    }

    public int extraitTete(){
        if (tete == null)
            throw new RuntimeException("Sequence vide!");
        int res = tete.element; 
        tete = tete.suivant;
        return res;
    }

    public boolean estVide(){
        return tete == null;
    }

    public String toString(){
        String my_string = "[";
        Maillon courant = tete;
        while (courant != null){
            my_string += courant.element;
            courant = courant.suivant;
            if (courant != null){
                my_string += ",";
            }
        }
        return my_string + "]";
    }
}
