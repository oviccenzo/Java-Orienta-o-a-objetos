package While;

import java.util.Scanner;

public class ExemploDo_DoWhile {

    public static void main(String[] args){
        int a = 10;
        int b = 2;

        do{
            a = a + 30;
            b = b + 20;
            System.out.printf("Valor de a e b: %d e %d\n",a,b);
        } while(a<600);
    }
}

class SomaPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados
        System.out.print("Digite o primeiro termo (a1): ");
        int a1 = scanner.nextInt();
        System.out.print("Digite a razão (r): ");
        int r = scanner.nextInt();
        System.out.print("Digite o número de termos (n): ");
        int n = scanner.nextInt();

        // Inicialização das variáveis
        int soma = 0;
        int termoAtual = a1;
        int contador = 1;

        // Loop do-while para somar os termos
        do {
            soma += termoAtual; // Adiciona o termo atual à soma
            termoAtual += r;    // Calcula o próximo termo
            contador++;         // Incrementa o contador
        } while (contador <= n); // Condição para o loop continuar

        // Exibe a soma
        System.out.println("A soma dos " + n + " primeiros termos da PA é: " + soma);

        scanner.close();
    }
}
