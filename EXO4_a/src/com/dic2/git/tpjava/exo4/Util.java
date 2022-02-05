package com.dic2.git.tpjava.exo4;

public class Util {

     long fac0(long n) {
        long r=1;
        for(long i=1;i<=n;i++)
            r *= i;
        return r;
    }
     long fac1(long n) {

        if (n>1) return fac1(n-1)*n;
        else return 1;
    }
     long fac2(long n) {
        long r;
        if (n <= 1) r = 1;
        else r = fac2(n - 1) * n;
        return r;
    }
}
