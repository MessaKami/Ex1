import java.util.Scanner;

public class Ex8ter {
    public static void main(String[] args) {
        System.out.println(isBissextile(2024));
    }
    public static String isBissextile(int years) {

        if (years % 400 == 0) {
            return "C'est une année bissextile !";
        } else if (years % 100 == 0) {
            return "Ce n'est pas une année bissextile !";
        } else if (years % 4 == 0) {
            return "C'est une année bissextile !";
        } else {
            return "Ce n'est pas une année bissextile !";
        }
    }
}