package lista.exercicio5;

import java.util.List;

public class Caminhao {
    private String tipo;
    private int totalPluviometros;
    private List<String> pluviometros;

    public Caminhao(String tipo, int totalPluviometros, List<String> pluviometros) {
        this.tipo = tipo;
        this.totalPluviometros = totalPluviometros;
        this.pluviometros = pluviometros;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTotalPluviometros() {
        return totalPluviometros;
    }

    public List<String> getPluviometros() {
        return pluviometros;
    }

    @Override
    public String toString() {
        return (" { "
                + "Tipo: " + tipo
                + " Lista de Pluviometros: " + pluviometros
                + " }"
        );
    }
}
