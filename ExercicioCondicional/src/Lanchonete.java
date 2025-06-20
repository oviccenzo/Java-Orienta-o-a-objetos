import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        double[] preco = {4.00, 4.50, 5.00, 2.00, 1.50};

        System.out.print( "Digite o codigo do produto comprado: " );
        int codigo = sc.nextInt();

        System.out.print( "Digite a quantidade de compra: " );
        int quantidade = sc.nextInt();

        if (codigo < 1 || codigo > 5) {
            System.out.println("Codigo invalido.Deve digitar numero entre 1 a 5");
        } else {

            double valorTotal = preco[codigo - 1] * quantidade;

            System.out.printf( "Valor a pagar: R$ %.2f%n", valorTotal );
        }
    }
}