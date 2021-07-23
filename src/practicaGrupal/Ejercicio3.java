package practicaGrupal;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int n = scanner.nextInt();
        boolean esPrimo = true;
        int i = 2;
        while(i < n) {

            if (n%i == 0) {
                esPrimo = false;
                break;
            }
            i++;
        }

        if (esPrimo) {
            System.out.println(n + " es primo.");
        } else {
            System.out.println(n + " no es primo.");
        }
        scanner.close();
    }
}
