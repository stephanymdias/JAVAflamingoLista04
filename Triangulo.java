package lista04;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lado A: ");
        int a = sc.nextInt();
        System.out.print("Lado B: ");
        int b = sc.nextInt();
        System.out.print("Lado C: ");
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Forma um triângulo válido.");
        } else {
            System.out.println("Não forma um triângulo.");
        }
        sc.close();
    }
}

