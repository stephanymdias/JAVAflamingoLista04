package lista04;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Maior número: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Maior número: " + b);
        } else {
            System.out.println("Maior número: " + c);
        }

        sc.close();
    }
}

