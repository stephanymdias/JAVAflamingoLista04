package lista04;

import java.util.Scanner;

public class INtervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        if (numero >= 10 && numero <= 20) {
            System.out.println("Está no intervalo de 10 a 20.");
        } else {
            System.out.println("Fora do intervalo.");
        }
        sc.close();
    }
}

