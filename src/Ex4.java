import java.util.* ;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Entrez le rayon: ");
        double result = r.nextDouble();
        double rayon = Math.PI * (2 * result);
        System.out.println("Le rayon du cercle est de :" + rayon);
    }
}