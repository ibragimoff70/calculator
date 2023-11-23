import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Birinchi sonni kiriting: ");
            int a = scanner.nextInt();
            System.out.print("Ikkinchi sonni kiriting: ");
            int b = scanner.nextInt();
            System.out.print("Operationni tanlang(+, -, *, /): ");
            String operation = scanner.next();

            switch (operation) {
                case "+" -> {
                    int sum = a + b;
                    System.out.println("Summa: " + sum);
                }

                case "-" -> {
                    int sum = a - b;
                    System.out.println("Summa: " + sum);
                }

                case "*" -> {
                    int sum = a * b;
                    System.out.println("Summa: " + sum);
                }

                case "/" -> {
                    int sum = a / b;
                    System.out.println("Summa: " + sum);
                }
            }
        }
    }
}