package javaProblems.Linkedlist;

public class doublelinkedlist {

    private Node head ;
    private Node tail ;

    private Node temp ;
    private int size = 0;

    public void insertFirst(int value){

        Node node = new Node(value);
        node.next= head;
        node.previous = null ;
        head = node;
        size+=1;
        if(tail == null){
            tail= head;
        }

    }


    public void insertLast(int value){

        Node node = new Node(value);
        if(tail== null){
            tail = node ;
            node.next = null ;
            node.previous = null ;
        }
        else {
            tail.next = node;
            node.next = null;
            node.previous = tail;
            tail = node;
            size += 1;
        }

        if(head == null){
            head = tail ;
        }

    }

    public void add(int value){
        insertLast(value);
    }

    public void insert(int pos , int value ){

        temp = head;


        if(pos >= size){
            insertLast(value);
        } else if (pos == 1) {
            insertFirst(value);

        } else {

            //traverse the temp till we reach the position before the element to be added .

            pos -= 2;

            while (pos != 0) {

                temp = temp.next;
                pos--;


            }

            Node node = new Node(value);
            node.next = temp.next;
            temp.next.previous = node ;
            node.previous = temp;
            temp.next = node;

        }


    }


    public void remove(int pos){
        pos-=2;
        temp = head ;

        if(size == 0){
            return;
        }

        while (pos != 0) {

            temp = temp.next;
            pos--;


        }

        temp.next=temp.next.next;
        temp.next.next.previous =temp;

    }



    public void printvalues(){
        temp = head;
        while(temp != null){

            System.out.print(temp.value + "  ");
            temp = temp.next;
        }
        System.out.println();

    }
    public void printreverse(){

        temp=tail;

        while(temp != null){
            System.out.print(temp.value + "  ");
            temp = temp.previous;
        }

        System.out.println();

    }

    public void removeall(){
        head = null ;
        tail =head ;
    }






    public class Node{

        private Node previous;
        private int  value ;
        private Node next ;

        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }



    }



}
