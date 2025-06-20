import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        System.out.print( "Digite a hora inicial: " );
        int horaInicial = sc.nextInt();

        System.out.print( "Digite a hora final: " );
        int horaFinal = sc.nextInt();

        int duracao = 0;

        if (horaInicial > 24 || horaFinal > 24) {
            System.out.print( "Hora inicial ou hora final inválida" );
        } else {
            if (horaFinal > horaInicial) {
                duracao = horaFinal - horaInicial;
            } else if (horaInicial > horaFinal) {
                duracao = (24 - horaInicial) + horaFinal;
            } else {
                duracao = 24 - (horaFinal - horaInicial);
            }

            System.out.printf( "O jogo durou %d horas(s) ", duracao );
        }
    }
}
