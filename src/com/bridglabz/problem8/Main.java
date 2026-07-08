package com.bridglabz.problem8;

import javax.xml.transform.stream.StreamSource;

interface Wifi{
   void connectWifi();
}

interface Music{
    void play();
}

interface Video{
    void stram();
}

class SmartTv implements Wifi,Music,Video{
    @Override
    public void connectWifi() {
        System.out.println("wifi");
    }

    @Override
    public void play() {
        System.out.println("Playin music");
    }

    @Override
    public void stram() {
        System.out.println("Streaming videos");
    }
}

public class Main {

    public static void main(String[] args) {
        Wifi wifi=new SmartTv();
        wifi.connectWifi();
//        ((SmartTv) wifi).play();
//        ((SmartTv) wifi).stram();
        Music music=new SmartTv();
        music.play();

        Video video=new SmartTv();
        video.stram();
    }


}
