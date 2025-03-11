package javaProblems.BinaryTree;

public class AVL {
    private Node root;

    public void insertArr(int[] arr) {

        for (int a : arr) {
            add(a);
        }

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
            System.out.println("|------" + root.value + "(" + root.height + ")");
        else System.out.println(root.value + "(" + root.height + ")");

        PreetyPrint(root.left, index + 1);

    }

    public Node add(int value) {

        root = add(root, value);
        return root;

    }

    public Node add(Node node, int value) {

        if (node == null) {
            return new Node(value);
        }

        if (value > node.value) {
            node.right = add(node.right, value);
        }

        if (value < node.value) {
            node.left = add(node.left, value);
        }

        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        return rotate(node);

    }

    private Node rotate(Node node) {

        if (getHeight(node.left) - getHeight(node.right) > 1) {
            // Left heavy

            if (getHeight(node.left.left) > getHeight(node.left.right)) {
                // left-left
                return rightRotate(node);
            }
            if (getHeight(node.left.left) < getHeight(node.left.right)) {
                // left-right
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }

        }


        if (getHeight(node.right) - getHeight(node.left) > 1) {
            // Right heavy

            if (getHeight(node.right.left) < getHeight(node.right.right)) {
                // right-right
                return leftRotate(node);
            }
            if (getHeight(node.right.left) > getHeight(node.left.right)) {
                // right-left
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }

        }

        return node;
    }

    private Node rightRotate(Node p) {

        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(getHeight(p.left), getHeight(p.right)) + 1;
        c.height = Math.max(getHeight(c.left), getHeight(c.right)) + 1;

        return c;
    }

    private Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(getHeight(p.left), getHeight(p.right)) + 1;
        c.height = Math.max(getHeight(c.left), getHeight(c.right)) + 1;

        return p;
    }

    private int getHeight(Node node) {

        if (node == null) {
            return -1;
        }

        return node.height;

    }


    class Node {
        int value;
        int height;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }

    }

}