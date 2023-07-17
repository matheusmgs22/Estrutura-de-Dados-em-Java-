package ListaEncadeada;

public class No {
    public Integer value;
    public No next;

    public No(Integer value){
        this.value = value;
    }

    public Integer getNum() {
        return value;
    }
    public void setNum(Integer num) {
        this.value = num;
    }
    public No getNext() {
        return next;
    }
    public void setNext(No next) {
        this.next = next;
    }
}
