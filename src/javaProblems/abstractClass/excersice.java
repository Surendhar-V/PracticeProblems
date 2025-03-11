package javaProblems.abstractClass;

public class excersice extends abstractclass{

excersice(int a ){
    super(a);
}


    final int NAME = 4;
    @Override
    void walk() {
        System.out.println("walking");
    }

    @Override
    void jump() {
        System.out.println("Jumping");
    }

    @Override
    void fly() {
        System.out.println("fly");
    }

    @Override
    void swim() {
        System.out.println("swim");
    }
}
