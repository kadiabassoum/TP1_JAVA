package com.dic2.git.tpjava.exo3.entities;

public class LPoint extends Point{
    private char l;

    public LPoint(){
        System.out.println("l");
    }

    public LPoint(int v, char li){
        System.out.println("l");
        l = li;
    }

    public LPoint(int xi, int yi, char li){
        System.out.println("l");
        l = li;
    }

    public void setL(int xi, int yi, char li){
        set(xi, yi);
        l = li;
    }

    public char getL(){
        return l;
    }

    public void printL(){
        {System.out.println(getX()+";"+getY()+":"+l);}

    }


}
