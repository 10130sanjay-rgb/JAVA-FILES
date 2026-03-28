import java.util.*;
public class hosrob{
    public static int rob(int[] num){
        int prv1=0;
        int prv2=0;
        for(int nums : num){
            int cur = Math.max(prv1,prv2+nums);
            prv2=prv1;
            prv1=cur;
        }
        return prv1;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of number:");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the num:");
        for(int i=0; i<n; i++){
            num[i]=sc.nextInt();
        }
        System.out.println(rob(num));
    }
}