package Arvore;

import java.util.LinkedList;

public class BTSTravessias {

 private No root;

    public BTSTravessias() {
        root = null;
    }

    public void put(int key) {
        root = put(root, key);
    }

    public No put(No no, int key) {
        if (no == null) {
            return new No(key);
        }

        if (key < no.key) {
            no.left = put(no.left, key);
        } else if (key > no.key) {
            no.right = put(no.right, key);
        }

        return no;
    }

    public boolean isEmpty() {
       return root == null;
    }

    public LinkedList<Integer> preorder() { // (pré-ordem)
    LinkedList<Integer> lista = new LinkedList<>();

        if(this.isEmpty()){
        System.out.println("Arvore vazia");
        }else{
        preorder(this.root, lista);
        }
        return lista;
    }

    public void preorder(No no, LinkedList<Integer> list) {
        if (no != null) {
            list.add(no.key);
            preorder(no.left, list);
            preorder(no.right, list);
        }
    }

    public LinkedList<Integer> inorder(){
        LinkedList<Integer> lista = new LinkedList<>();

        if(this.isEmpty()){
            System.out.println("Arvore vazia");
        }else{
        inorder(this.root,lista);

        }
        return lista;
    }

    public void inorder(No no, LinkedList<Integer> list) { // (em-ordem)
        if (no != null) {
            inorder(no.left, list);
            list.add(no.key);
            inorder(no.right, list);
        }
    }

    public LinkedList<Integer> postorder(){ //(pós-ordem)

    LinkedList<Integer> lista = new LinkedList<>();
        if(this.isEmpty()){
        System.out.println("Arvore vazia");
        }
        else{
        postorder(this.root, null);
        }
        return lista;
    }

    public void postorder(No no, LinkedList<Integer> list) {
        if (no != null) {
            postorder(no.left, list);
            postorder(no.right, list);
            list.add(no.key);
        }
    }
}
