package com.bridgelabz;

public class ArrrOddPos {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        for(int i = 0; i < arr.length; i = i + 2){
            System.out.println("Element in odd position:- " + arr[i]);
        }
    }
}
