package javaProblems.BinaryTree;

public class Main {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        Java.BinaryTree tree =new  Java.BinaryTree();
//
//        tree.populate(scanner);
//        tree.display();
//        tree.preetyPrint();

        BinarySearchTree bst = new BinarySearchTree();

        bst.addArray(new int[] {10,5,15,4,6,12,16,3,2});

        bst.addSortedArray(new int[]{5,4,3,2,1});
//        bst.preetyPrint();
        System.out.println(bst.isBalanced());
        bst.traverse(traversal.POSTORDER);
        bst.traverse(traversal.INORDER);
        System.out.println(bst.isBalanced());
//
//
//        AVL tree = new AVL();
//
//        int[] arr = {50 , 40 , 60 , 30 ,48 , 20 , 10};
//
//        //int[] arr = {10,9,20,30,28};
//
//        tree.insertArr(arr);
//        BinarySearchTree tree2 = new BinarySearchTree();
//        tree2.addArray(arr);


//        tree.preetyPrint();

//        System.out.println();
//        System.out.println();
//        tree2.preetyPrint();
//        System.out.println(tree2.isBalanced());



    }
}