package com.dic2.git.tpjava.exo4;

public class MyClass1 {

    int a = -1;
    void init() {
        a=1;
    }
    void clear() {
        a=-1;
    }
    void print() {
        init();
        System.out.println("value of a after the first init() : "+a);
        clear();
        System.out.println("value of a after clear() : "+ this.a);
        this.init();
        System.out.println("value of a after applying init with this : " +this.a);
        this.clear();
        System.out.println(this);
        System.out.println(toString());
    }
}
