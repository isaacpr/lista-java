package lista.exercicio2;

public class Agenda {
    private String[] nome = new String[10];
    private int[] idade = new int[10];
    private float[] altura = new float[10];
    private int contador = 0;

    void armazenaPessoa(String nome, int idade, float altura) {
        if (contador < 10) {
            this.nome[contador] = nome;
            this.idade[contador] = idade;
            this.altura[contador] = altura;
            contador++;
            System.out.println("Contato adicionado na agenda!");
        } else {
            System.out.println("Agenda cheia! Inserção inválida!");
        }
    }

    void removePessoa(String nome) {
        int busca = buscaPessoa(nome);
        if (contador > 0 && busca != -1) {
            for (int i = busca; i < contador; i++) {
                this.nome[i] = this.nome[i + 1];
                this.idade[i] = this.idade[i + 1];
                this.altura[i] = this.altura[i + 1];
            }
            contador--;
            System.out.println("Contato removido do agenda!");
        } else if (busca == -1) {
            System.out.println("Essa pessoa não se encontra na agenda! Remoção inválida!");
        } else {
            System.out.println("Agenda vazia! Remoção inválida!");
        }
    }

    int buscaPessoa(String nome) {
        int auxiliar = -1;
        for (int i = 0; i < contador; i++) {
            if (this.nome[i].equals(nome)) {
                auxiliar = i;
                break;
            }
        }
        return auxiliar;
    }

    void imprimeAgenda() {
        System.out.println("——————————————————————————————————————————————————");
        System.out.println("Agenda completa:");
        for (int i = 0; i < contador; i++) {
            if (this.nome[i] != null) {
                imprimePessoa(i);
            }
        }
        System.out.println("——————————————————————————————————————————————————");
    }

    void imprimePessoa(int index) {
        boolean verificador = false;
        for (int i = 0; i < contador; i++) {
            if (i == index && this.nome[i] != null) {
                verificador = true;
                System.out.println("Nome: " + this.nome[i] + " idade: " + this.idade[i] + " altura: " + this.altura[i]);
                break;
            }
        }
        if (!verificador) {
            System.out.println("Esta pessoa não se encontra na agenda!");
        }
    }
}
