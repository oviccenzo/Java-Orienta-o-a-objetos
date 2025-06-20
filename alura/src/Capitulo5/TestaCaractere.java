package Capitulo5;

public class TestaCaractere {

    public static void main(String[] args){

        char Letra = 'a';
        System.out.println(Letra);

        int Valor = 65; //Compila!
        System.out.println(Valor);

//        Valor  = (int) (Valor + 1); Não compila!
//        System.out.println(Valor);

        Valor = (char) (Valor + 1);
        System.out.println( Valor );

        String Palavra = "Alura cursos online de tecnologia ";
        System.out.println(Palavra);

        Palavra = Palavra + 2020;
        System.out.println(Palavra);
    }
}
