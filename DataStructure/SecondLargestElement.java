package DataStructure;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        Integer arr[] = { 11,11,11,10 };
        int n = arr.length;
        

        System.out.println("Second largest element in arr without sorting: " + findSecondLargest(arr1));
        print2largest(arr, n);

    }

    /*  
     *  https://www.geeksforgeeks.org/find-second-largest-element-array/ 
     *  This solution is just from geeksforgeeks for the reference 
     *  Time Complexity :  O(n logn) 
    */
    static void print2largest(Integer arr[], int arr_size)
    {
        // Sort the array in descending order
        Arrays.sort(arr, Collections.reverseOrder());
        
        for (int i = 1; i < arr_size; i++) {

            // This is used to check {11,11,11,10} this scenerio
            if (arr[i] != arr[0]) 
            {
                System.out.printf("The second largest element is %d\n", arr[i]);
                return;
            }
        }
        System.out.printf("There is no second largest element\n");
    }

    /*
     *  Without sorting technique, Tracking largest and second largest.
     *  Time Complexity :  O(n), Because it track the varaible in the signle loop.
    */

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("The second largest does not exist.");
        }

        return secondLargest;
    }
}

