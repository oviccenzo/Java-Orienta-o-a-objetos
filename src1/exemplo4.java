package src1;

import java.util.Locale;
import java.util.Scanner;

public class exemplo4 {

    public static void main(String[] args) {

        //munda o padrão do teclado brasileiro para o americano
        Locale.setDefault(Locale.US);

        try (//declara e inicializa o objeto scanner responsavel por receber a entrada de dados
        Scanner sc = new Scanner(System.in)) {
            String nome;
            int valor;
            double salario;

            System.out.print("Digite um nome: ");
            nome = sc.next();
            System.out.print("Digite um numero inteiro: ");
            valor = sc.nextInt();
            System.out.println("Digite um valor quebrado: ");
            salario = sc.nextDouble();

            System.out.println("nome = " + nome);
            System.out.println("valor = " + valor);
            System.out.println("salario = " + salario);
        }

    }
}
