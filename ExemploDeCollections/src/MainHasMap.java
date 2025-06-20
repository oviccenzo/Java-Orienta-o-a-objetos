import java.util.Map;
import java.util.HashMap;

public class MainHasMap{

    public static void main(String[] args){

        Map<Integer,String> nomes = new HashMap<Integer,String>();
        nomes.put(5,"Eduardo");
        nomes.put(3,"Luiz");
        nomes.put(2,"Bruna");
        nomes.put(4,"Sonia");
        nomes.put(1,"Brianda");
        nomes.put(7,"Julia");
        nomes.put(6,"Carlos");

        for(String nome: nomes.values()){
            System.out.println(nome);

        }
    }
}