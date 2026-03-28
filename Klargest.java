import java.util.*;
public class Klargest{
    public static int Kthlargest(int [] nums,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.add(num);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int [] nums= new int[n];
        System.out.println("Enter the numbers:");
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        int ans = Kthlargest(nums,k);
        System.out.println("The " + k + " Largest element is: " + ans);
    }
}