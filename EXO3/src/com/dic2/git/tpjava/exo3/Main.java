package com.dic2.git.tpjava.exo3;

import com.dic2.git.tpjava.exo3.entities.LPoint;
import com.dic2.git.tpjava.exo3.entities.MyOb;
import com.dic2.git.tpjava.exo3.entities.Point;

public class Main {

    public static void main(String[] args) {

        MyOb my1 = new MyOb();
        new MyOb();

        MyOb my2 = new MyOb();

        System.gc();
        // On utilise le constructeur sans arguments
        //LPoint pt = new LPoint();
        //pt.printL();
        //System.out.println(pt.toString());
        //System.out.println(pt.getClass().getName());

        // setL() permet de modifier les arguments
        //pt.setL(5, 2, 'b');
        //pt.printL();

        // méthode permettant de déplacer notre point d'origine d'un distance dx et dy
        //pt.move(-6,4);
        //pt.printL();



    }
}
