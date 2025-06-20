import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args){

        List<Integer> minhaLista = new ArrayList<Integer>();
        minhaLista.add( (int) Math.pow(2,2)  );
        minhaLista.add(2*2*2);

        for (Integer listaElementos: minhaLista){
            System.out.println(listaElementos);
        }
    }
}
