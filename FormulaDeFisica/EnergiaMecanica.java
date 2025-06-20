package FormulaDeFisica;
import java.util.Scanner;
public class EnergiaMecanica {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double EnergiaMecanica,M,V;

        System.out.print("Calcular a massa(M):  ");
        M = sc.nextDouble();
        System.out.print("Calcular a velocidade(V): ");
        V = sc.nextDouble();

        EnergiaMecanica = M* Math.pow(V,2) / 2;

        System.out.println("O resultado da energia mecanica e: " + EnergiaMecanica);
        sc.close();
    }
}
