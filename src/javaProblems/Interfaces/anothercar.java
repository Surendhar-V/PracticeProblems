package javaProblems.Interfaces;

public class anothercar {

    private Engine engine;

    anothercar(){
      this.engine = new petrolengine();
    }
    media cdplayer = new cdplayer();

    public void stopmusic(){
        cdplayer.stop();
    }
    public void startmusic(){
        cdplayer.start();
    }

    public void enginestart(){

        this.engine.start();

    }

    public void enginestop(){


        this.engine.stop();
    }

    public void accelerate(){
        this.engine.accelerate();
    }
    public void upgradediselengine(){

        this.engine = new diselengine();

    }
    public void upgradeelectricengine(){
        this.engine = new electricengine();
    }

    public void upgradepetrolengine(){
        this.engine = new petrolengine();
    }


}
