package DataStructure;

public class FindMissingNumber {
    public static int findMissing(int[] nums) {
        int n = nums.length;
        
        /* Here formula is used 
         * totalSum = 0+1+2+…+(n−1)+n
         * It is used when numbers are in sequence.
         */
        int totalSum = (n * (n + 1)) / 2;
        
        int arraySum = 0;
        for (int num : nums) {
            arraySum += num;
        }
        
        return totalSum - arraySum;
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 0, 1, 4, 6, 2}; 
        int missingNumber = findMissing(nums);
        System.out.println("The missing number is: " + missingNumber);
    }
}

