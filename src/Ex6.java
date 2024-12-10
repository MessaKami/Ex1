import java.util.Scanner;
import java.util.*;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une valeur : ");
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("Le nombre est pair !");
        } else {
            System.out.println("Le nombre est impair !");
        }
    }
}