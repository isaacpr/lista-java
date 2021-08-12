package lista.exercicio2;

public class AgendaPrincipal {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.removePessoa("José");
        agenda.armazenaPessoa("Maria", 18, 1.70F);
        agenda.removePessoa("João");
        int verificador = agenda.buscaPessoa("Maria");
        if (verificador != -1) {
            System.out.println("A pessoa está na posicão " + agenda.buscaPessoa("Maria") + " da agenda");
        } else {
            System.out.println("Esta pessoa não se encontra na agenda!");
        }
        verificador = agenda.buscaPessoa("João");
        if (verificador != -1) {
            System.out.println("A pessoa está na posicão " + agenda.buscaPessoa("João") + " da agenda");
        } else {
            System.out.println("Esta pessoa não se encontra na agenda!");
        }
        agenda.imprimePessoa(1);
        agenda.imprimePessoa(0);
        agenda.imprimePessoa(11);
        agenda.armazenaPessoa("José", 25, 1.75F);
        agenda.armazenaPessoa("Ana", 40, 1.60F);
        agenda.removePessoa("Ana");
        agenda.removePessoa("Maria");
        agenda.armazenaPessoa("Carolina", 35, 1.55F);
        agenda.armazenaPessoa("Lucas", 34, 1.86F);
        agenda.removePessoa("José");
        agenda.armazenaPessoa("Mateus", 46,1.78F);
        agenda.imprimeAgenda();
    }
}
