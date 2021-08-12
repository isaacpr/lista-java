package lista.exercicio3;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int quantidadePessoas;
    public static final int PESO_PASSAGEIRO = 75;

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    void inicializa(int capacidadeElevador, int totalAndares) {
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;
    }

    void entra() {
        if ((quantidadePessoas * PESO_PASSAGEIRO) < capacidadeElevador) {
            quantidadePessoas++;
        } else {
            System.out.println("Capacidade máxima do elevador!");
        }
    }

    void sai() {
        if (quantidadePessoas > 0) {
            quantidadePessoas--;
        } else {
            System.out.println("Elevador vazio!");
        }
    }

    void sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        } else {
            System.out.println("O elevador está no último andar, não é possível subir mais!");
        }
    }

    void desce() {
        if (andarAtual > 0) {
            andarAtual--;
        } else {
            System.out.println("O elevador está no térreo, não é possível descer mais!");
        }
    }
}