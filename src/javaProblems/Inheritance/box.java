package javaProblems.Inheritance;

public class box {

int l;
int w ;
int h ;

    public box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }


    public box(){

        this.l = 1;
        this.w = 1;
        this.h = 1;

    }


    public final void finalMethod(){
        System.out.println("final Method from Parent class");
    }

}