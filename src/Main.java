import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bulardan birini tanlang");
        int res = scanner.nextInt();
        switch (res){
            case 1:
                kopaytirish();
                break;
            case 2:
                ayirish();
                break;
            case 3:
                qoshish();
                break;
            case 4:
                bolish();
                break;
            default:
                System.out.println("qayta urinib koring");


        }
    }

    private static void bolish() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sonni kiriting");
        int sc = scanner.nextInt();
        System.out.println("Ikkinchi sonni kiriting");
        int sc1 = scanner.nextInt();
        System.out.println(sc / sc1);
    }

    private static void qoshish() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sonni kiriting");
        int sc = scanner.nextInt();
        System.out.println("Ikkinchi sonni kiriting");
        int sc1 = scanner.nextInt();
        System.out.println(sc + sc1);
    }

    private static void ayirish() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sonni kiriting");
        int sc = scanner.nextInt();
        System.out.println("Ikkinchi sonni kiriting");
        int sc1 = scanner.nextInt();
        System.out.println(sc - sc1);

    }

    private static void kopaytirish() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sonni kiriting");
        int sc = scanner.nextInt();
        System.out.println("Ikkinchi sonni kiriting");
        int sc1 = scanner.nextInt();
        System.out.println(sc * sc1);
    }
}