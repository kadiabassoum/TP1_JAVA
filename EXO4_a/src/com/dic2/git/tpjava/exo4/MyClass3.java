package com.dic2.git.tpjava.exo4;

public class MyClass3 {

    static int n1; //use it into f1 and f2
    int n2; //use it into f2 only
    static void f1() // use it into f2
    {
        n1++;
        n1 *= 2;}

    void f2()  {
    n2++;
    n2 *= 2;
    f1();
    n2 += n1;
}
}
