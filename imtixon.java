import java.util.Scanner;

public class imtixon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Birinchi son: ");
            int a = scanner.nextInt();
            System.out.print("Ikkinchi son: ");
            int b = scanner.nextInt();
            System.out.print("(+, -, *, /): ");
            String operation = scanner.next();

            switch (operation) {
                case "+" -> {
                    int sum = a + b;
                    System.out.println(sum);
                }
                case "-" -> {
                    int sum = a - b;
                    System.out.println(sum);
                }
                case "*" -> {
                    int sum = a * b;
                    System.out.println(sum);
                }
                case "/" -> {
                    int sum = a / b;
                    System.out.println(sum);
                }
            }
        }
    }
}