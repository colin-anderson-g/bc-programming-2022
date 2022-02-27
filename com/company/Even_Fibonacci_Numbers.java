package com.company;

public class Even_Fibonacci_Numbers {
    public static void main(String[] args) {

        int A= 1;
        int B = 2;
        int tmp = 0;
        int sum = 2;

        //System.out.println(A);
        //System.out.println(B);


        while(tmp < 4_000_000){
            tmp = A + B;

            if(tmp % 2 == 0 && tmp < 4_000_000){
                sum += tmp;
            }

            A = B;
            B = tmp;
        }

        System.out.println(sum);
    }
}
