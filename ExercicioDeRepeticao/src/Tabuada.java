import java.util.Scanner;

public class Tabuada{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja a tabuada para qual valor? ");
        int n = sc.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.println(n + " * " + i + " = " + (i * n));
        }
    }
}
