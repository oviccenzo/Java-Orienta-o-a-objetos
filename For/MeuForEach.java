package For;

public class MeuForEach {
    
    public static void main(String[] args){
        
        int[] pontos = {101,102,95,106,160};
        int h_pontos = maximum(pontos);
        System.out.println("A melhor pontuacao e " + h_pontos);

    }

    public static int maximum(int[] numeros){

        int pontoMax = numeros[0];
        for(int num: numeros){
            if(num > pontoMax){
                pontoMax = num;
            }
        }

        return pontoMax;
    }
}
