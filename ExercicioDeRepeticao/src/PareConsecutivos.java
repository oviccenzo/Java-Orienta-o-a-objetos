import java.util.Scanner;

public class PareConsecutivos{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x;

        while(true){
            System.out.print("Digite um numero inteiro: ");
            x = sc.nextInt();

            if(x == 0){
                break;
            }
            int soma = 0;
            for(int i = 0;i < 5;i++){
                if( x % 2 != 0){
                    x++;
                }
                soma = soma + x;
                x += 2;
            }
            System.out.println("Soma  = " + soma);
        }
    }
}
