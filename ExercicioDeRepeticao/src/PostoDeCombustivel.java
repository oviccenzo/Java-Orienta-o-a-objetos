import java.util.Scanner;

public class PostoDeCombustivel{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int codigo;
        int alcool = 0,gasolina = 0,diesel = 0;

        while(true) {
            System.out.print( "Informe um codigo(1,2,3)ou 4 para parar: " );
            codigo = sc.nextInt();

            if (codigo == 1) {
                alcool++;
            } else if (codigo == 2){
                gasolina++;
            } else if (codigo == 3){
                diesel++;
            } else if(codigo == 4){
                break;
            } else{
                System.out.println("codigo Invalido.Tente Novamente");
            }
        }

        System.out.println("muito Obrigado");
        System.out.println("alcool: "+alcool);
        System.out.println("gasolina: "+gasolina);
        System.out.println("diesel: "+ diesel);
    }
}
