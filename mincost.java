import java.util.*;
public class mincost{
    public static  int mincoststep(int[] cost){
        int fir = cost[0];
        int sec = cost[1];
        for(int i=2; i<cost.length; i++){
            int curr = cost[i] + Math.min(fir,sec);
            fir = sec;
            sec = curr; 
        }
        return Math.min(fir,sec);
    }

 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num: ");
    int n = sc.nextInt();
    int[] cost = new int[n];
    System.out.println("Enter cost of step:");
    for(int i=0; i<n; i++){
        cost[i] = sc.nextInt();
    }
    System.out.println("Mincost:" + mincoststep(cost));
 }
}