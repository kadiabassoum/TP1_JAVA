package com.dic2.tpjava.exo5;

public class MyClass5 {

	I i = new I();

	private int n1;

	void f1() {

		n1++;
		i.n2++;
		i.print2();
	}

	private void print1()

	{
		System.out.println("1 : " + n1);
	}

	class I {

		private int n2;

		public void f2() {
			n2++;
			n1++;
			print1();
		}

		private void print2() {

			System.out.println("2 : " + n2);

		}
	}

}
