package com.dic2.tpjava.exo5;

public class Class1 {

	private int n;
	int c;

	void inc(int i)

	{
		n += i;
	}

	int get() {
		return n;
	}

	void set(int n)

	{
		this.n = n;
	}

	void print()

	{
		System.out.println(n + ":" + c);

	}

	Class2 my;

	Class1(Class2 my)

	{
		this.my = my;
	}

	void exchange()

	{
		int v = n;
		n = my.get();
		my.set(v);
		my.c++;
	}

	class Class2 {

		private int n;
		int c;

		void inc(int i) {
			n += i;
		}

		int get() {
			return n;
		}

		void set(int n) {
			this.n = n;
		}

		void print()

		{
			System.out.println(n + ":" + c);
		}

		Class1 my;

		Class2(Class1 my) {
			this.my = my;
		}

		void exchange()

		{
			int v = n;
			n = my.get();
			my.set(v);
			my.c++;
		}
	}

}
