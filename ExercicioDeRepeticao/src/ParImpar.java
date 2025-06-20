import java.util.Scanner;

public class ParImpar{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("quantos números voce vai digitar? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();

            if(numero == 0){
                System.out.print("nulo");
            } else if(numero % 2 == 0){
                System.out.print("par ");
            } else{
                System.out.print("impar ");
            }
            if(numero > 0){
                System.out.print(" positivo ");
            } else{
                System.out.print("negativo ");
            }
        }
        sc.close();
    }
}
