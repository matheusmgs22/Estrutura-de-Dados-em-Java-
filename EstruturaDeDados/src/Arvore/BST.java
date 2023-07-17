package Arvore;

public class BST{
    public No root;

    public void put(Integer key){
        this.root = put(this.root, key);
    }

    private No put(No no, Integer key){
        if(no == null){
            No novoNo = new No(key);
            return novoNo;
        }

        if(key < no.key){
            no.left = put(no.left, key);
        }else if(key > no.key){
           no.right = put(no.right, key);
    }

    return no;
    }

    public int depth(){
        return depth(root);

    }

    private int depth(No no){
        if(no == null){
            return -1;
        }else{
            return 1 + Math.max(depth(no.left), depth(no.right));

        }
    }

}
