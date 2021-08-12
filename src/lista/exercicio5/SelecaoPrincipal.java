package lista.exercicio5;

import java.util.ArrayList;
import java.util.List;

public class SelecaoPrincipal {
    public static void main(String[] args) {
        Selecao selecao = new Selecao();
        List<Caminhao> caminhoes = new ArrayList<>();
        selecao.armazenaCaminhao(caminhoes);
        selecao.imprimeLista(caminhoes);
        System.out.println("Caminhão mais apto:" + selecao.selecionaCaminhaoMaisApto(caminhoes));
    }
}
