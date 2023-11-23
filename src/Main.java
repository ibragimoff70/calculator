import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinchi raqamni kirit: ");
        double son1 = scanner.nextDouble();

        System.out.print("Ikinchi raqamni kirit: ");
        double son2 = scanner.nextDouble();


        System.out.print("Amallarni tanlang (+, -, *, /): ");
        char bi = scanner.next().charAt(0);

        double resultat = 0;
        switch (bi) {
            case '+':
                resultat = son1 + son2;
                break;
            case '-':
                resultat = son1 - son2;
                break;
            case '*':
                resultat = son1 * son2;
                break;
            case '/':
                if (son2 != 0) {
                    resultat = son1 / son2;
                } else {
                    System.out.println("Error: ");
                    return;
                }
                break;
            default:
                System.out.println("Error: ");
                return;
        }


        System.out.println("Teng-> " + resultat);
    }
}


