package src1;

public class FahrenheitParaRankine {

    public static void main(String[] args){

        System.out.println("Fahrenheit = Rankine");

        for(int fahrenheit = 1; fahrenheit <= 100; fahrenheit++){

            double rankine = fahrenheit + 459.67;

            System.out.println(STR."\{fahrenheit} = \{rankine}");
        }
    }
}
