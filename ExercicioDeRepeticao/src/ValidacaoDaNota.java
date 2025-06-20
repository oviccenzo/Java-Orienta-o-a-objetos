import java.util.Scanner;
import java.util.Locale;

public class ValidacaoDaNota {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1, nota2;
        while(true) {
            System.out.print("Digite a primeiro nota: ");
            nota1 = sc.nextDouble();

            if(nota1 >= 0 && nota1 <= 10){
                break;
            } else {
                System.out.println("valor Invalido.tente Novamente: ");
            }
        }
        while (true){
            System.out.print("Digite a segunda nota: ");
            nota2 = sc.nextDouble();

            if(nota2 >= 0 && nota2 <= 10){
                break;
            } else{
                System.out.println("valor Invalido.tente Novamente");
            }
        }
        double media = (nota1 + nota2) /2;
        System.out.printf("Media = %.2f%n" , media);
    }
}
