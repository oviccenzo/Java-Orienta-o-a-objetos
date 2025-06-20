package Capitulo7;

public class TestaLaço2 {
    public static void main(String[] args){

        for(int linha = 0; linha < 20; linha++){
            for(int coluna = 0; coluna <= linha; coluna++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
