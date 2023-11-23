import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.print("1-son kiriting:");
            int a1=scanner.nextInt();

            System.out.print("2-son kiriting:");
            int a2=scanner.nextInt();

            System.out.print("amalni kiriting:");
            String s=scanner.next();

            if(s.equals("+")){
                System.out.println(a1+"+"+a2+"="+(a1+a2));
            } else if (s.equals("-")) {
                System.out.println(a1+"-"+a2+"="+(a1-a2));
            } else if (s.equals("*")) {
                System.out.println(a1+"*"+a2+"="+(a1*a2));
            } else if (s.equals("/")) {
                System.out.println(a1+"/"+a2+"="+(a1/a2));
            }else {
                System.out.println("hato son kiritildi");
            }
        }

    }
}
