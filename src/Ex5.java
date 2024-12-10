import java.util.Scanner;
import java.util.*;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entez votre age !: ");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("Vous êtes mineur !");
        } else {
            System.out.println("Vous êtes bien majeur !");
        }
    }
}