package com.dic2.tpjava.exo2;

public class Point1 {

	
	int x,y;
	
	private void check()
	{if (x<0) x=0; if(y<0) y=0;}
	
	Point1(int v)
	
	{x=y=v;; check();}
	
	Point1 (int xi, int yi)
		
	{x=xi; y=yi; check();}
	
	void move(int dx, int dy)
	
	{x+=dx; y+=dy; check();}
	
	void set(int xi, int yi)
	
	{x=xi; y=yi; check();}
	
	int getX() {return x;}
	int getY() {return y;}
	
	void print ()
	
	{System.out.println(x+";"+y);}
	
}

// Lorqu'on redéfini des constructeurs, celui par défaut n'est plus utilisé