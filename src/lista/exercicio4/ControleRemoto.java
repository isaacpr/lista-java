package lista.exercicio4;

public class ControleRemoto {
    public void aumentaCanal(Televisao televisao) {
        if (televisao.getCanal() == 99) {
            televisao.setCanal(0);
        } else {
            televisao.setCanal(televisao.getCanal() + 1);
        }
        System.out.println("Canal da Televisão aumenta para " + televisao.getCanal());
    }

    public void diminuiCanal(Televisao televisao) {
        if (televisao.getCanal() == 0) {
            televisao.setCanal(99);
        } else {
            televisao.setCanal(televisao.getCanal() - 1);
        }
        System.out.println("Canal da Televisão diminuiu para " + televisao.getCanal());
    }

    public void aumentaVolume(Televisao televisao) {
        if (televisao.getVolume() < 10) {
            televisao.setVolume(televisao.getVolume() + 1);
            System.out.println("Volume da Televisão aumentou para " + televisao.getVolume());
        } else {
            System.out.println("O Volume da Televisão está no máximo!");
        }
    }

    public void diminuiVolume(Televisao televisao) {
        if (televisao.getVolume() > 0) {
            televisao.setVolume(televisao.getVolume() - 1);
            System.out.println("Volume da Televisão diminuiu para " + televisao.getVolume());
        } else {
            System.out.println("O Volume da Televisão está no mínimo!");
        }
    }

    public void trocaCanal(Televisao televisao, int canal) {
        televisao.setCanal(canal);
    }

    public void consultaInformacao(Televisao televisao) {
        System.out.println("Canal: " + televisao.getCanal() + " volume: " + televisao.getVolume());
    }
}