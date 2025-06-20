import java.util.ArrayList;
import java.util.List;

public class MainArrayList {

    public static void main(String[] args){

        List<String> nomes = new ArrayList<String>();
        nomes.add("Eduardo");
        nomes.add("Luiz");
        nomes.add("Bruna");
        nomes.add("Sonia");
        nomes.add("Brianda");
        nomes.add("Julia");
        nomes.add("Carlos");

        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
