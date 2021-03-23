package com.example.mymvvcapplication.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Vehicle {
    private double balance;

    public String GetPrice() {
        return "in Vehicle Class";
    }

    public final String VehicleColor = "Red";

    public void withdraw(double amount) throws ArithmeticException {

        String s = "Sachin";
        s.concat(" Tendulkar");//concat() method appends the string at the end
        System.out.println(s);//will print Sachin because strings are immutable objects
        if (amount <= balance) {
            balance -= amount;
        } else {
            double needs = amount - balance;
            throw new ArithmeticException();
        }
    }


    public static void findPair(int[] A, int sum) {
        // create an empty HashMap
        Map<Integer, Integer> map = new HashMap<>();

        // do for each element
        for (int i = 0; i < A.length; i++) {
            // check if pair `(A[i], sum-A[i])` exists

            // if the difference is seen before, print the pair
            if (map.containsKey(sum - A[i])) {
                System.out.println("Pair found at index " +
                        map.get(sum - A[i]) + " and " + i);
                return;
            }

            // store index of the current element in the map
            map.put(A[i], i);
        }

        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }

    public static String FindPairNaive(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int total = arr[i] + arr[j];
                if (total == sum)
                    return "Found";
            }
        }
        return "Not Found";
    }

    public static String FindPairBySort(int[] arr, int sum) {
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int total = arr[low] + arr[high];
            if (total == sum)
                return "Found";
            if (total > sum)
                high--;
            else
                low++;
        }
        return "Not Found";
    }

    public static String FindPairByHash(int[] arr, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsValue(sum - arr[i])) {
                return "Found";
            } else {
                map.put(i, arr[i]);
            }
        }
        return "Not Found";
    }

    public static Boolean hasZeroSumSubarray(int [] arr){
        Set<Integer> MySet = new HashSet<>();
        MySet.add(0);
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum = sum + arr[i];
            if(MySet.contains(sum))
                return true;

            MySet.add(sum);
        }

        return false;
    }
}
