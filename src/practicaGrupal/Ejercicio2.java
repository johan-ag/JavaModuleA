package practicaGrupal;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe un numero n: "); //numero de multiplos
        int n = scanner.nextInt();
        System.out.print("Escribe un numero m: "); //multiplos de este numero
        int m = scanner.nextInt();

        int nCount = 0;
        int i = 1;
        while (i > -1) {
            if(nCount == n) break;
            if(i%m == 0) {
                System.out.println(i);
                nCount++;
            }
            i++;
        }
    }
}
