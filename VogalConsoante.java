package lista04;

import java.util.Scanner;

public class VogalConsoante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        char letra = sc.next().toLowerCase().charAt(0);

        if (Character.isLetter(letra)) {
            if ("aeiou".indexOf(letra) != -1) {
                System.out.println("Vogal.");
            } else {
                System.out.println("Consoante.");
            }
        } else {
            System.out.println("Não é uma letra.");
        }

        sc.close();
    }
}
