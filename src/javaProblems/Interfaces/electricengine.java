package javaProblems.Interfaces;

public class electricengine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric engine started");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stoped");
    }

    @Override
    public void accelerate() {

        System.out.println(" Electric engine accelerating");

    }
}
