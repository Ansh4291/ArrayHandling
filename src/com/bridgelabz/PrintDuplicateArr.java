package com.bridgelabz;

public class PrintDuplicateArr {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 40, 50, 10, 40};

        System.out.println("Duplicate elements in an array ");

        for(int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
              if  (arr[i] == arr[j]){
                  System.out.println("Duplicates Elements in array are print :- " + arr[j]);
              }
            }
        }
    }
}
