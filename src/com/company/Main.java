package com.company;

public class Main {

    public static void main(String[] args) {
        int MAX=10;
        int[] matrix = new int[MAX];
//        int arr[] = {1, 3, 5, 7, 9, 11};
        for (int i=0;i<MAX;i++)
            matrix[i]=getRandomNumberInRange(0,5);
        long start= System.nanoTime();
         NumArray numArray = new NumArray(matrix);
 numArray.sumRange(0, 3);
        System.out.println("Sum of values in given range = "+numArray.sumRange(0, 3));
 numArray.update(1, 10);

 numArray.sumRange(0, 3);
        long finish=System.nanoTime();
        System.out.println("Sum of values after change element "+numArray.sumRange(0, 3));
        System.out.println("FENWICK TREE WITH "+MAX+" elements works "+(finish-start)+" nanoseconds");
    }
    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}
