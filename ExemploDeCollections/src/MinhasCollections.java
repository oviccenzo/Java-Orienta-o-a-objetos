import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MinhasCollections {
    public static void main(String[] args){
        List<Integer> minhaLista = new ArrayList<>();
        minhaLista.add(1);
        minhaLista.add(2);
        minhaLista.add(2);

        for(Integer listaElementos : minhaLista){
            System.out.println(listaElementos);
        }

        Set<Integer> meuSet = new HashSet<Integer>();
        meuSet.add(1);
        meuSet.add(2);
        meuSet.add(3);
        meuSet.add(1);
        Iterator<Integer> iMeuSet = meuSet.iterator();
        while(iMeuSet.hasNext()){
            System.out.println(iMeuSet.next());
        }
    }
}
