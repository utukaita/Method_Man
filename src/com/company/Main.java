package com.company;

public class Main {

    public static void main(String[] args) {
	    // Homework 1:
        // 1. Procedures make the code look cleaner and easier to understand, they make changing the code easier, and they use hard drive memory better (apparently)
        // 2. A signature is a line that defines a method.
        // 3. The name of the method is foo, the number of parameters is 2, and the return type is int.
        // Homework 2:
        System.out.println("HW 2:");
        for (int i = 1; i < 20; i++) {
            System.out.println(sumUpTo(i));
        }
        // Homework 3:
        System.out.println("HW 3:");
        int[] a = {1, 4, 6, 3};
        int[] b = {-4, 5, 2, 10};
        System.out.println(any(a, b));
        // Homework 4:
        // A nicer prime algorithm can be found in the designated program.
        System.out.println("HW 4:");
        for (int i = 1; i < 100; i++) {
            if (prime(i))
                System.out.println(i);
        }
        int k = 1;
        int n = 1;
        while(k<=100){
            if(prime(n)){
                System.out.println(n);
                k++;
            }
            n++;
        }
        // Homework 5:
        System.out.println("HW 5: ");
        int[] array = {1,3,4,5,4,3,1};
        System.out.println(equal(array, reverse(array)));
        // Homework 6:
        System.out.println("HW 6: ");
        int[] in = {3, 5, 7, 3, 5, 2, 3, 3, -6};
        int x = 3;
        int[] out = {1, 3, 5, 6, 7, 8, 9, 99, 3, 4, 6, 3};
        for (int i: remove(in, x, out))
            System.out.println(i);
        // Homework 7:
        System.out.println("HW 7: ");
        int[] list = {-6, 7, 2, -82, 36, 61, 11};
        for (int i : alternate(list))
            System.out.println(i);
    }
    static int sumUpTo (int n){
        return n*(n+1)/2;
    }
    static boolean contains (int[] array, int value){
        for (int i:array) {
            if (i==value)
                return true;
        }
        return false;
    }
    static boolean any (int[] a, int[] b){
        for (int i:a){
            for (int j:b) {
                if(i==j)
                    return true;
            }
        }
        return false;
    }
    static boolean prime (int n){
        for(int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    static int [] reverse(int[] a){
        int[] reversed = new int[a.length];
        for(int i=0; i<a.length; i++)
            reversed[reversed.length-i-1] = a[i];
        return reversed;
    }
    static boolean equal(int[] a, int[] b){
        if(a.length != b.length)
            return false;
        for(int i = 0; i < a.length; i++){
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
    static int[] remove(int[] in, int x, int[] out){
        int n = 0;
        int[] out2 = new int[out.length];
        for(int i = 0; i < in.length; i++){
            if (in[i] == x)
                n += 1;
            else
                out2[i-n] = in[i];
        }
        return out2;
    }
    static int[] alternate(int[] a){
        int[] returning = new int[a.length];
        for(int i = 0; i < a.length; i++){
            if(i%2==0)
                returning[i]=a[i/2];
            else
                returning[i]=a[returning.length-i/2-1];
        }
        return returning;
    }
}
