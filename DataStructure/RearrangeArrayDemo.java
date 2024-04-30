package DataStructure;
import java.util.Arrays;

class ReaarangeArrayDemo {
	
	static void assign(int arr[], int N)
	{
		Arrays.sort(arr);

		int ans[] = new int[N];
		int ptr1 = 0, ptr2 = N - 1;
		for (int i = 0; i < N; i++) {

			if (i % 2 == 0)
				ans[i] = arr[ptr2--];

			else
				ans[i] = arr[ptr1++];
		}

		for (int i = 0; i < N; i++)
			System.out.print(ans[i] + " ");
	}

	public static void main(String args[])
	{
		int arr[] = { 1, 2, 2, 1 };
		int N = arr.length;
		assign(arr, N);
	}
}
