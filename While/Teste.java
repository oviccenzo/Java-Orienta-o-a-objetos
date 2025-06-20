package While;

public class Teste {

    public static void main(String[] args){

        for(int i =1; i <= 4; i++){
            for(int j = 3; j > 0; j--){
                int k = i + j;
                System.out.printf("%d + %d = %d\n",i,j,k);
            }
        }
    }
}
