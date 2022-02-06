package com.dic2.tpjava.exo2;

import com.dic2.tpjava.exo2.Point;

public class Point {
	
	Point () {};

	 //Définition des variables x et y
    private int x,y; char l;
    
//Définition de la fonction check
    private void check(){
    	if (x<0) x=0; if (y<0) y=0;
    	}
    
//Définition de la fonction move
    void move(int dx, int dy){
    	x+=dx; y+=dy; check();
    	}
//Définition de la fontion set
    void set (int xi, int yi){
    	x= xi; y=yi; check();
    	}
    
    int getX() {return x;}
    int getY() {return y;}

    void print()
        {System.out.println(x+ ";"+y+":"+l);

}

    void ex(Point pt) 
    
    {pt.set(1, 1);}
    
    //Le passage par référence permet de passer un objet comme paramètre
    
    void test() {
    	
    	Point pt3, pt4;
    	pt3 = new Point();
    	pt4 = pt3;
    	
    	//pt4 est un paramètre de type objet donc il doit être affecté par référence
    	//l'affectation et le passage par référence est destiné uniquement aux objets
    	pt3.set(2, 3);
    	pt4.print();
    	
    	ex(pt4);
    	pt3.print();
    }
  
}

