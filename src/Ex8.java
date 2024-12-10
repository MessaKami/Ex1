import java.util.Scanner;
import java.util.*;
public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month in numbers: ");
        int month = sc.nextInt();

        if (month == 2 ) {
            System.out.println("Ce mois possède 28 jours");
    } else if (month < 7 && month % 2 == 0  || month % 2 == 1 && month > 8) {
            System.out.println("Ce mois possède 30 jours");
        } else {
            System.out.println("Ce mois possède 31 jours");
        }
        Ex8ter.isBissextile(1900);
    }
}