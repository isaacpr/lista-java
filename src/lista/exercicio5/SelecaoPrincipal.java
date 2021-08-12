package lista.exercicio5;

import java.util.ArrayList;
import java.util.List;

public class SelecaoPrincipal {
    public static void main(String[] args) {
        List<Caminhao> caminhoes = new ArrayList<>();
        Selecao.armazenaCaminhao(caminhoes);
        Selecao.imprimeLista(caminhoes);
        System.out.println("Caminhão mais apto:" + Selecao.selecionaCaminhaoMaisApto(caminhoes));
    }
}
