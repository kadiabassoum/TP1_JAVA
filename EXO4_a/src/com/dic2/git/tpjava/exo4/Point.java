package com.dic2.git.tpjava.exo4;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    private void check(){
        if(x < 0) x = 0;
        if(y < 0) y = 0;
    }

    public Point(int v){
        x = y = v ;
        check();
    }

    public Point(int xi, int yi){
        x = xi;
        y = yi;
        check();
    }

    public void move(int dx, int dy){
        x += dx;
        y += dy;
        check();
    }


    public void set(int xi, int yi){
        x = xi;
        y = yi;
        check();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void print(){
        System.out.println(x + ";" + y);
    }

    public double distance(int xi, int yi) {
        return (x-xi)*(x-xi) + (y-yi)*(y-yi);
    }

    public double distance(int v) {
        return (x-v)*(x-v) + (y-v)*(y-v);
    }


    public void ex(Point pt){
        pt = null;
    }

    public void test(){
        Point pt = new Point();
        System.out.println(pt);
        ex(pt);
        System.out.println(pt);
    }
}
