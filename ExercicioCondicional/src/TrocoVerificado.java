import java.util.Scanner;
import java.util.Locale;

public class TrocoVerificado{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço unitário do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Digite a quantidade de compra: ");
        double quantidade = sc.nextDouble();

        System.out.print("Digite o dinheiro recebido: ");
        double dinheiro = sc.nextDouble();

        double total = preco * quantidade;
        double troco = total - dinheiro;

        if(troco > 0){
            System.out.printf("O dinheiro insuficiente.faltam R$ %.2f%n",troco);
        } else{
            System.out.printf("O total para pagar é: R$ %.2f%n",total);
            System.out.printf("O troco a ser devolvido é: R$ %.2f",troco);
        }
    }
}
