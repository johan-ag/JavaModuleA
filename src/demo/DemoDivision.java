package demo;

import java.util.Scanner;

public class DemoDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un valor ...");
        int a = scanner.nextInt();

        System.out.println("Ingresa otro valor ...");
        int b = scanner.nextInt();

        double c = a/(double)b;
        System.out.println(a + "/" + b + " = " +c );

        scanner.close();
    }
}
