import java.util.*;
public class select {
    public static int select(int[] nums,int k){
        int left=0, right=nums.length-1;
        while (left <= right) {
            int mid = (left+right) / 2;
            if(nums[mid] == k){
                return mid;
            }else if(nums[mid] < k){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of nums:");
        int n = sc.nextInt();
        System.out.println("Enter the k value:");
        int k = sc.nextInt();
        System.out.println("Enter the numbers:");
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Index of " + k + " is: " + select(nums,k));
    }
}