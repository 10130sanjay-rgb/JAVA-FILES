import java .util.*;
public class prefix2{
    public static int[] prefix(int[] A, int[] B){
        int n = A.length;
        int[] ans = new int[n];
        int[] frq = new int[n+1];
        int count = 0;
        for(int i=0; i<n; i++){
            frq[A[i]]++;
            if(frq[A[i]]==2){
                count++;
            }
            frq[B[i]]++;
            if(frq[B[i]]==2){
                count++;
            }

            ans[i]=count;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of number:");
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        System.out.println("Enter the num for A:");
        for(int i=0; i<n; i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Enter the num for B:");
        for(int i=0; i<n; i++){
            B[i]=sc.nextInt();
        }
        int[] ans = prefix(A,B);
        System.out.println("The prefix array is:");
        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }
    }
}