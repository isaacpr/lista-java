package lista.exercicio4;

public class TelevisaoPrincipal {
    public static void main(String[] args) {
        Televisao televisao = new Televisao();
        ControleRemoto controle = new ControleRemoto();

        controle.diminuiVolume(televisao);
        controle.aumentaCanal(televisao);
        controle.aumentaVolume(televisao);
        controle.aumentaVolume(televisao);
        controle.consultaInformacao(televisao);
        controle.diminuiCanal(televisao);
        controle.diminuiCanal(televisao);
        controle.diminuiVolume(televisao);
        controle.trocaCanal(televisao, 99);
        controle.consultaInformacao(televisao);
    }
}
