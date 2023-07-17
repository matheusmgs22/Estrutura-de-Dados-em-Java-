package ListaOrdenada;

public class ListaOrdenada{
    public No head;


public void addOrdered(Integer value){
    No novo = new No(value);
    if(isEmpty() == true){
        head = novo;
    }
    else if(value < head.getNum()){
        novo.setNext(head);
        head = novo;
    }
    No atual = head.getNext();
    No anterior = head;
            while(atual != null && atual.getNum().equals(value)){
                anterior = atual;
                atual = atual.getNext();
        }
    }

public void delete(Integer value){
    /*  if (isEmpty()) {
        System.out.println("Lista vazia");
    }
    if (head.getNum().equals(value)) {
        head = head.getNext();
    }
    No atual = head.getNext();
    No anterior = head;

    while (atual != null && !atual.getNum().equals(value)) {
        anterior = atual;
        atual = atual.getNext();
    }
    if (atual != null) {
        anterior.setNext(atual.getNext());
    }
*/
}

public boolean isEmpty(){
    if(this.head == null){
        return true;
    }
    else{
        return false;
     }
    }
}
