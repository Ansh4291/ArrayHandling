package com.bridgelabz;

public class ArrEvenPos {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,9,1,3,5};

        for(int i = 0; i < arr.length; i = i + 2){
            System.out.println("Element in even position:- " + arr[i]);
        }
    }
}
