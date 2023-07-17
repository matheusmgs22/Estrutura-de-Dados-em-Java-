package Arvore;

public class BSTRemocao {
    public No root;

    public void put(Integer key) {
        this.root = put(this.root, key);
    }


    private No put(No no, Integer key) {
        if (no == null) {
            No novoNo = new No(key);
            return novoNo;
        }

        if (key < no.key) {
            no.left = put(no.left, key);
        } else if (key > no.key) {
            no.right = put(no.right, key);
        }

        return no;
    }

    public void delete(int key) {
        root = delete(root, key);
    }


    private No delete(No no, int key) {
        if (no == null) {
            return null;
        }


        if (key < no.key) {
            no.left = delete(no.left, key);
        } else if (key > no.key) {
            no.right = delete(no.right, key);
        } else {
            if (no.left == null && no.right == null) {

                return null;
            } else if (no.left == null) {

                return no.right;
            } else if (no.right == null) {

                return no.left;
            } else {

                No proximoNo = no;
                No proximoAux = no.right;

                while (proximoAux.left != null) {
                    proximoNo = proximoAux;
                    proximoAux = proximoAux.left;
                }

                no.key = proximoAux.key;

                if (proximoNo == no) {
                    proximoNo.right = proximoAux.right;
                } else {
                    proximoNo.left = proximoAux.right;
                }
            }
        }
        return no;
    }
    // TESTE

}


