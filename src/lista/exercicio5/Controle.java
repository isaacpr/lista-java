package lista.exercicio5;

import java.io.*;

public class Controle {
    public static String leString() {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            return entrada.readLine();
        } catch (IOException e) {
            System.out.println("Erro na entrada!");
            return "";
        }
    }

    public static int leInteiro() {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            String texto = entrada.readLine();
            return Integer.parseInt(texto);
        } catch (IOException e) {
            System.out.println("Erro na entrada!");
            return -1;
        } catch (NumberFormatException e) {
            System.out.println("Tipo incompativel com int!");
            return -2;
        }
    }
}
