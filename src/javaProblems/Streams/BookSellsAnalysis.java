package javaProblems.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Book{

    double cost ;
    long pages ;
    int sells ;

    public Book(double cost, long pages, int sells) {
        this.cost = cost;
        this.pages = pages;
        this.sells = sells;
    }


}

public class BookSellsAnalysis {

    public static void main(String[] args) {

        List<Book> l = new ArrayList<>();

        l.add(new Book(1,2,3));
        l.add(new Book(4,5,6));
        l.add(new Book(7,8,9));
        l.add(new Book(10,12,13));
        l.add(new Book(11,21,31));

        double TotalCost = l.stream().collect(Collectors.summingDouble(p -> p.cost));
        System.out.println(TotalCost);

        long TotalPages = l.stream().collect(Collectors.summingLong(p-> p.pages));
        System.out.println(TotalPages);

        int Totalsells = l.stream().collect(Collectors.summingInt(p -> p.sells));
        System.out.println(Totalsells);





    }
}
