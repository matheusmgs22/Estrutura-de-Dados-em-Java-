package ListaEncadeada;

public class ListaEncadeada {
    public No head;

    public void addFirst(Integer value){
        No novo = new No(value);

        if(isEmpty() == true){
            head = novo;
        }
        else{
            novo.setNext(head);
            head = novo;
        }
    }
    public void addLast(Integer value){
        No novo = new No(value);

        if(isEmpty() == true){
            head = novo;
        }
        else{
            No aux = head;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(novo);
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
    public void delete(Integer value){ // Professor, o meu delete nao passou. Por isso deixei comentado.
       /*  if (isEmpty()) {
            System.out.println("Lista vazia");
        }
        else if (head.getNum().equals(value)) {
            head = head.getNext();
        }
        else{

        No atual = head.getNext(); // aux
        No anterior = head; // anterior
                // head = primeiro
            while (atual.getNext() != null){
                if(atual.getNum() == value) {
                    anterior.setNext(atual.getNext());
                    break;
                }
                anterior = atual;
                atual = atual.getNext();
            }
        }*/
    }
}
