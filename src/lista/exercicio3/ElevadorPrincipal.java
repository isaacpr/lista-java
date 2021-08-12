package lista.exercicio3;

public class ElevadorPrincipal {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();

        elevador.inicializa(350, 5);
        elevador.sai();
        elevador.entra();
        System.out.println("Quantidade de pessoas: " + elevador.getQuantidadePessoas());
        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();
        System.out.println("Quantidade de pessoas: " + elevador.getQuantidadePessoas());
        elevador.desce();
        elevador.sobe();
        elevador.desce();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        System.out.println("Andar atual: " + elevador.getAndarAtual());
    }
}
