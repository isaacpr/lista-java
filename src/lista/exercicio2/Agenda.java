package lista.exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Agenda {
    private final List<Pessoa> pessoas = new ArrayList<>();
    private static final int TAMANHO_AGENDA = 10;

    public void armazenaPessoa(String nome, int idade, float altura) {
        if (pessoas.size() < TAMANHO_AGENDA) {
            if (buscaPessoa(nome) != -1) {
                System.out.println("Contato já existente!");
            } else {
                pessoas.add(new Pessoa(nome, idade, altura));
            }
        } else {
            System.out.println("Agenda Cheia!");
        }
    }

    public void removePessoa(String nome) {
        if (pessoas.size() != 0) {
            if (buscaPessoa(nome) != -1) {
                pessoas.remove(buscaPessoa(nome));
            } else {
                System.out.println("Contato não existente!");
            }
        } else {
            System.out.println("Agenda Vazia!");
        }
    }

    public int buscaPessoa(String nome) {
        Optional<Pessoa> pessoaBuscada = pessoas.stream()
                .filter(p -> p.getNome().equals(nome))
                .findFirst();
        return pessoaBuscada.map(pessoas::indexOf).orElse(-1);
    }

    public void imprimeAgenda() {
        if (pessoas.size() == 0) {
            System.out.println("Agenda vazia!");
        } else {
            System.out.println("——————————————————————————————————————————————————");
            pessoas.forEach(pessoa -> System.out.println("Nome: " + pessoa.getNome()
                    + " idade: " + pessoa.getIdade() + " altura: " + pessoa.getAltura()));
            System.out.println("——————————————————————————————————————————————————");
        }
    }

    public void imprimePessoa(int index) {
        if (pessoas.get(index) != null) {
            System.out.println("Nome: " + pessoas.get(index).getNome());
            System.out.println("Idade: " + pessoas.get(index).getIdade());
            System.out.println("Altura: " + pessoas.get(index).getAltura());
        } else {
            System.out.println("Contato não registrado na lista!");
        }
    }
}
