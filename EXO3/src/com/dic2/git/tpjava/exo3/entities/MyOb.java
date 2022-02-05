package com.dic2.git.tpjava.exo3.entities;

public class MyOb {

    public MyOb(){
        print();
    }

    public String getID(){
        return Integer.toHexString(hashCode());
    }

    public void print(){
        System.out.println(getID());
    }

    protected void finalize() {
        System.out.println("finalize: " + getID());
    }
}
