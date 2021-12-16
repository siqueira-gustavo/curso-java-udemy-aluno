package entities;

public class Aluno {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
  
    public double calcularNotaFinal() {
        return (nota1 + nota2 + nota3);
    }

    // passou ou não passou
    public String verificaAprovacao() {
        return (calcularNotaFinal() >= 60) ? "Aprovado" : "Reprovado\nFaltaram "
        + String.format("%.2f", (60 - calcularNotaFinal()))
        + " pontos para aprovação";
    }
}
