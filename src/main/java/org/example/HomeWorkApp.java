package org.example;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args)
    {
        homework1();
        homework2();
        homework3();
        homework4();
        homework6();
        homework7();
        homework8();
    }
    public static void homework1()
    {
        int x = 10;
        int y = 10;
        if ((x + y) > 10 && (x + y) <= 20)
        {
            System.out.println(true);
        }
        else System.out.println(false);
        System.out.println();
    }
    public static void homework2()
    {
        int a = 2;
        if (a >= 0)
        {
        System.out.println("Число положительное");
        }
        else System.out.println("Число отрицательное");
        System.out.println();
    }
    public static void homework3()
    {
        int a = 1;
        if (a > 0)
        {
            System.out.println("false");
        }
        else System.out.println("true");
        System.out.println();
    }
    public static void homework4()
    {
        int a = 1;
        String word = "Число-";
        System.out.println(word + a);
        System.out.println();
    }
    public  static void homework6()
    {
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0;  i < array1.length; i++) {
            if (array1[i] == 1) {
                array1[i] = 0;
            } else {
                array1[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
    public static void homework7()
    {
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
            System.out.println(array2[i]);
            System.out.println();
        }
    }
    public static void homework8()
    {
        int[] array3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0;  i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] *=2;
            }
            System.out.println(array3[i]);
        }
    }
}