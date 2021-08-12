package lista.exercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controle {
    public static String leString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int leInteiro() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Não foi digitado um número inteiro!");
            return -1;
        }
    }
}
