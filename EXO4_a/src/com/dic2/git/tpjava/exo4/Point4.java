package com.dic2.git.tpjava.exo4;

public class Point4 {

    private int x,y;

    Point4(){
        x = y = 1;
    }

    Point4(int v) {
        this();
        if(v!=1) x = y = v;
    }

    Point4(int x, int y) {
        this(x);

        if(x != y) {
            this.x = x;
            this.y= y;
        }
    }
    void print() {
        System.out.println(x+";"+y);
    }
}
