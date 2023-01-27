package tree;

public class Main {
    public static void main(String[] args){

        Tree IntTree = new Tree();
        IntTree.insert(41);
        IntTree.insert(54);
        IntTree.insert(52);
        IntTree.insert(25);
        IntTree.insert(14);
        IntTree.insert(21);
        IntTree.insert(62);
        IntTree.insert(98);
        IntTree.insert(91);
        IntTree.insert(57);
        IntTree.insert(60);
        IntTree.insert(7);

        IntTree.traverseInOrder();

        System.out.println("");
        System.out.print("Nilai max : ");
        System.out.println(IntTree.max());
        System.out.print("NIlai min : ");
        System.out.println(IntTree.min());

        // Jumlah elemen
        System.out.println("Size elemen : "+ IntTree.size());

    }
}