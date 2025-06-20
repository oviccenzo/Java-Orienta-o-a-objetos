import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

public class PadroesCollections {

    public static void main(String[] args){

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
