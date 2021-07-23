package demo;

import java.util.Scanner;

public class DemoFunciones {
    private static boolean esPar(int n) {

        boolean ok = false;
        if(n%2 == 0) {
            ok = true;
        };

        return  ok;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un valor: ");
        int a = scanner.nextInt();

        if (esPar(a)){
            System.out.println(a + " es par");
        } else {
            System.out.println(a + " no es par");
        };

        scanner.close();
    }
}
