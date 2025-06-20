package src1;

public class FahrenheitParaCelsius {

    public static void main(String[] args){

        System.out.println("Fahrenheit = Celsius");

        for(int n = 1; n <= 100; n++){

            double celsius = (9.0 * n / 5) + 32;
            
            System.out.println("n = " + celsius);
        }
    }
}
