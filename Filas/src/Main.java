import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args){

        FilaEstatica fila = new FilaEstatica(10);
        fila.inserir(3);
        fila.inserir(5);
        fila.inserir(4);
        fila.inserir(3);
        fila.inserir(3);
        fila.inserir(2);
        fila.inserir(3);
        fila.inserir(1);
        fila.inserir(3);
        fila.inserir(2);
        fila.remover();
        fila.remover();
        fila.remover();
        fila.remover();
        fila.print_itens();


    }
}
