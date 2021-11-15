package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {


    static int duplicates(int arr[], int n){
        if (n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        // Changing original array
        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }
    public static void main (String[] args) {
        int arr[] = {20,100,10,80,70,1,0,-1,2,10,15,300,7,6,2,18,19,21,9,0};
        Arrays.sort(arr);
        int length = arr.length;
        System.out.println("array befor remove duplicates");
        for (int i=0; i<length; i++){
            System.out.print(arr[i]+" ");
    }
        length = duplicates(arr, length);
        //printing array elements
        for (int i=0; i<length; i++){
            System.out.print(arr[i]+" ");}
    }

}


