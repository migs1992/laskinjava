import java.util.Scanner;

public class Laskin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yksinkertainen Laskin");
        System.out.print("Syötä ensimmäinen luku: ");
        double luku1 = scanner.nextDouble();

        System.out.print("Syötä toinen luku: ");
        double luku2 = scanner.nextDouble();

        System.out.println("Valitse operaatio (+, -, *, /): ");
        char operaatio = scanner.next().charAt(0);

        double tulos = 0;

        switch (operaatio) {
            case '+':
                tulos = luku1 + luku2;
                break;
            case '-':
                tulos = luku1 - luku2;
                break;
            case '*':
                tulos = luku1 * luku2;
                break;
            // Virheidenkäsittelyä 
            case '/':
                if (luku2 != 0) {
                    tulos = luku1 / luku2;
                } else {
                    System.out.println("Virhe: Nollalla ei voi jakaa.");
                    return;
                }
                break;
            default:
                System.out.println("Virhe: Tuntematon operaatio.");
                return;
        }

        System.out.println("Tulos: " + tulos);

        scanner.close();
    }
}
