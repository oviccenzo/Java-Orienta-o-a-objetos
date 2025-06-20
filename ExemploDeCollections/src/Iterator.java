import java.util.ArrayList;
import java.util.List;

public class Iterator {

    public static void main(String[] args){

        List<Integer> minhaLista = new ArrayList<>();
        minhaLista.add( 1 );
        minhaLista.add( 2 );
        java.util.Iterator iMinhaLista = minhaLista.iterator();

        for(Integer listaElementos: minhaLista){
            System.out.println(iMinhaLista.next());
        }
    }
}
