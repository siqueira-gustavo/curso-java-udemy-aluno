import java.util.Locale;
import java.util.Scanner;

import entities.*;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Aluno: ");
        aluno.nome = sc.nextLine();
        System.out.print("Nota 1: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        aluno.nota3 = sc.nextDouble();

        System.out.printf("\nMédia Final: %.2f\n", aluno.calcularNotaFinal());
        System.out.println(aluno.verificaAprovacao());

        sc.close();

    }
}
