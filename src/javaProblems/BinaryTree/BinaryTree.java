package javaProblems.BinaryTree;

import java.util.Scanner;

class BinaryTree {

    public Node root;

    public BinaryTree() {
    }

    public void populate(Scanner scanner) {

        System.out.println("Enter the root Node");
        int value = scanner.nextInt();
        root = new Node(value);

        populate(scanner, root);
    }

    public void display() {

        print(root);

    }

    public void preetyPrint() {

        PreetyPrint(root, 0);

    }

    private void PreetyPrint(Node root, int index) {

        if (root == null) {
            return;
        }

        PreetyPrint(root.right, index + 1);

        for (int i = 0; i < index - 1; i++) {
            System.out.print("|\t\t");
        }

        if (index != 0)
            System.out.println("|------" + root.value);
        else System.out.println(root.value);

        PreetyPrint(root.left, index + 1);

    }

    private void print(Node root) {

        if (root == null) {
            return;
        }

        System.out.println(root.value);

        print(root.left);
        print(root.right);

    }

    public Node getRoot() {
        return root;
    }

    private void populate(Scanner scanner, Node node) {

        System.out.println("Do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();

        if (left) {
            System.out.println("Enter the value of the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of " + node.value);
        boolean right = scanner.nextBoolean();

        if (right) {
            System.out.println("Enter the value of the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }

    }

    static class Node {

        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

    }

}