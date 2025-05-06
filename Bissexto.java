package lista04;

import java.util.Scanner;

public class Bissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("Ano bissexto.");
        } else {
            System.out.println("Não é um ano bissexto.");
        }
        sc.close();
    }
}

