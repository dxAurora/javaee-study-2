package com.dexin.dxc;

public class Demo001 {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.test(5);
        System.out.println(aa.jieChen(5));
    }

}

class AA {
    public void test(int n) {
        if (n > 2) {
            test(n - 1);
        } else {
            System.out.println("n=" + n);

        }
    }

    public int jieChen(int n) {
        if (n == 1) {
            return 1;
        } else {
            return jieChen(n - 1) * n;
        }
    }
}
