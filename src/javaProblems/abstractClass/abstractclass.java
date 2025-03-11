package javaProblems.abstractClass;

public abstract class abstractclass extends parentabstractclass {


    final int  NAME  = 007;
    abstract void walk();

    public int getNAME() {
        return NAME;
    }

    static void normal(){
        System.out.println("I am a normal method and I am static");
    }

    public  void run(){
        System.out.println("I am from the parent class");
    }
    abstract void jump();

    abstractclass(int a ){
        System.out.println( a );
    }

}
