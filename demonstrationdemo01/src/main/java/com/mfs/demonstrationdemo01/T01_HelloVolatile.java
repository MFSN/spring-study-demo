package com.mfs.demonstrationdemo01;


public class T01_HelloVolatile {

    private static /**volatile*/ boolean running = true;
    private static  void m(){
        System.out.println("m start");
        while(running){

        }
        System.out.println("m end");
    }
    public static void main(String args[]){
        new Thread(T01_HelloVolatile::m,"t1").start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        running = false;
    }

}
