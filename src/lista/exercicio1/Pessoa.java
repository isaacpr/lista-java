package lista.exercicio1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private BigDecimal altura;

    public Pessoa(String nome, String dataNascimento, BigDecimal altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public void imprimeDados() {
        System.out.println("——————————————————————————————————————————————————");
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Altura: " + altura);
        System.out.println("Idade: " + calculaIdade() + " anos");
        System.out.println("——————————————————————————————————————————————————");
    }

    public int calculaIdade() {
        try {
            LocalDate dataAtual = LocalDate.now();
            return Period.between(formataData(), dataAtual).getYears();
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public LocalDate formataData() {
        DateTimeFormatter padraoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dataNascimento, padraoData);
    }
}
