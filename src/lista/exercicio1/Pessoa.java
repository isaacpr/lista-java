package lista.exercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private double altura;

    public Pessoa(String nome, String dataNascimento, double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void imprimeDados() {
        System.out.println("——————————————————————————————————————————————————");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data de nascimento: " + this.getDataNascimento());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("——————————————————————————————————————————————————");
    }

    public void calculaIdade() {
        try {
            DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataInformada = LocalDate.parse(dataNascimento, dataFormatada);
            LocalDate dataAtual = LocalDate.now();
            System.out.println("Sua idade é " + Period.between(dataInformada, dataAtual).getYears() + " anos.");
        } catch (DateTimeParseException e) {
            System.out.println("Erro! Não foi possível calcular sua idade!");
        }
    }
}
