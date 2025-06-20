import java.util.Scanner;

public class CalcularTerreno {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Calcular a largura do terreno: ");
        double LarguraDoTerreno = sc.nextDouble();

        System.out.println("Calcular o comprimento do terreno: ");
        double ComprimentoDoTerreno = sc.nextDouble();

        System.out.println("Calcular o valor do metro quadrado: ");
        double ValorDoMetroQuadrado = sc.nextDouble();

        double AreaDoTerreno = LarguraDoTerreno * ComprimentoDoTerreno;
        double PreçoDoTerreno = ComprimentoDoTerreno * ValorDoMetroQuadrado;

        System.out.println("A área do terreno é: " + AreaDoTerreno);
        System.out.println("O preço do terreno é: " + PreçoDoTerreno);
    }
}
