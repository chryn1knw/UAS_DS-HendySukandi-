package tree;

public class Tree {


    private TreeNode root;

    public void insert(int value){
        if(root == null){
            root = new TreeNode(value);
        } else{
            root.insert(value);
        }
    }
//
    public int size(){
        return (size(root));
    }
//
    public int size(TreeNode value){
        if(value == null){
            return (0);
        }else {
            return(size(value.getRightChild())+1+size(value.getLeftChild()));
        }
    }

    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        else {
            return root.min();
        }
    }

    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        else {
            return root.max();
        }
    }
    public TreeNode get(int value) {
        if(root != null){
            return root.get(value);
        }
        return null;
    }

    public void traverseInOrder(){
        if(root != null){
            root.traverseInOrder();
        }
    }

}

