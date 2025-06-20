import java.util.Scanner;
import java.util.Locale;

public class AumentoSalarial{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario da pessoa: ");
        double salarioAtual = sc.nextDouble();

        double aumentoPorcentual = 0;

        if(salarioAtual < 1000.00){
            aumentoPorcentual = 0.20;
        } else if(salarioAtual >= 1000.00 && salarioAtual <= 3000.00){
            aumentoPorcentual = 0.15;
        } else if(salarioAtual >= 3000.00 && salarioAtual <= 8000.00){
            aumentoPorcentual = 0.10;
        } else if(salarioAtual >= 8000.00){
            aumentoPorcentual = 0.5;
        }
        double valorAumento = salarioAtual * aumentoPorcentual;
        double novoSalario = salarioAtual + valorAumento;

        System.out.printf("O novo salario: %.2f%n",novoSalario);
        System.out.printf("Aumento: %.2f%n",valorAumento);
        System.out.printf("Porcentagem: %.0f%%%n ",aumentoPorcentual * 100);
    }
}
