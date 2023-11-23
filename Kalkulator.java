import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.printf("Birinchi sonni kiriting");
        int son =in.nextInt();
        System.out.println("Ikkinchi sonni kiriting");
        int son1 =in.nextInt();
        System.out.println("Qoshilgani jovobi "+son+son1);

        System.out.println("Kopaytirilgan  jovobi "+son*son1);
        System.out.println("Bolingan jovobi "+son/son1);
    }
}
