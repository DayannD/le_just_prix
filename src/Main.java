import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float prix = 0;
        JustPrix game = new JustPrix();
        Boolean again = true;

        game.affiche();
        while (again){
            try{
                System.out.println("Rentrer votre just prix :");
                prix = scanner.nextFloat();
                if (prix < 0){
                    System.out.println("La donnée saisie est érronée, reessayer");
                    continue;
                }
            }catch (InputMismatchException ime){
                System.out.println("La donnée saisie est érronée, reessayer");

            }
            System.out.println(game.comparatif(prix));
        }
    }
}
