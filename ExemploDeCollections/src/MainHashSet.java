import java.util.HashSet;
import java.util.Set;


public class MainHashSet {
    public static void main(String[] args){

        Set<String> nomes = new HashSet<String>();
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
