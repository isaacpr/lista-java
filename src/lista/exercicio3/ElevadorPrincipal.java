package lista.exercicio3;

public class ElevadorPrincipal {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();

        System.out.println("Elevador 1");
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

        Elevador elevador2 = new Elevador();

        System.out.println("\nElevador 2");
        elevador2.inicializa(500, 20);
        System.out.println("Quantidade de pessoas: " + elevador2.getQuantidadePessoas());
        elevador2.entra();
        elevador2.entra();
        elevador2.sai();
        elevador2.entra();
        System.out.println("Quantidade de pessoas: " + elevador2.getQuantidadePessoas());
        elevador2.sobe();
        System.out.println("Andar atual: " + elevador2.getAndarAtual());
    }
}
