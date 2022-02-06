package com.dic2.tpjava.exo5;
import com.dic2.tpjava.exo5.Class1.Class2;
import com.dic2.tpjava.exo5.MyClass5.I;



public class Main {

	public static void main(String[] args) {
		
		System.out.println("test Main");
		
		MyClass5 X = new MyClass5() ;
		
	
		I i = X.new I();
		
		
		X.f1();
		i.f2();
		
		
		 
		
		  Class1 my1 = null;
		  
		  Class2 my2 = null;
		  
		  my1 = new Class1(my2=new Class2 (my1));
		 
		  
		  my1.inc(5); my2.inc(10);
		  
		  my1.print(); my2.print();
		  
		  
		  my1.exchange();
		  
		  
		  my1.print(); my2.print();
		  
		  my1.exchange();
		  
		  my1.print(); my2.print();
		  
		  
		  
		  
		  
		  
		 
}
}
