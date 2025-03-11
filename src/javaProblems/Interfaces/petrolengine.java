package javaProblems.Interfaces;

public class petrolengine implements Engine {


    @Override
    public void start() {

        System.out.println("Petrol engine started");
    }

    @Override
    public void stop() {
        System.out.println("petrol engine stoped");
    }

    @Override
    public void accelerate() {
        System.out.println("Petrol engine accelerating");
    }

}
