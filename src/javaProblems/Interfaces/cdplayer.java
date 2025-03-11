package javaProblems.Interfaces;

public class cdplayer implements media {


    @Override
    public void start() {

        System.out.println("Music started");
    }

    @Override
    public void stop() {

        System.out.println("Music stoped");
    }
}
