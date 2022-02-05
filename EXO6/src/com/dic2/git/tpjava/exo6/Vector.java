package com.dic2.git.tpjava.exo6;

public class Vector {

    private Object t[];
    private int p;

    Vector() {
        t = new Object[100];
    }

    void add(Object o) {
        if(p<100) {t[p] = o; p++;
        }
        System.out.println("add");
    }
    Object elementAt(int i) {
        if (i<=p) return t[i]; else return null;
    }
}
