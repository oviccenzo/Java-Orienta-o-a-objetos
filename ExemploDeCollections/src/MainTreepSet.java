import java.util.LinkedHashSet;
import java.util.Set;

public class MainTreepSet {
    public static void main(String[] args){

        Set<String> nomes = new LinkedHashSet<String>();
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
