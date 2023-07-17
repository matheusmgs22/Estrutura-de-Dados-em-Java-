package ListaEncadeagaGenerics;

public class ListaEncadeadaG <T>{
     public No <T> head;

    public void addFirst(T value){
        No<T> novo = new No<T>(value);

        if(isEmpty() == true){
            head = novo;
        }
        else{
            novo.setNext(head);
            head = novo;
        }
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        else{
            return false;
        }

    }

}
