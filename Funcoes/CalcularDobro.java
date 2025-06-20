package Funcoes;
import java.util.Scanner;
public class CalcularDobro {

    public static int Dobro(int x){
        return x * 2;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, resultado;
        System.out.print("Digite um numero: ");
        num = sc.nextInt();
        resultado = Dobro(num);
        System.out.printf("Dobro de %d: %d \n" , num , resultado);
        sc.close();
    }
}
