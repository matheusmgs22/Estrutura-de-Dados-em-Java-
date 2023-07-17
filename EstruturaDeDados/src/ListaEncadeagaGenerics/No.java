package ListaEncadeagaGenerics;

    public class No <T> {
        public T value;
        public No<T> next;

        public No(T value){
            this.value = value;
            this.next = null;
        }

        public T getNum() {
            return value;
        }
        public void setNum(T num) {
            this.value = num;
        }
        public No<T> getNext() {
            return next;
        }
        public void setNext(No <T> next) {
            this.next = next;
        }
}

