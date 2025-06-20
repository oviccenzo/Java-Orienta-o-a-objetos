import java.util.Scanner;

public class SenhaFixa{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 2002;
        int senhaInformada;

        System.out.print("Digite a senha: ");
        senhaInformada = sc.nextInt();

        while(senhaInformada != senhaCorreta){
            System.out.print("senha Invalida.tente novamente: ");
            senhaInformada = sc.nextInt();

        }
        System.out.println("acesso permitido!");
    }
}
