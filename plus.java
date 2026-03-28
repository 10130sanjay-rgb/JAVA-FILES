import java.util.*;
public class plus {
    public static int[] pluss(int[] nums){
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i] < 9){
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }
        int[] result = new int[nums.length+1];
        result[0] = 1;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of num:");
        int n = sc.nextInt();
        System.out.println("Enter the numbers:");
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int[] output = pluss(nums);
        System.out.println("Result is:");
        for(int num : output)
            System.out.print(num + " ");
    }
}