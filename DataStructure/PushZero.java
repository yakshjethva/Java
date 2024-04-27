package DataStructure;

public class PushZero {
    public static void pushZerosToEnd(int arr[], int n) {
        int count = 0;

        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];

        while (count < n)
            arr[count++] = 0;
    }

    public static void swap(int[] A, int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
        int n = arr.length;
        pushZerosToEnd(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println(""); 
        int[] A = { 5, 6, 0, 4, 6, 0, 9, 0, 8 };
        int number = A.length;
        int j = 0;
        for (int i = 0; i < number; i++) {
            if (A[i] != 0) {
                swap(A, j, i); 
                j++;
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.print(A[i] + " "); 
        }
    }
}
