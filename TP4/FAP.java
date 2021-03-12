package TP4;

public abstract class FAP<Type> {
    Sequence<Type> s; 
    abstract void insere(Type element);
    Type extrait(){
        return s.extraitTete();
    }
    boolean estVide(){
        return s.estVide();
    }
}
