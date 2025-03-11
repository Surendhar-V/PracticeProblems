package javaProblems.factoryConstructor_dart;

 class A{

    Object data;
    A(Object data){
    this.data=data;
    }

    @Override
    public String toString() {
        return data+" A";
    }


     public  Object switchmyclass(){
         if((this.data.getClass().getSimpleName()).equals("Integer")){
             return new B((Integer)this.data);
         }
         else if ((this.data.getClass().getSimpleName()).equals("Double"))
         {
             return new C((Double) this.data );
         }
         else{
             return null;
         }
     }
}



 class B extends A{


    int data;
    B (int data){
        super(0);
        this.data=data;
    }
    @Override
    public String toString() {
        return this.data+" B";
    }




}
class C extends A{


    double data;
    C (double data){
        super(0);
        this.data=data;
    }
    @Override
    public String toString() {
        return this.data+" C";
    }




}








public class _dummy {

    public static void main(String[] args) {
        Object obj1=new A(10.0);
        Object obj2=new A(10);

        obj2= ((A) obj2).switchmyclass();
        obj1= ((A) obj1).switchmyclass();

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
    }

}
