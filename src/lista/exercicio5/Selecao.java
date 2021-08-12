package lista.exercicio5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Selecao extends Controle {
    public void armazenaCaminhao(List<Caminhao> caminhoes) {
        String tipo;
        int totalPluviometros;

        label:
        while (true) {
            do {
                System.out.println("Digite o tipo do caminhão 'Alfa' ou 'Beta' ou 'Fim' para encerrar a lista");
                tipo = leString();
                if (tipo.equals("Fim")) {
                    break label;
                } else if (!tipo.equals("Alfa") && !tipo.equals("Beta")) {
                    System.out.println("Digite uma opção válida!");
                }
            } while (!tipo.equals("Alfa") && !tipo.equals("Beta"));

            do {
                System.out.println("Digite o número de pluviômetros a ser transportado pelo caminhão: ");
                totalPluviometros = leInteiro();
                if (totalPluviometros <= 0) {
                    System.out.println("Digite um número inteiro maior que zero!");
                }
            } while (totalPluviometros <= 0);

            System.out.println("Digite o tipo do pluviômetro:");
            List<String> pluviometros = new ArrayList<>();
            for (int i = 0; i < totalPluviometros; i++) {
                System.out.println((i + 1) + "º Tipo: ");
                pluviometros.add(leString());
            }
            caminhoes.add(new Caminhao(tipo, totalPluviometros, pluviometros));
        }
    }

    public void imprimeLista(List<Caminhao> caminhoes) {
        caminhoes.forEach((caminhao -> {
            System.out.println("——————————————————————————————————————————————————");
            System.out.println("Tipo do caminhão: " + caminhao.getTipo());
            System.out.println("Número de pluviômetros: " + caminhao.getTotalPluviometros());
            System.out.println("Lista de pluviômetros: " + caminhao.getPluviometros());
            System.out.println("——————————————————————————————————————————————————");
        }));
    }

    public Caminhao selecionaCaminhaoMaisApto(List<Caminhao> caminhoes) {
        caminhoes.sort((Comparator.comparing(Caminhao::getTotalPluviometros)).reversed());
        return caminhoes.get(0);
    }
}

