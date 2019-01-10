package com.manny;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
	// An ArrayList is a resizable array (handles the resizing automatically). It maintains the size of how many
        // elements and capacity (reserves memory). As elements are added it's capacity grows automatically.

        System.out.println("Print 10 integers:");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Print 12 integers:");
        getInput();
        printArray(baseData);

    }

    private static void getInput(){
        for(int i=0; i < baseData.length; i++)
            baseData[i]= s.nextInt();
    }

    private static void printArray(int[] arr){
        for(int i=0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void resizeArray(){
        int[] original = baseData;

        baseData = new int[12];
        for(int i = 0; i < original.length; i++)
            baseData[i] = original[i];
    }
}
