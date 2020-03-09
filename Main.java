package com.kruger.brandt;

public class Main {

    private static Long fibBottom(int n){

        if (n == 1 || n == 2)
            return 1L;

        Long[] bottomUp = new Long[n + 1];

        bottomUp[1] = 1L;
        bottomUp[2] = 1L;

        for (int i = 3; i <= n; i++){
            bottomUp[i] = bottomUp[i - 1] + bottomUp[i - 2];
        }

        return bottomUp[n];
    }

    public static void main(String[] args) {

        Long n = fibBottom(35);

        System.out.println(n);
    }
}
