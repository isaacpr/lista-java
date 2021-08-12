package lista.exercicio1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PessoaPrincipal {
    public static void main(String[] args) {
        Pessoa isaac = new Pessoa("Isaac Veras", "11/03/1998", new BigDecimal("1.67").setScale(2, RoundingMode.HALF_UP));
        isaac.imprimeDados();

        Pessoa fulano = new Pessoa("Fulano Silva", "25/12/1980", new BigDecimal("1.80").setScale(2, RoundingMode.HALF_UP));
        fulano.imprimeDados();
        fulano.setNome("Ciclano");
        fulano.setAltura(new BigDecimal("1.91").setScale(2, RoundingMode.HALF_UP));
        fulano.setDataNascimento("11/03/1995");
        fulano.imprimeDados();
    }
}
