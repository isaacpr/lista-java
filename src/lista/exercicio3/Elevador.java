package lista.exercicio3;

public class Elevador {
    private int andarAtual = 0;
    private int totalAndares = 0;
    private int capacidadeElevador = 0;
    private int quantidadePessoas = 0;
    public static int PESOPASSAGEIRO = 75;

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    void inicializa(int capacidadeElevador, int totalAndares) {
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;
    }

    void entra() {
        if ((this.quantidadePessoas * PESOPASSAGEIRO) < this.capacidadeElevador) {
            this.quantidadePessoas++;
        } else {
            System.out.println("Capacidade máxima do elevador!");
        }
    }

    void sai() {
        if (this.quantidadePessoas > 0) {
            this.quantidadePessoas--;
        } else {
            System.out.println("Elevador vazio!");
        }
    }

    void sobe() {
        if (this.andarAtual < this.totalAndares) {
            this.andarAtual++;
        } else {
            System.out.println("O elevador está no último andar, não é possível subir mais!");
        }
    }

    void desce() {
        if (this.andarAtual > 0) {
            this.andarAtual--;
        } else {
            System.out.println("O elevador está no térreo, não é possível descer mais!");
        }
    }
}
