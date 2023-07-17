public class PilhaEstatica {

    public int[] elementos;
    public int tamanho;
    public int topo;

    public PilhaEstatica(int tamanho){
        this.elementos = new int [5];
        this.tamanho = tamanho;
        this.topo = -1;
    }

    public void push(int valor){
        if (this.topo < this.elementos.length){
            this.elementos[++topo] = valor;
        }

    }

    public int pop(){

        if (isEmpty()){
            return 0;
        }
        return this.elementos[this.topo--];
    }

    public boolean isEmpty(){
        if(this.topo == -1){
            return true;
        }
        return false;

    }

    public int peek(){
        if(this.isEmpty() == true){
        }
        return elementos[topo];
    }
}
