package javaProblems.FunctionParameters;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.compute(10, 20, new TempInterface() {
            @Override
            public void fun(int a, int b) {
                System.out.println(a * b);
            }
        });

        main.compute(10, 20, (a , b) -> {
            System.out.println(a * b);
        });

    }

    public void compute(int a, int b, TempInterface computeFunction) {
        computeFunction.fun(a, b);
    }

}
