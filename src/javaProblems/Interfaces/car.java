package javaProblems.Interfaces;

public class car implements Engine , brake , media {
    @Override
    public void start() {

        System.out.println("Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Engine stoped");
    }

    @Override
    public void accelerate() {

        System.out.println("engine accelerated ");
    }

    @Override
    public void Brake() {

        System.out.println("Brake applied");
    }

}