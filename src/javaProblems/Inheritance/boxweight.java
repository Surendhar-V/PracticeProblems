package javaProblems.Inheritance;

public class boxweight extends box {

    int weight ;

    public boxweight(int l , int w , int h ,int weight) {
        super(l, w, h);
        this.weight = weight;

    }

    public  boxweight(){
        this.weight = 1;
    }

//    @Override
//    public final void finalMethod(){
//        System.out.println("final Method from Parent class");
//    }

}
