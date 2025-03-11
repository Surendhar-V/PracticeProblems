package javaProblems.Enum;

public class Enum_Example {


    enum Week implements display{
        Monday,Tuesday , Wednesday , Thursday , Friday , Saturday , Sunday;



        Week(){
            System.out.println(this);
        }


        @Override
        public void hellomessage() {
            System.out.println("Hello surendhar !");
        }

    }

    public static void main(String[] args){

        Week week=Week.Sunday;
        System.out.println(week.ordinal());


        week.hellomessage();
        System.out.println();

        Week[] arr=Week.values();
        for(Week day : arr){
            System.out.println(day);
        }

    }

}

//
//
//enum StudentMarks {
//    //Constants with values
//    Krishna(86), Katyayani(75), Bhanu(89), Bhargav(70), Lata(90);
//    //Instance variable
//    private int marks;
//    //Constructor to initialize the instance variable
//    StudentMarks(int marks) {
//        this.marks = marks;
//    }
//    public static void getMarks(int model){
//        StudentMarks marks[] = StudentMarks.values();
//        System.out.println("Price of: "+marks[model]+" is "+marks[model].marks);
//    }
//}
//public class Sample{
//    public static void main(String args[]){
//        StudentMarks m[] = StudentMarks.values();
//        for(int i = 0; i<m.length; i++ ) {
//            StudentMarks.getMarks(i);
//        }
//    }
//}

