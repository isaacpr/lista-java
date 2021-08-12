package lista.exercicio1;

public class PessoaPrincipal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Isaac Veras", "11/03/1998", 1.67);

        pessoa.imprimeDados();
        pessoa.calculaIdade();
    }
}
