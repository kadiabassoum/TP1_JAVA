package com.dic2.git.tpjava.exo4;

public class Point2 {

    private int x;
    private int y;
    private Object o;

    public Point2() {
        x = y = 1;
        o = new Object();
    }
    public void print() {
        System.out.println(x+";"+y+":"+o);
    }
}
