package com.bridgelabz;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50,};
        System.out.println("Orignal array");

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Reverse order");

        for (int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }

    }
}
