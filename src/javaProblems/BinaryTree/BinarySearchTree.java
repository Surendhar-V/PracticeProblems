package javaProblems.BinaryTree;

enum traversal{
    INORDER(1),
    POSTORDER(2),
    PREORDER(3);

    int value;
    traversal(int value){
        this.value = value;
    }

    }

public class BinarySearchTree {


    private Node root ;

    private void addNode(int value ){

        if(root == null){
            root = new Node(value);
            return;
        }

        add(value , root);

    }
    private Node add(int value , Node node){

        if(node == null){
            Node newNode = new Node(value);
            return newNode;
        }

        if(node.value > value){
            node.left = add(value , node.left);
        }

        if(node.value < value){
            node.right = add(value , node.right);
        }

        node.height = Math.max(getHeight(node.left) , getHeight(node.right)) +1;

        return node;

    }
    public void addArray(int[] arr){

        for(int a : arr){
            addNode(a);
        }

    }
    public  void addSortedArray(int[] arr){

        addSortedArray(arr , 0 , arr.length);

    }
    private void addSortedArray(int[] arr , int start , int end){

        if(start ==end ){
            return;
        }

        int mid = (start+end)/2;

        addNode(arr[mid]);

        addSortedArray(arr ,start , mid );
        addSortedArray(arr , mid+1 , end);

    }
    public int getHeight(Node node){

        if(node == null){
            return -1;
        }

        return node.height;

    }
    public void traverse(traversal option){

        if(option==traversal.INORDER){
            inorder(root);
        }else if(option == traversal.POSTORDER){
            postorderTraversal(root);
        }else{
            preorderTraversal(root);
        }

        System.out.println();

    }
    private void preorderTraversal(Node node){

        if(node == null){
            return;
        }

        System.out.print(node.value+" ");

        preorderTraversal(node.left);
        preorderTraversal(node.right);


    }
    private void postorderTraversal(Node node){

        if(node == null){
            return;
        }

        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.value+" ");

    }

    private void inorder(Node node){

        if(node == null){
            return;
        }

        inorder(node.left);
        System.out.print(node.value+" ");
        inorder(node.right);

    }

    public void preetyPrint(){

        PreetyPrint(root ,0);

    }
    private void PreetyPrint(Node root , int index){

        if(root==null){
            return;
        }

        PreetyPrint(root.right ,index+1);

        for(int i = 0 ; i<index-1 ; i++){
            System.out.print("|\t\t");
        }

        if(index!=0)
            System.out.println("|------"+root.value + "(" + getHeight(root)+")");
        else System.out.println(root.value + "(" + getHeight(root)+")");

        PreetyPrint(root.left , index+1);

    }
    public boolean isBalanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){

        if(node == null){
            return true;
        }

        return Math.abs( getHeight(node.left) - getHeight(node.right)   ) <=1 && balanced(node.left) && balanced(node.right);

    }

    static class Node {

        int value;
        Node right;
        Node left;
        int height;

        Node(int value){
         this.value = value;
        }

    }

}