package Capitulo6;

public class TestarIR2 {
    public static void main(String[] args){

        //De 1900.00 até 2800.00 o IR é de 7.5% e pode deduzir para R$ 142 reias
        //De 2800.01 até 3751.00 o IR é de 15% e pode deduzir para R$ 350 reais
        //De 3751.01 até 4664.00 o IR é de 22.5% e pode deduzir para R$ 636 reais

        double Salario = 3800.00;

        if(Salario >= 1900.00 && Salario <= 2800.00){
            System.out.println("A sua aliquota é de 7.5%");
            System.out.println("Você pode deduzir até R$ 142 reais");
        } else if(Salario >= 2800.00 && Salario <= 3751.00){
            System.out.println("A sua aliquota é de 15%");
            System.out.println("Você pode deduzir até R$ 350 reais");
        } else if(Salario >= 3751.01 && Salario <= 4664.00){
            System.out.println("A sua aliquota é de 22.5%");
            System.out.println("Você pode deduzir até R$ 636 reais");
        }
    }
}