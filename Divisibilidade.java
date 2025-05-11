package lista04;

import java.util.Scanner;

public class Divisibilidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("Divisível por 3 e 5.");
        } else {
            System.out.println("Não é divisível por 3 e 5.");
        }
        sc.close();
    }
}

