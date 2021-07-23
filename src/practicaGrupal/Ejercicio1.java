package practicaGrupal;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        int a = scanner.nextInt();

        int pairCount = 0;
        int i = 1;
        while(i <= pairCount || i > pairCount ){
            if (pairCount == a) break;
            if(i%2 == 0) {
                System.out.println(i);
                pairCount++;
            };
            i++;
        }
        scanner.close();
    }
}
