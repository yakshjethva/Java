package DataStructure;

public class MaxMinArray {
    public static void main(String args[]){
        int arr[] = { 12, 1234, 45, 67, 1, -1 , -10 };

        System.out.println(getMin(arr));
        System.out.println(getMax(arr));
    }

    public static int getMin(int arr[]){
        int n = arr.length;
        int min = arr[0];
        for (int i = 0; i < n; i++){
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }

    public static int getMax(int arr[]){
        int n = arr.length;
        int max = arr[0];
        for (int i = 0; i < n; i++){
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}
