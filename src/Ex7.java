import java.util.Scanner;
import java.util.*;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entez votre année pour savoir si elle est bissextile: ");
        int annee = sc.nextInt();

        if (annee %  400 == 0) {
            System.out.println("Ce n'est pas une année bissextile");
        }
        else if (annee %  100 == 0) {
            System.out.println("Ce n'est pas une année bissextile !");
        }
        else if (annee %  4 == 0) {
            System.out.println("C'est une année bissextile !");
        }
        else {
            System.out.println("Rien");
        }
    }
}