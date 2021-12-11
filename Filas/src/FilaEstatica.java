public class FilaEstatica {
    int inicio, fim, tamanho, qnt_elementos;
    int[] fila;

    //construtor da fila:
    public FilaEstatica(int tamanho){
        inicio = fim = 0;
        this.tamanho = tamanho;
        // criação do objeto
        fila = new int[this.tamanho];  // fila obtem tamanho definido
    }

    //métodos
    public boolean isVoid(){  // está vazia?
        return inicio == fim;
    }

    private int size(){  // define o tamanho para percorrer em loops
        return fim;
    }

    public void print_itens(){  //imprime a fila
        System.out.print("Queue: [");
        for(int i = inicio; i < size(); i++) System.out.print(fila[i]);
        System.out.println("]");
    }


    public void inserir(int valor){  //insere dados
        if(fim <= fila.length - 1){ fila[fim] = valor;
        fim += 1;}else System.out.println("Fila cheia");
    }

    public int remover(){
        if(isVoid()) return -1;
            else{
                inicio += 1;
                return inicio;
                }
    }
}
