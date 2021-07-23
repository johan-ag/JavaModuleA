package practicaGrupal;

import java.util.Scanner;

public class Ejercicio4 {
    private static boolean esPrimo(int number) {

        boolean esPrimo = true;
        int i = 2;
        while(i < number) {
            if (number%i == 0) {
                esPrimo = false;
                break;
            }
            i++;
        }

        return esPrimo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int n = scanner.nextInt();

        int primoCount = 0;
        int i = 2;
        while(i > -1) {
            if(primoCount == n) break;
            if(esPrimo(i)) {
                System.out.println(i);
                primoCount++;
            }
            i++;
        }

        scanner.close();
    }
}
