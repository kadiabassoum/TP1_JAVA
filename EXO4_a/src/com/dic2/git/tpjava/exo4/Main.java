package com.dic2.git.tpjava.exo4;
import java.util.*;
import com.dic2.git.tpjava.exo4.MyClass2;
public class Main {

    public static void main(String[] args) {

         MyClass3 my = new MyClass3();

         my.n2 = 10;

         System.out.println(my.n2);
        System.out.println("On application la fonction f2()");
         my.f2();

         System.out.println(my.n2);




    	/*
    	MyClass2 my = new MyClass2();
     my.print();
     MyClass2.n = 10;
     MyClass2.print();
     my.print();
    	  Point4 point4 = new Point4(5, 8);

        point4.print();
    	MyClass1 myClass1 = new MyClass1();

    	myClass1.print();
	Util util = new Util();

	long debut = System.currentTimeMillis();

	for(int i=0; i<=100;i++){
        System.out.println(util.fac2(10));
    }
	long endTime = System.currentTimeMillis();
	long duration = endTime-debut;
	System.out.println("Le temps d'exécution est de :" + duration );

    	 */
    }


}
