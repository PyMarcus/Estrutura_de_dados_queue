import java.util.Queue;
import java.util.LinkedList;


public class Fila {
    public static void main(){
        Queue<Integer> fila = new LinkedList<>();
        // adicionar elemento:
        for(int i = 0; i < 10; i ++) fila.add(i);
        System.out.println(fila);
        //remover elemento:
        fila.remove();
        System.out.println(fila);
        // examinar:
        System.out.println(fila.element());
        //tamanho:
        System.out.println(fila.size());
        //esvaziar:
        fila.clear();
        System.out.println(fila);


    }
}
