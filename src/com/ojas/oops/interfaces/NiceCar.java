package com.ojas.oops.interfaces;

public class NiceCar {
    private Engine engine;
    private Media media = new CDPlayer();

    public NiceCar(){
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine, Media media) {
        this.engine = engine;
        this.media = media;
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        media.start();
    }

    public void stopMusic(){
        media.stop();
    }

    public void upgradeEngine(Engine engine){
        this.engine = engine;
    }

}
