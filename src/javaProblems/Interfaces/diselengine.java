package javaProblems.Interfaces;

public class diselengine implements Engine{
    @Override
    public void start() {
        System.out.println("Disel engine started");
    }

    @Override
    public void stop() {
        System.out.println("Disel engine stoped");
    }

    @Override
    public void accelerate() {

        System.out.println(" Disel engine accelerating");

            }
}
