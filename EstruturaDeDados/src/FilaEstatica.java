public class FilaEstatica {
    public Integer[] elementos;
    private Integer primeiro;
    private Integer ultimo;
    private Integer tamanho;

    public FilaEstatica(int tamanho){
        this.elementos = new Integer [tamanho];
        this.primeiro = -1;
        this.ultimo = -1;
        this.tamanho = tamanho;

    }

    public void enqueue(Integer valor){ //Adiciona o item a esta fila
        if(isFull()){
            System.out.print("Fila cheia");
        }

        if(this.isEmpty()){
            this.primeiro = 0;

        }
        // dessa forma, a fila funciona de forma circular. (chamado de patch)

            this.ultimo = (this.ultimo + 1) % this.tamanho;
            this.elementos[this.ultimo] = valor;
     }

    public boolean isFull(){ // fila estiver cheia
        return (this.ultimo + 1 ) % this.elementos.length == this.primeiro ;

    }

    public Integer dequeue(){  //Remove e retorna o item nesta fila que foi adicionado menos recentemente.
     if(isEmpty()){
        System.out.print("Fila vazia");
     }

     int valor = this.elementos[this.primeiro];

     if(this.primeiro == this.ultimo){
        this.primeiro = -1;
        this.ultimo = -1;

     }else{
     this.elementos[this.primeiro] = null;
     this.primeiro = (this.primeiro + 1) % this.tamanho;
     }
     return valor;
    }
    public boolean isEmpty(){ // Retorna verdadeiro se esta fila estiver vazia.
        return this.primeiro == -1;
    }
}
