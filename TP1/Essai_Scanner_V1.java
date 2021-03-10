import java.util.NoSuchElementException;
import java.util.Scanner;

class Essai_Scanner_V1 {
    public static void main(String [] args) {

        String ligne;
        System.out.println("Saisissez une ligne");
        try(Scanner my_scanner = new Scanner(System.in)){
        ligne = my_scanner.nextLine();
        System.out.println("Vous avez saisi la ligne : " + ligne);
        } catch(NoSuchElementException e){
            System.out.println("Aucune ligne saisie");
        }
    }
}