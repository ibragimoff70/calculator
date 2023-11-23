package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Bitta son kiriting: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("Bitta son kiriting: ");
        int b = scanner.nextInt();
        System.out.println("Nmani tanlisz?\n1.'+'\n2.'-'\n3.'*'\n4.':'");
        int c = scanner.nextInt();
        switch (c){
            case 1-> System.out.println(a+b);
            case 2->System.out.println(a-b);
            case 3->System.out.println(a*b);
            case 4->System.out.println(a/b);
            default ->{ System.out.println("Error");
               main(args);
            }
        }
        main(args);

    }
}