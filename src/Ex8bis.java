import java.util.Scanner;

public class Ex8bis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month in letter: ");
        String month = input.next();

        switch (month) {
            case "January":
                System.out.println("Ce mois comporte 31 jours");
                break;
            case "February":
                System.out.println("Ce mois comporte 28 jours");
                break;
            case "March":
                System.out.println("Ce mois comporte 31 jours");
                break;
            case "April":
                System.out.println("Ce mois comporte 30 jours");
                break;
            case "May":
                System.out.println("Ce mois comporte 31 jours");
                break;
            case "June":
                System.out.println("Ce mois comporte 30 jours");
                break;
            case "July":
                System.out.println("Ce mois comporte 31 jours");
                break;
            case "August":
                System.out.println("Ce mois comporte 31 jours");
                break;
            case "September":
                System.out.println("Ce mois comporte 30 jours");
                break;
            case "October":
                System.out.println("Ce mois comporte 31 jours");
                break;
            case "November":
                System.out.println("Ce mois comporte 30 jours");
                break;
            case "December":
                System.out.println("Ce mois comporte 31 jours");
                break;
        }
    }
}