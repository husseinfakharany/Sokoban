import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Essai_Scanner{
    public static void main(String [] args){
        //Scanner my_scanner;
        int num;
        boolean bError = true; 

        //my_scanner = new Scanner(System.in);
        while(bError){
            System.out.println("Saisissez un entier: ");
            Scanner my_scanner = new Scanner(System.in);
            try{
                num = my_scanner.nextInt();
                bError = false;
                System.out.println("Vous avez saisi l'entier: " + num);
            }
            catch(InputMismatchException e){
                System.out.println("Aucun entier saisie");
                my_scanner.next();
                continue;
            }
            catch(NoSuchElementException e){
                System.out.println("Aucune ligne saisie");
                continue;
            }
            if(my_scanner!=null)
                my_scanner.close();
        }
    }
}