package javaProblems.Linkedlist;

public class Main {

    public static void main(String[] args) {

        linkedlist list = new linkedlist();
//        list.insertFirst(9);
//        list.insertLast(4);
        list.add(90);
        list.add(27);
        list.add(42);
        list.add(14);


        list.printvalues();

        System.out.println();


        doublelinkedlist list1 = new  doublelinkedlist();

        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);

        list1.printvalues();


        linkedlist listdummy = new linkedlist();
        listdummy.add(3);
        listdummy.add(6);
        listdummy.add(7);

        System.out.println(list.getHead().value);







    }






}
