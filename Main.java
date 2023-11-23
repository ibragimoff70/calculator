import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Birinchi sonni kiriting :");
        int a = in.nextInt();
        System.out.println("Ikkinchi sonni kiriting : ");
        int b = in.nextInt();
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        int res = in.nextInt();
        switch (res){
            case 1:
                System.out.println("Javobi : ");
                System.out.println(a+b);
                break;
            case 2:
                System.out.println("Javobi : ");
                System.out.println(a-b);
                break;
            case 3:
                System.out.println("Javobi : ");
                System.out.println(a*b);
                break;
            case 4:
                System.out.println("Javobi : ");
                System.out.println(a/b);
                break;
            default:
                System.out.println("Xato raqam kiritingiz!!!");
                break;
        }
    }
}
