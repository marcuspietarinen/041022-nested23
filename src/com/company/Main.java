package com.company;

public class Main {

    public static void main(String[] args) {
        boolean flag = false;
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = {6, 7, 8, 9, 10};

        for (int n = 0; n < a.length; n++)
            for (int m = 0; m < b.length; m++)
                if (a[n] == b[m])
                    flag = true;

        System.out.println(flag);

        int [] nums = {3, 7, 4};
        int k = 0;
        while (k < 3)
        {
            int l = 0;
            while (l < 3)
            {
                if (k != l)
                    System.out.println(10 * nums[k] + nums[l]);
                l++;
            }
            k++;
        }
    }
}
