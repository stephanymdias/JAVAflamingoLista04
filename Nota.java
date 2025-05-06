package lista04;
import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua nota (0 a 100): ");
        int nota = sc.nextInt();

        if (nota >= 60) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado.");
        }
        sc.close();
    }
}

