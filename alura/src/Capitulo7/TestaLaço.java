package Capitulo7;

public class TestaLaço {
    public static void main(String[] args){

        for(int multiplicar = 21; multiplicar <= 1000; multiplicar++){
            for(int contar = 0; contar <= 10; contar++){
                System.out.print(multiplicar * contar);
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
