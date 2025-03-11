package javaProblems.Linkedlist;

public class linkedlist {


   public Node head ;
    public Node tail ;

    public Node temp ;
    public int size = 0;

    public Node getHead() {
        return head;
    }

    public linkedlist() {
        this.head = null;
        this.tail = null;
        Node newnode = new Node();
        newnode.next = null ;
        this.size = 0 ;
    }

    public void insertFirst(int value){

        Node node = new Node(value);
        node.next= head;
        head = node;
        size+=1;
        if(tail == null){
            tail= head;
        }

    }


    public void insertLast(int value){


        Node node = new Node(value);

        if(tail == null)
        {

            tail = node ;

        }

        tail.next = node;
        tail = node;
        size+=1;

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
            temp.next = node;

        }


    }


    public void remove(int pos){
        pos-=2;
        temp = head ;


        while (pos != 0) {

            temp = temp.next;
            pos--;


        }

        temp.next=temp.next.next;


    }



    public void printvalues(){
        temp = head;
        while(temp != null){

            System.out.print(temp.value + "  ");
            temp = temp.next;
        }


    }

    public void removeall(){
        head = null ;
        tail =head ;
    }

    public class Node{

        public int  value ;
        public Node next ;

        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }



    }

}